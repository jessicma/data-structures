public interface MyArrayList<X> {

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
     * Gets the element at the specified index
     * @param index
     * @return the element located at the index
     */
    X get(int index);

    int indexOf(X element);

    /**
     * Adds element to the end of the list
     * @param element element to be added
     */
    void add(X element);

    /**
     * Inserts element at the specified index
     * @param element element to be added
     * @param index index where element is inserted
     */
    void add(X element, int index);

    /**
     * Removes first occurrence of element in the list
     * @param element
     */
    void removeElement(X element);

    /**
     * Removes all occurrences of element from the list
     * @param element
     */
    void removeAll(X element);

    /**
     * Removes the element at the index
     * @param index index of element to remove
     */
    void remove(int index);

    /**
     * Replaces the element at the index in this list with the specified element
     * @param index location of the element to replace
     * @param element element to replace
     */
    void set(int index, X element);

}
