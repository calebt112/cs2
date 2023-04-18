/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 14 - BST class
 */

import java.util.Comparator;
import java.util.Iterator;


public class BST<E extends Comparable<E>> {

    private BSTNode<E> root;

    public BST() {
        root = null;
    }

    // TODOd: implement the isEmpty method
    public boolean isEmpty() {
        return root == null;
    }

    // TODOd: implement the addRecursively private method
    private void addRecursively(BSTNode<E> current, final E value) {
        if(value.compareTo(current.getValue()) == 0)
            return;

        if (value.compareTo(current.getValue()) < 0) {
            if (current.getLeft() == null)
                current.setLeft(new BSTNode<E>(value));
            else
                addRecursively(current.getLeft(), value);
        }
        else {
            if (current.getRight() == null)
                current.setRight(new BSTNode<E>(value));
            else
                addRecursively(current.getRight(), value);
        }
    }

    // TODOd: implement the add method
    public void add(final E value) {
        if(root == null)
            root = new BSTNode<E>(value);
        else
            addRecursively(root, value);
    }

    // TODOd: override the toString method
    @Override               //new to string method online
    public String toString() {
        String s = "";
        if (!isEmpty()) {
            Queue<BSTNode<E>> q = new Queue<>();
            q.push(root);
            while (!q.isEmpty()) {
                BSTNode<E> current = null;
                try {
                    current = q.pop();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                s += current.getValue() + " ";
                if (current.getLeft() != null)
                    q.push(current.getLeft());
                if (current.getRight() != null)
                    q.push(current.getRight());
            }
        }
        return s;
    }

    // TODOd: implement searchRecursively
    private boolean searchRecursively(final BSTNode<E> current, final E value) {
        // setup is the same as addRecursively
        // base cass 1st iteration
        if(root == null)        // Tree is empty
            return false;
        // base case recursive iterations
        if(current == null)     // value not found
            return false;
        // value found
        if(value.compareTo(current.getValue()) == 0)
            return true;
        // value not found search left or right
        if(value.compareTo(current.getValue()) < 0)
            // recursive call
            return searchRecursively(current.getLeft(), value);
        else
            // recursive call
            return searchRecursively(current.getRight(), value);
    }

    // TODOd: implement search
    public boolean search(final E value) {
        return searchRecursively(root, value);
    }

    // TODOd: implement numberChildren
    private int numberChildren(final BSTNode<E> current) {
        if (current == null || (current.getLeft() == null && current.getRight() == null))   // current == null is not needed. Assumption is that current is not null
            return 0;
        else if (current.getLeft() != null && current.getRight() != null)
            return 2;
        else
            return 1;
    }

    // TODO: implement getLeftMost
    private BSTNode<E> getLeftMost(final BSTNode<E> current) {
        // base case
        if (current.getLeft() == null)
            return current;
        else
            // recursive call keep going left until getLeft() == null
            return getLeftMost(current.getLeft());
    }

    // TODO: implement removeRecursively
    private BSTNode<E> removeRecursively(final BSTNode<E> current, final E value) {
        return null;
    }

    // TODO: implement remove
    public void remove(final E value) {

    }
}
