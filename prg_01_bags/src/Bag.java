/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Student(s) Name(s):
 * Description: Prg 01 - Bag (a linked list of Item elements)
 */


public class Bag {

    private Node<Item> head;        // the head of the list of items
    private double     weightLimit; // the maximum weight of the bag
    private double     weight;      // the (current) weight of the bag

    public static int DEFAULT_WEIGHT_LIMIT = 50;

    // TODO #3: set weightLimit to DEFAULT_WEIGHT_LIMIT if provided value is less than or equal to zero;
    // set head to null; and weight to zero
    public Bag(double weightLimit) {

    }

    // TODO #4: same as constructor above, setting weightLimit to DEFAULT_WEIGHT_LIMIT
    public Bag() {

    }

    // TODO #5: return true/false depending on whether the bas is empty of not
    public boolean isEmpty() {
        return false;
    }

    // TODO #6: return the (current) weight of the bag
    public double weight() {
        return 0;
    }

    // TODO #7: return the weight limit of the bag
    public double weightLimit() {
        return 0;
    }

    // TODO #8: add the given item to the bag only if it doesn't make the bag heavier than its weight limit;
    // item added always becomes the new head node; return true if operation is successful; false otherwise
    public boolean add(final Item item) {
        return false;
    }

    // TODO #9: return the total number of items in the bag
    public int count() {
        return 0;
    }

    // TODO #10: return the number of items that are equal to the given item
    public int count(final Item item) {
        return 0;
    }

    // TODO #11: return the total price of the bag (i.e., the sum of the prices of all items in the bag);
    // if the bag is empty, return zero
    public int price() {
        return 0;
    }

    // TODO #12: return a reference to the most pricey item in the bag;
    // if the bag has multiple most pricey items, return the first one found;
    // if the bag is empty, return null
    public Item mostPricey() {
       return null;
    }

    // TODO #13: return true/false depending on whether the item is in the bag or not
    public boolean contains(final Item item) {
        return false;
    }

    // TODO #14: remove the first occurrence of the item from the bag;
    // return true if operation is successful; false otherwise
    public boolean remove(final Item item) {
        return false;
    }

    // TODO #15: remove ALL occurrences of the item from the bag;
    // return true if operation is successful; false otherwise
    public boolean removeAll(final Item item) {
        return false;
    }

    @Override
    public String toString() {
        if (isEmpty())
            return "An empty bag!";
        String out = "A $" + price() + "/" + String.format("%.2f", weight) + "lb with the following items: ";
        Node<Item> current = head;
        while (current != null) {
            out += current + " ";
            current = current.getNext();
        }
        return out.strip();
    }
}
