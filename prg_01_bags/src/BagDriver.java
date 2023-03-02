/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Student(s) Name(s):
 * Description: Prg 01 - BagDriver
 */

public class BagDriver {

    // TODO #16: create a bag with items that you would bring to a desert island;
    // your bag cannot be heavier than 30lbs;
    // display your bag (with proud), show whether your bag contains a "firecracker" or "firework" items, and
    // what is the most pricey item in your bag.
    public static void main(String[] args) {
        Bag mybag = new Bag(30);
        mybag.add(new Item("water", 2, 5));
        mybag.add(new Item("food", 2, 5));
        mybag.add(new Item("tools", 2, 15));
        mybag.add(new Item("books", 2, 5));
        mybag.add(new Item("clothes", 2, 5));
        mybag.add(new Item("water", 2, 5));
        mybag.add(new Item("food", 2, 5));
        mybag.add(new Item("tools", 2, 15));
        mybag.add(new Item("books", 2, 5));
        mybag.add(new Item("clothes", 2, 5));
        mybag.add(new Item("books", 2, 5));
        mybag.add(new Item("clothes", 2, 5));
        mybag.add(new Item("water", 2, 5));
        mybag.add(new Item("books", 2, 5));
        mybag.add(new Item("clothes", 2, 5));
        mybag.add(new Item("books", 2, 5));


        System.out.println(mybag);
        System.out.println(mybag.count(new Item("water")));
        System.out.println(mybag.count());
        System.out.println(mybag.price());
        System.out.println(mybag.mostPricey());
        System.out.println(mybag.isEmpty());
        System.out.println();


    }
}
