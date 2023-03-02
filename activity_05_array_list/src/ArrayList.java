/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 05 - ArrayList
 */

public class ArrayList<E> {

    // internal array to hold the elements
    private E data[];

    // variable to control how many elements are in the array list
    private int size;

    private static final int INITIAL_CAPACITY = 10;
    private static final int MIN_CAPACITY     = 2;

    // enables the creation of an array list with INITIAL_CAPACITY and size zero
    public ArrayList() {
        size = 0;
        data = (E[]) new Object[INITIAL_CAPACITY];
    }

    // enables the creation of an array list with given capacity and size zero
    public ArrayList(int capacity) {
        size = 0;
        if (capacity < MIN_CAPACITY)
            data = (E[]) new Object[INITIAL_CAPACITY];
        else
            data = (E[]) new Object[capacity];
    }

    // TODOd: return true/false depending whether the list is empty or not
    public boolean isEmpty() {
        return size == 0;
    }

    // TODOd: return true/false depending whether the list is at capacity or not
    public boolean isFull() {
        return size == data.length;
    }

    // TODOd: add a new element (with the value) at the end of the list!
    // if list is full, increase the capacity of the array by INITIAL_CAPACITY before appending
    public void append(E value) {
        if (isFull()) {
            E newData[] = (E[]) new Object[data.length + INITIAL_CAPACITY];
            for (int i = 0; i < data.length; i++)
                newData[i] = data[i];
            data = newData;
        }
        data[size++] = value;
    }

    // TODOd: add a new element (with the value) in front of the list!
    // if list is full, increase the capacity of the array by INITIAL_CAPACITY before adding

    public void add(E value) {
        if (isFull()) {
            E newData[] = (E[]) new Object[data.length + INITIAL_CAPACITY];
            // copy AND shift
            for (int i = 0; i < data.length; i++) {
                newData[i+1] = data[i];
            data = newData;
        }
        // just shift
            for (int i = size-1; i >= 0; i--)
                data[i+1] = data[i];
        data[0] = value;
        size++;
    }

    // TODOd: return a string representation of the array list
        public String toString() {
        String out = "";
        for (int i = 0; i < size; i++)
            out += data[i] + " ";
        return out.strip();
    }

    // TODOd: return the number of elements
    public int size() {
        return size;
    }

    // TODOd: return the element located at the given index
    public E get(int index) {
//        if(index < 0 || index >= size)                        //array index out of bounds thrown automatically.
//            throw new ArrayIndexOutOfBoundsException();       // can insert own message ("Index out of bounds").
        return data[index];
    }

    // TODOd: set value to location at index
    public void set(int index, E value) {
        data[index] = value;
    }

    // TODO: insert value at the given index location
    // throw an exception if index is invalid
    public void insert(int index, E value) {
        if(index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");

        if (isFull()) {
            E newData[] = (E[]) new Object[data.length + INITIAL_CAPACITY];

            for (int i = 0; i < data.length; i++) {
                newData[i+1] = data[i];
                data = newData;
            }
            data[0] = value;
            size++;

        } else
            for (int i = size-1; i >= index; i--)
                data[i+1] = data[i];

            data[index] = value;
                        size++;
        }


    }

    // TODO: removes the element at the given index location
    // throw an exception if index is invalid
    public void remove(int index) {
        if(index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        // shift only
        for (int i = index; i < size-1; i++)
            data[i] = data[i+1];
        size--;
    }
}
