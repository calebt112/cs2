/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 07 - LinkedList
 */

import java.util.*;

public class LinkedList<E> implements Iterable<E> {

    protected Node<E> head;

    public LinkedList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void append(E value) {
        Node<E> newNode = new Node<>(value);
        if (isEmpty())
            head = newNode;
        else {
            Node<E> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void add(E value) {
        Node<E> newNode = new Node<>(value);
        newNode.setNext(head);
        head = newNode;
    }

    @Override
    public String toString() {
        String out = "";
        Node<E> current = head;
        while (current != null) {
            out += current + " ";
            current = current.getNext();
        }
        return out.strip();
    }

    public int size() {
        int count = 0;
        Node<E> current = head;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    public E get(int index) {
        if (index < 0 || isEmpty())
            throw new ArrayIndexOutOfBoundsException();
        Node<E> current = head;
        for (int i = 0; i < index && current != null; i++)
            current = current.getNext();
        if (current == null)
            throw new ArrayIndexOutOfBoundsException();
        return current.getValue();
    }

    // TODO: set value to location at index
    public void set(int index, E value) {
        if (index < 0 || isEmpty())
            throw new ArrayIndexOutOfBoundsException();
        Node<E> current = head;
        for (int i = 0; i < index && current != null; i++)
            current = current.getNext();
        if (current == null)
            throw new ArrayIndexOutOfBoundsException();
        current.setValue(value);
    }

    // TODO: insert value at the given index location
    // throw an exception if index is invalid
    public void insert(int index, E value) {
        if (index < 0 || isEmpty())
            throw new ArrayIndexOutOfBoundsException();
        // special case (index = 0)
        if (index == 0)
            add(value);
        else {
            Node<E> current = head;
            for (int i = 0; i < index - 1 && current.getNext() != null; i++)
                current = current.getNext();
            if (current.getNext() == null)
                throw new ArrayIndexOutOfBoundsException();
            Node<E> newNode = new Node(value);
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
    }

    // TODO: removes the element at the given index location
    // throw an exception if index is invalid
    public void remove(int index) {
        if (index < 0 || isEmpty())
            throw new ArrayIndexOutOfBoundsException();
        // special case (index = 0)
        if (index == 0) {
            Node<E> toBeRemoved = head;
            head = head.getNext();
            toBeRemoved.setNext(null);
        }
        else {
            Node<E> current = head;
            for (int i = 0; i < index - 1 && current.getNext() != null; i++)
                current = current.getNext();
            if (current.getNext() == null)
                throw new ArrayIndexOutOfBoundsException();
            Node<E> toBeRemoved = current.getNext();
            current.setNext(toBeRemoved.getNext());
            toBeRemoved.setNext(null);
        }
    }

    public Iterator<E> iterator() {
        return new Iterator<E>() {

            private Node<E> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                if (current != null) {
                    E value = current.getValue();
                    current = current.getNext();
                    return value;
                }
                return null;
            }
        };
    }
}
