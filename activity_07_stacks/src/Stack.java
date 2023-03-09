/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 07 - Stack
 */

public class Stack<E> extends LinkedList<E> {

    // TODO #1: implement the push method
    public void push(E value) {
        add(value);
    }

    // TODO #2: implement the pop method
    public E pop() throws Exception {
        if (isEmpty())
            throw new Exception("Stack is empty!");
        Node<E> value = head;
        head = head.getNext();
        value.setNext(null);
        return value.getValue();
    }

}