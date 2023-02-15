/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 02 - Example 1
 */

public class Example1 {

    static int sum(int n) {
        if (n == 1)
            return 1;
        else
            return n + sum(n-1);
    }

    public static void main(String[] args) {
        int sum = 0;
        int n = 10;
        for (int i = 1; i <= n; i++)
            sum += i;
        System.out.println("sum = " + sum);
        System.out.println("sum = " + sum(10));
    }
}
