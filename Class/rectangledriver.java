public class rectangledriver {
    public static void main(String[] args) {
        
        rectangle r1 = new rectangle(2, 3);
        
        System.out.println("Area: " + r1.area());

        rectangle r2 = new rectangle();

        System.out.println("Area: " + r2.area());
        System.out.println("Perimeter: " + r2.perimeter());

        rectangle r3 = new rectangle(-10, 5);
        System.out.println("Area: " + r3.area());
        }    
}
