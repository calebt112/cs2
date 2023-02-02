public class test {

    public static void main(String[] args) {
        
        int x = 300;
        int y = 420;
        int xnew, ynew;

        xnew = (int) Math.round(x + Math.cos(Math.toRadians(-60)) * 50);
        ynew = (int) Math.round(y + Math.sin(Math.toRadians(-60)) * 50);

        System.out.println(x + " " + y);
        System.out.println(xnew + " " + ynew);
        x = xnew;
        y = ynew;

        System.out.println(xnew + " " + ynew);

    
    }
}
