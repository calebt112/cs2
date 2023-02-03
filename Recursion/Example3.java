/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 02 - Example 3
 */

public class Example3 {

    //
    static int fibo(int n) {
        if (n <= 2)
            return 1;
        else
            return fibo(n-1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        int a = 1;
        int b = 1;
        for (int i = 3; i <= n; i++) {
            int an = a + b;
            a = b;
            b = an;
        }

        for (int i = 1; i <= 10; i++){
            System.out.println(fibo(i));
        }

    }
}