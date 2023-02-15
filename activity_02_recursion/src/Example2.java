/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 02 - Example 2
 */
public class Example2 {

    // TODOd
    static void seq(int an, int r, int n, int i) {
        if (i <= n) {
            System.out.print(an + " ");
            seq(an * r, r, n, i + 1);
        }
    }

    public static void main(String[] args) {
        int an = 2;
        int r = 2;
        int n = 10;
        for (int i = 1; i <= n; i++) {
            System.out.print(an + " ");
            an *= r;
        }
        System.out.println();
         seq(2, r, n, 1);
    }
}
