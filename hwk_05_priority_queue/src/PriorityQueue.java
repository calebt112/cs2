/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Student: Thompson Caleb
 * Description: Homework 05 - PriorityQueue
 */

public class PriorityQueue<E extends HasPriority> extends LinkedList<E> {

    // TODOd: finish the implementation of the method
    public void push(E value) {
        if (isEmpty())
            add(value);
        else {
            Node<E> newNode = new Node<>(value);
            Node<E> current = head;
            Node<E> previous = null;
            while (current != null && current.getValue().getPriority() >= value.getPriority()) {
                previous = current;
                current = current.getNext();
            }
            if (previous == null) {
                newNode.setNext(head);
                head = newNode;
            } else {
                newNode.setNext(current);
                previous.setNext(newNode);
            }
        }
    }

    public E pop() throws Exception {
        if (isEmpty())
            throw new Exception("Queue is empty!");
        Node<E> toBeReturned = head;
        head = head.getNext();
        toBeReturned.setNext(null);
        return toBeReturned.getValue();
    }

    public E peek() throws Exception {
        if (isEmpty())
            throw new Exception("Queue is empty!");
        return head.getValue();
    }
}