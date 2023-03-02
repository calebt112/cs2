/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 06 - LinkedListDriver
 */

public class LinkedListDriver {
    public static void main(String[] args) {

//        // Example of node manipulations, manual creation of basic node structure
//        Node<Integer> N1 = new Node(3);
//        Node<Integer> N2 = new Node(5);
//        Node<Integer> N3 = new Node(8);
//
//        // setting next node value (reference only)
//        N1.setNext(N2);
//        N2.setNext(N3);
//
//        // reference start, end, current list values
//        Node<Integer> head = N1;
//        Node<Integer> tail = N3;
//        Node<Integer> current = head;
//
//        while (current != null) {
//            System.out.print(current + " ");
//            current = current.getNext();
//            }

//        //This does the same as above
//        LinkedList<Integer> ll = new LinkedList<>();
//        ll.append(3);
//        ll.append(5);
//        ll.append(8);
//        System.out.println(ll);

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(8);
        ll.add(5);
        ll.add(3);
        ll.add(10);
        ll.add(13);


        Iterator<Integer> it = ll.iterator();
        while (true) {
            Integer value = it.next();
            if (value == null)
                break;
            System.out.println(value + " ");
        }
    }
}
