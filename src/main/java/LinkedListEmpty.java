public class LinkedListEmpty<X> extends ALinkedList<X> {

    public LinkedListEmpty() {
    }

    public int size() {
        return 0;
    }

    public Boolean contains(Object element) {
        return false;
    }

    public Boolean isEmpty() {
        return true;
    }

    public MyLinkedList<X> add(X element) {
        return new LinkedListNonEmpty<X>(element, this);
    }

    public MyLinkedList removeElement(X element) {
        throw new IllegalArgumentException("Element not found in list");
    }


}
