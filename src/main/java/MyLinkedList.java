public interface MyLinkedList<X> {

    /**
     * @return number of elements in the list
     */
    int size();

    /**
     * @param element
     * @return true if list contains element, false otherwise
     */
    Boolean contains(X element);

    /**
     *
     * @return true if empty, false otherwise
     */
    Boolean isEmpty();

    /**
     * Returns new list with element to the end of the list
     * @param element element to be added
     */
    MyLinkedList<X> add(X element);

    /**
     * Returns a new list with the first occurrence of specified element removed
     * @param element
     */
    MyLinkedList removeElement(X element);

}
