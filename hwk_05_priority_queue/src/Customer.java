/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Homework 05 - Customer
 */

public class Customer implements HasPriority {

    private String name;
    private int    priority;

    private static final int SMALLEST_PRIORITY = 0;

    public Customer(String name, int priority) {
        this.name = name;
        if (priority < SMALLEST_PRIORITY)
            this.priority = SMALLEST_PRIORITY;
        else
            this.priority = priority;
    }

    public Customer(String name) {
        this(name, SMALLEST_PRIORITY);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "{" + name + "," + priority + "}";
    }

    @Override
    public boolean equals(Object obj) {
        Customer other = (Customer) obj;
        return name.equals(((Customer) obj).name) && priority == other.priority;
    }
}
