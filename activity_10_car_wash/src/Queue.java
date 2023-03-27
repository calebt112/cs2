/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 09 - Queue
 */

public class Queue<E> extends LinkedList<E> {

    // TODOd: implement method push for a queue
    public void push(E value) {
        append(value);
    }

    // TODOd: implement method pop for a queue
    public E pop() throws Exception {
        if (isEmpty())
            throw new Exception("Queue is empty!");
        Node<E> toPop = head;
        head = head.getNext();
        toPop.setNext(null);
        return toPop.getValue();
    }

}