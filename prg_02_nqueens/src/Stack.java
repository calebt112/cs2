/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Student(s):
 * Description: Prg 02 - Stack
 */

public class Stack<E> extends LinkedList<E> {

    public void push(E value) {
        add(value);
    }

    public E pop() throws Exception {
        if (isEmpty())
            throw new Exception("Stack is empty!");
        Node<E> toBeReturned = head;
        head = head.getNext();
        toBeReturned.setNext(null);
        return toBeReturned.getValue();
    }
}