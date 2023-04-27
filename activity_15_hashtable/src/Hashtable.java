/*
 * CS 2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 15 - Hashtable
 */

import java.util.Arrays;
import java.util.Iterator;

public class Hashtable<K,V> implements Iterable<V> {

    private static final int SIZE = 11;
    private HashNode<K, V> table[];

    public Hashtable() {
        table = new HashNode[SIZE];
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % SIZE;
    }

    // TODOd: implement method below
    public void put(K key, V value) {
        // index is value returned by hash function, which is the index of the array
        int index = hash(key);
        // current is a reference to the linked list of the index
        HashNode<K, V> current = table[index];
        // boolean flag to indicate if key was found
        boolean found = false;
        // traverse the linked list looking for the key
        while (current != null) {
            // if key is found, update the value and set found to true.
            // use equals() to compare keys
            if (current.getKey().equals(key)) {
                current.setValue(value);
                found = true;
                break;
            }
            current = current.getNext();
        }
        // if key was not found, add a new node to the linked list
        if (!found) {
            // create a new node
            HashNode<K, V> newNode = new HashNode<>(key, value);
            // add the new node to the beginning of the linked list
            newNode.setNext(table[index]);
            // update the linked list of the index
            table[index] = newNode;
        }
    }

    // TODO: implement method below
    public V get(K key) {
    return null;
    }

    private String linkedListToString(HashNode<K,V> head) {
        String out = "";
        HashNode<K, V> current = head;
        while (current != null) {
            out += current + " ";
            current = current.getNext();
        }
        // optional (get rid off the last space)
        out = out.trim();
        return out;
    }

    @Override
    public String toString() {
        String out = "";
        for (int i = 0; i < SIZE; i++)
            out += i + " -> " + linkedListToString(table[i]) + "\n";
        return out.trim();
    }

    @Override
    public Iterator<V> iterator() {
        return new Iterator<V>() {

            private int index = 0;
            HashNode<K, V> current = table[index];

            @Override
            public boolean hasNext() {
                while (true) {
                    if (index == SIZE)
                        break;
                    if (current == null) {
                        index++;
                        if (index < SIZE)
                            current = table[index];
                    }
                    else
                        return true;
                }
                return false;
            }

            @Override
            public V next() {
                if (hasNext()) {
                    V value = current.getValue();
                    current = current.getNext();
                    return value;
                }
                return null;
            }
        };
    }
}
