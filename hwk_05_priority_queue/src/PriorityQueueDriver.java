/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Homework 05 - PriorityQueueDriver
 */

public class PriorityQueueDriver {

    public static void main(String[] args) throws Exception {

        PriorityQueue<Customer> pq = new PriorityQueue<>();
        System.out.println(pq);
        pq.push(new Customer("Daisy"));
        System.out.println(pq);
        pq.push(new Customer("Donald"));
        System.out.println(pq);
        pq.push(new Customer("Scrooge", 3));
        System.out.println(pq);
        pq.push(new Customer("Huey", 2));
        System.out.println(pq);
        pq.pop();
        System.out.println(pq);
        pq.push(new Customer("Dewey", 2));
        System.out.println(pq);
        pq.push(new Customer("Louie", 2));
        System.out.println(pq);
        pq.pop(); pq.pop(); pq.pop();
        System.out.println(pq);
        pq.push(new Customer("Von Drake", 1));
        System.out.println(pq);
        pq.pop(); pq.pop();
        System.out.println(pq);
    }
}
