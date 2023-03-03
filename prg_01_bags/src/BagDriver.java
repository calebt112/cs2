/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Student(s) Name(s): Caleb Thompson
 * Description: Prg 01 - BagDriver
 */

public class BagDriver {

    // TODOd #16: create a bag with items that you would bring to a desert island;
    // your bag cannot be heavier than 30lbs;
    // display your bag (with proud), show whether your bag contains a "firecracker" or "firework" items, and
    // what is the most pricey item in your bag.
    public static void main(String[] args) {

        Bag mybag = new Bag(30);

        mybag.add(new Item("Water", 1, 5));
        mybag.add(new Item("Book", 2,10 ));
        mybag.add(new Item("Flare", 1, 20));
        mybag.add(new Item("Ipod", 1, 100));
        mybag.add(new Item("Food", 5, 20));
        mybag.add(new Item("Cat", 9, 35));
        mybag.add(new Item("Water", 1, 5));
        mybag.add(new Item("Tools", 10, 50));

        System.out.println(mybag);
        System.out.println(mybag.mostPricey());
        System.out.println("My bag has a firecracker: " + mybag.contains(new Item("Firecracker")));

    }
}
