import static org.junit.jupiter.api.Assertions.*;

class MyArrayListImplTest {

    private MyArrayList<Integer> emptyList;
    private MyArrayList<Integer> nonEmptyList;
    private MyArrayList<Integer> listWithDuplicates;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        emptyList = new MyArrayListImpl();
        Integer[] list = {0, 2, 4, 6, 8};
        nonEmptyList = new MyArrayListImpl<Integer>(list, 5);
        list = new Integer[]{0, 2, 4, 6, 8, 4, 2, 4};
        listWithDuplicates = new MyArrayListImpl<Integer>(list, 8);
    }

    @org.junit.jupiter.api.Test
    void size() {
        assertEquals(0, emptyList.size());
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        assertTrue(emptyList.isEmpty());
        assertFalse(nonEmptyList.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void contains() {
        assertTrue(nonEmptyList.contains(6));
        assertFalse(nonEmptyList.contains(5));
    }

    @org.junit.jupiter.api.Test
    void get() {
        assertEquals(4, nonEmptyList.get(2));
    }

    @org.junit.jupiter.api.Test
    void getIndex() {
        assertEquals(1, nonEmptyList.indexOf(2));
    }

    @org.junit.jupiter.api.Test
    void addWithIndex() {
        nonEmptyList.add(9, 2);
        assertEquals(6, nonEmptyList.size());
        assertEquals(9, nonEmptyList.get(2));
        assertEquals(2, nonEmptyList.get(1));
        assertEquals(4, nonEmptyList.get(3));
    }

    @org.junit.jupiter.api.Test
    void addAtEnd() {
        nonEmptyList.add(9);
        assertEquals(6, nonEmptyList.size());
        assertEquals(9, nonEmptyList.get(5));
    }

    @org.junit.jupiter.api.Test
    void remove() {
        nonEmptyList.remove(2);
        assertEquals(4, nonEmptyList.size());
        assertFalse(nonEmptyList.contains(4));
    }

    @org.junit.jupiter.api.Test
    void removeElement() {
        nonEmptyList.removeElement(6);
        assertEquals(4, nonEmptyList.size());
        assertFalse(nonEmptyList.contains(6));

        listWithDuplicates.removeElement(2);
        assertEquals(7, listWithDuplicates.size());
        assertTrue(listWithDuplicates.contains(2));
    }

    @org.junit.jupiter.api.Test
    void removeAll() {
        listWithDuplicates.removeAll(4);
        assertEquals(5, listWithDuplicates.size());
        assertFalse(listWithDuplicates.contains(4));
    }

    @org.junit.jupiter.api.Test
    void set() {
        assertEquals(6, nonEmptyList.get(3));
        nonEmptyList.set(3, 9);
        assertEquals(9, nonEmptyList.get(3));
    }

}