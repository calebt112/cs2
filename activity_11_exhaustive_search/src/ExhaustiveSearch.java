/*
 * CS 2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 11 - Exhaustive Search
 */

// Goal: to search for all of the combinations of letters with a given size
public class ExhaustiveSearch {

    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    static void search(int n) {

        Queue<String> queue = new Queue<>();
        for (int i = 0; i < ALPHABET.length(); i++)
            queue.push(ALPHABET.charAt(i) + "");
        while (!queue.isEmpty()) {
            try {
                String str = queue.pop();
                if (str.length() == n)
                    System.out.println(str);
                else
                    for (int i = 0; i < ALPHABET.length(); i++)
                        queue.add(str + ALPHABET.charAt(i));
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }


//        Stack<String> stack = new Stack<>();
//        for (int i = ALPHABET.length() - 1; i >= 0; i--)
//            stack.push(ALPHABET.charAt(i) + "");
//        while (!stack.isEmpty()) {
//            try {
//                String str = stack.pop();
//                if (str.length() == n)
//                    System.out.println(str);
//                else
//                    for (int i = ALPHABET.length() - 1; i >= 0; i--)
//                        stack.push(str + ALPHABET.charAt(i));
//            } catch (Exception ex) {
//                System.out.println(ex);
//            }
//        }
//    }

    public static void main(String[] args) {
        search(3);
    }
}
