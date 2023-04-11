/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 14 - BST class
 */

import java.util.Iterator;

public class BST<E> {

    private BSTNode<E> root;

    public BST() {
        root = null;
    }

    // TODO: implement the isEmpty method
    public boolean isEmpty() {
        if(root == null)
            return true;
        else
            return false;
    }


    // TODO: implement the addRecursively private method
    private void addRecursively(BSTNode<E> current, final E value) {

    }

    // TODO: implement the add method
    public void add(final E value) {

    }

    // TODO: override the toString method
    @Override
    public String toString() {
        return "";
    }

    // TODO: implement searchRecursively
    private boolean searchRecursively(final BSTNode<E> current, final E value) {
        return false;
    }

    // TODO: implement search
    public boolean search(final E value) {
        return false;
    }

    // TODO: implement numberChildren
    private int numberChildren(final BSTNode<E> current) {
        return 0;
    }

    // TODO: implement getLeftMost
    private BSTNode<E> getLeftMost(final BSTNode<E> current) {
        return null;
    }

    // TODO: implement removeRecursively
    private BSTNode<E> removeRecursively(final BSTNode<E> current, final E value) {
        return null;
    }

    // TODO: implement remove
    public void remove(final E value) {

    }
}
