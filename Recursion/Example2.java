public class Example2 {

    // Todo
    static void seq(int an, int r, int n, int i) {

    }

    public static void main(String[] args) {
        int an = 2;
        int r = 2;
        int n = 10;
        for (int i = 1; i <= n; i++) {
            System.out.print(an + " ");
            an *= r;
        }
    }
}