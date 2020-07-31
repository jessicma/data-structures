
public class MyArrayListImpl<X> implements MyArrayList<X>{

    private X[] list;
    private int size; // number of (non-null) elements in list

    public MyArrayListImpl() {
        this.size = 0;
        this.list = (X[]) new Object[10];
    }

    public MyArrayListImpl(int initialCapacity) {
        this.size = 0;
        this.list = (X[]) new Object[initialCapacity];
    }

    public MyArrayListImpl(X[] list, int size) {
        this.list = list;
        this.size = size;
    }

    public int size() {
        return size;
    }

    public Boolean isEmpty() {
        return size == 0;
    }

    public Boolean contains(X element) {
        Boolean result = false;
        for(int i = 0; i < size; i++) {
            result = result || element.equals(list[i]);
        }

        return result;
    }

    public X get(int index) {
        return list[index];
    }

    public int indexOf(X element) {
        for(int i = 0; i < list.length; i++) {
            if(element.equals(list[i])) {
                return i;
            }
        }
        throw new IllegalArgumentException("Input element not in list");
    }

    public void add(X element) {
        resize();
        list[size] = element;
        size = size + 1;
    }

    public void add(X element, int index) {
        resize();
        for(int i = size; i > index; i--) {
            list[i] = list[i-1];
        }
        list[index] = element;
        size = size + 1;
    }

    public void removeElement(X element) {
        remove(indexOf(element));
    }

    public void removeAll(X element) {
        int i = 0;
        while(i < size) {
            if(element.equals(list[i])) {
                remove(i);
            } else {
                i++;
            }
        }
    }

    public void remove(int index) {
        size = size - 1;
        for(int i = index; i < size; i++) {
            list[i] = list[i+1];
        }
    }

    public void set(int index, X element) {
        list[index] = element;
    }

    private void resize() {
        if(list.length == size) {
            X[] newList = (X[]) new Object[size * 2];
            for(int i = 0; i < size; i++) {
                newList[i] = list[i];
            }
            list = newList;
        }
    }


}
