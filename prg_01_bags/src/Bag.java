/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Student(s) Name(s): Caleb Thompson
 * Description: Prg 01 - Bag (a linked list of Item elements)
 */

import java.util.Iterator;
public class Bag {

    private Node<Item> head;        // the head of the list of items
    private double weightLimit; // the maximum weight of the bag
    private double weight;      // the (current) weight of the bag

    public static int DEFAULT_WEIGHT_LIMIT = 50;

    // TODOd #3: set weightLimit to DEFAULT_WEIGHT_LIMIT if provided value is less than or equal to zero;
    // set head to null; and weight to zero
    public Bag(double weightLimit) {
        if (weightLimit <= 0)
            this.weightLimit = DEFAULT_WEIGHT_LIMIT;
        else
            this.weightLimit = weightLimit;
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
        if (current == null)
            return true;
        return false;
    }

    // TODOd #6: return the (current) weight of the bag
    public double weight() {
        Node<Item> current = head;
        double totalWeight = 0;
        if (current == null)
            return 0;
        else {
            while (current != null) {
                totalWeight += current.getValue().getWeight();
                current = current.getNext();
            }
        }
        return totalWeight;
    }

    // TODOd #7: return the weight limit of the bag
    public double weightLimit() {
        return weightLimit;
    }

    // TODOd #8: add the given item to the bag only if it doesn't make the bag heavier than its weight limit;
    // item added always becomes the new head node; return true if operation is successful; false otherwise
    public boolean add(final Item item) {
        Node<Item> newNode = new Node<Item>(item);
        if (weight() + item.getWeight() > weightLimit)
            return false;
        else {
            newNode.setNext(head);
            head = newNode;
            weight += item.getWeight();
            return true;
        }
    }

    // TODOd #9: return the total number of items in the bag
    public int count() {
        Node<Item> current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    // TODOd #10: return the number of items that are equal to the given item
    public int count(final Item item) {
        Node<Item> current = head;
        int count = 0;
        while (current != null) {
            if (current.getValue().equals(item))
                count++;
            current = current.getNext();
        }
        return count;
    }

    // TODOd #11: return the total price of the bag (i.e., the sum of the prices of all items in the bag);
    // if the bag is empty, return zero
    public int price() {
        Node<Item> current = head;
        int total = 0;
        if (current == null)
            return 0;
        else {
            while (current != null) {
                total += current.getValue().getPrice();
                current = current.getNext();
            }
            return total;
        }
    }

    // TODOd #12: return a reference to the most pricey item in the bag;
    // if the bag has multiple most pricey items, return the first one found;
    // if the bag is empty, return null
    public Item mostPricey() {
        Node<Item> current = head;
        Node<Item> mostPricey = head;
        if (current == null)
            return null;
        else {
            while (current != null) {
                if (current.getValue().compareTo(mostPricey.getValue()) > 0) {
                    mostPricey = current;
                    current = current.getNext();
                } else
                    current = current.getNext();
            }
            return mostPricey.getValue();
        }
    }


    // TODOd #13: return true/false depending on whether the item is in the bag or not
    public boolean contains(final Item item) {
        Node<Item> current = head;
        while (current != null) {
            if (current.getValue().equals(item))
                return true;
            current = current.getNext();
        }
        return false;
    }

    // TODOd #14: remove the first occurrence of the item from the bag;
    // return true if operation is successful; false otherwise
    public boolean remove(final Item item) {
        Node<Item> current = head;
        Node<Item> toRemove = head;
        boolean removed = false;

        if (isEmpty())
            return false;

        if (head.getValue().equals(item)) {
            head = head.getNext();
            current.setNext(null);
            removed = true;
        }

        while (current != null) {
            if (current.getNext() == null)
                break;

            if (current.getNext().getValue().equals(item)) {
                toRemove = current.getNext();
                current.setNext(toRemove.getNext());
                toRemove.setNext(null);
                removed = true;
            }
            current = current.getNext();
        }
        return removed;
    }



    // TODOd #15: remove ALL occurrences of the item from the bag;
    // return true if operation is successful; false otherwise
    public boolean removeAll(final Item item) {
        Node<Item> current = head;
        Node<Item> toRemove = head;
        Node<Item> previous = head;

        if (isEmpty()) {
            return false;
        }
        while(current != null) {
            if (current.getValue().equals(item)) {
                if (current == head) {
                    head = head.getNext();
                    current.setNext(null);
                    current = head;
                } else {
                    previous.setNext(current.getNext());
                    current.setNext(null);
                    current = previous.getNext();
                }
            } else {
                previous = current;
                current = current.getNext();
            }
        }
        return true;
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
