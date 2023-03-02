/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 06 - LinkedList
 */

public class LinkedList<E> {

    private Node<E> head;

    public LinkedList() {
        head = null;

    }

    public boolean isEmpty(){
        return head == null;
    }

    public void append(E value){
        Node<E> newNode = new Node(value);
        if(isEmpty()){
            head = newNode;
        }
        else{
            Node<E> current = head;
            while(current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void add(E value){
        Node<E> newNode = new Node(value);
        newNode.setNext(head);
        head = newNode;
    }

    @Override
    public String toString(){
        String out = "";
        Node<E> current = head;
        while(current != null){
            out += current.toString() + " ";
            current = current.getNext();
        }
        return out.strip();
    }

    public int size(){
        Node<E> current = head;
        int count = 0;
        while(current != null){
            count++;
            current = current.getNext();
        }
        return count;
    }

    public E get(int index) {
        if (index < 0)
            throw new ArrayIndexOutOfBoundsException();
        Node<E> current = head;
        for (int i = 0; i < index && current != null; i++)
            current = current.getNext();
        if (current == null)
            throw new ArrayIndexOutOfBoundsException();
        return current.getValue();
    }

    public void set(int index, E value){
        if (index < 0 || isEmpty())
            throw new ArrayIndexOutOfBoundsException();
        Node<E> current = head;
        for(int i = 0; i < index && current != null; i++)
            current = current.getNext();
        if(current == null)
            throw new ArrayIndexOutOfBoundsException();
        current.setValue(value);
    }

    public void insert(int index, E value){
        if(index < 0 || isEmpty())
            throw new ArrayIndexOutOfBoundsException();

        Node<E> newNode = new Node(value);
        if(index == 0){
            add(value);
        }
        else{
            Node<E> current = head;
            for(int i = 0; i < index - 1 && current.getNext() != null; i++)
                current = current.getNext();
            if (current.getNext() == null)
                throw new ArrayIndexOutOfBoundsException();

            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
    }

    public void remove(int index){
        if(index < 0 || isEmpty())
            throw new ArrayIndexOutOfBoundsException();
        if(index == 0){
            Node<E> toRemove = head;
            head = head.getNext();
            toRemove.setNext(null);
        }
        else{
            Node<E> current = head;
            Node<E> toRemove = null;

            for(int i = 0; i < index - 1 && current.getNext() != null; i++)
                current = current.getNext();

            if(current.getNext() == null)
                throw new ArrayIndexOutOfBoundsException();

            toRemove = current.getNext();
            current.setNext(toRemove.getNext());
            toRemove.setNext(null);
        }
    }

    public Iterator<E> iterator() {
        Iterator<E> it = new Iterator(head);
        return it;
        //return new Iterator(head);
    }
}