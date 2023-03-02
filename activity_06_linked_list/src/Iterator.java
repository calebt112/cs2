public class Iterator<E> {

    private Node<E> current;

    public Iterator(Node<E> head) {
        current = head;
    }

    public E next() {
        if(current != null) {
            //
            E value = current.getValue();
            current = current.getNext();
            return value;
        }
        return null;
    }

}
