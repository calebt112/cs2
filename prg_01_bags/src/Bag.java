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

    // TODOd #3: set weightLimit to DEFAULT_WEIGHT_LIMIT if provided value is less than or equal to zero;
    // set head to null; and weight to zero
    public Bag(double weightLimit) {
        if(weightLimit <= 0)
            this.weightLimit = DEFAULT_WEIGHT_LIMIT;
        head = null;
        weight = 0;
    }

    // TODOd #4: same as constructor above, setting weightLimit to DEFAULT_WEIGHT_LIMIT
    public Bag() {
        weightLimit = DEFAULT_WEIGHT_LIMIT;
        head = null;
        weight = 0;
    }

    // TODOd #5: return true/false depending on whether the bag is empty of not
    public boolean isEmpty() {
        Node<Item> current = head;
        if(current == null)
            return true;
        return false;
    }

    // TODOd #6: return the (current) weight of the bag
    public double weight() {
        Node<Item> current = head;
        while(current != null){
            weight += current.getValue().getWeight();
            current = current.getNext();
        }
        return weight;
    }

    // TODOd #7: return the weight limit of the bag
    public double weightLimit() {
        return weightLimit;
    }

    // TODO #8: add the given item to the bag only if it doesn't make the bag heavier than its weight limit;
    // item added always becomes the new head node; return true if operation is successful; false otherwise
    public boolean add(final Item item) {
        Node<Item> newNode = new Node<Item>(item);
        if(weight() + item.getWeight() > weightLimit)
            return false;
        else{
            newNode.setNext(head);
            head = newNode;
            return true;
        }
    }

    // TODO #9: return the total number of items in the bag
    public int count() {
        Node<Item> current = head;
        int count = 0;
        while(current != null){
            count++;
            current = current.getNext();
        }
        return count;
    }

    // TODO #10: return the number of items that are equal to the given item
    public int count(final Item item) {
        Node<Item> current = head;
        int count = 0;
        while(current != null){
            if(current.getValue().equals(item))
                count++;
            current = current.getNext();
        }
        return count;
    }

    // TODO #11: return the total price of the bag (i.e., the sum of the prices of all items in the bag);
    // if the bag is empty, return zero
    public int price() {
        Node<Item> current = head;
        int price = 0;
        while(current != null){
            price += current.getValue().getPrice();
            current = current.getNext();
        }
        return price;
    }

    // TODO #12: return a reference to the most pricey item in the bag;
    // if the bag has multiple most pricey items, return the first one found;
    // if the bag is empty, return null
    public Item mostPricey() {
        Node<Item> current = head;
        Node<Item> mostPricey = head;
       if(current == null)
           return null;
       else {
           while (current != null) {
               if (current.getValue().compareTo(mostPricey.getValue()) < 0) {
                   mostPricey = current;
                   current = current.getNext();
               } else
                   current = current.getNext();
           }
           return mostPricey.getValue();
       }
    }


    // TODO #13: return true/false depending on whether the item is in the bag or not
    public boolean contains(final Item item) {
        Node<Item> current = head;
        while(current != null){
            if(current.getValue().equals(item))
                return true;
            current = current.getNext();
        }
        return false;
    }

    // TODO #14: remove the first occurrence of the item from the bag;
    // return true if operation is successful; false otherwise
    public boolean remove(final Item item) {
        Node<Item> current = head;
        Node<Item> previous = null;
        while(current != null){
            if(current.getValue().equals(item)){
                if(previous == null)
                    head = current.getNext();
                else
                    previous.setNext(current.getNext());
                current = current.getNext();
                return true;
            }
            current = current.getNext();
        }
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
