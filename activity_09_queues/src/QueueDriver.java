/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 09 - QueueDriver
 */

public class QueueDriver {

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        System.out.println(queue);
        try {
            System.out.println(queue.pop());
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
        queue.push(5);
        queue.push(3);
        queue.push(8);
        System.out.println(queue);
//        while (!queue.isEmpty()) {
//            try {
//                System.out.println(queue.pop());
//            } catch (Exception ex) {
//                System.out.println(ex);
//            }
//        }
        // use the iterator to show all of the elements of the queue!
        for (int el: queue)
            System.out.print(el + " ");
    }
}
