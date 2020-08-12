public class LinkedListNonEmpty<X> extends ALinkedList<X> {

    private X value;
    private MyLinkedList<X> rest;

    public LinkedListNonEmpty(X value, MyLinkedList<X> rest) {
        this.value = value;
        this.rest = rest;
    }

    public int size() {
        return 1 + rest.size();
    }

    public Boolean contains(X element) {
        return value.equals(element) || rest.contains(element);
    }

    public Boolean isEmpty() {
        return false;
    }

    public MyLinkedList<X> add(X element) {
        return rest.add(element);
    }

    public MyLinkedList removeElement(X element) {
        if(value.equals(element)) {
            return rest;
        } else {
            return new LinkedListNonEmpty(value, rest.removeElement(element));
        }
    }


}
