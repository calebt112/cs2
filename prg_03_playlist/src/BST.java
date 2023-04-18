/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Student(s):
 * Description: The BST class
 */

import java.util.Iterator;

public class BST<E extends Comparable<E>> implements Iterable<E> {

    private BSTNode<E> root;

    public BST() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    private void addRecursively(BSTNode<E> current, final E value) {
        if (value.compareTo(current.getValue()) < 0) {
            if (current.getLeft() == null)
                current.setLeft(new BSTNode<>(value));
            else
                addRecursively(current.getLeft(), value);
        }
        else if (value.compareTo(current.getValue()) > 0) {
            if (current.getRight() == null)
                current.setRight(new BSTNode<>(value));
            else
                addRecursively(current.getRight(), value);
        }
    }

    public void add(final E value) {
        if (root == null)
            root = new BSTNode<>(value);
        else
            addRecursively(root, value);
    }

    private String toStringRecursively(BSTNode<E> current, String tabs) {
        if (current == null)
            return "";
        return  tabs +
                current +
                "\n" +
                toStringRecursively(current.getLeft(), tabs + "\t") +
                toStringRecursively(current.getRight(), tabs + "\t");
    }

    @Override
    public String toString() {
        return toStringRecursively(root, "");
    }

    private boolean searchRecursively(final BSTNode<E> current, final E value) {
        if (value.compareTo(current.getValue()) == 0)
            return true;
        else if (value.compareTo(current.getValue()) < 0) {
            if (current.getLeft() == null)
                return false;
            else
                return searchRecursively(current.getLeft(), value);
        } else {
            if (current.getRight() == null)
                return false;
            else
                return searchRecursively(current.getRight(), value);
        }
    }

    public boolean search(final E value) {
        if (isEmpty())
            return false;
        else
            return searchRecursively(root, value);    }

    private int numberChildren(final BSTNode<E> current) {
        if (current == null || (current.getLeft() == null && current.getRight() == null))
            return 0;
        if (current.getLeft() != null && current.getRight() != null)
            return 2;
        return 1;
    }

    private BSTNode<E> getLeftMost(final BSTNode<E> current) {
        if (current.getLeft() == null)
            return current;
        return getLeftMost(current.getLeft());
    }

    private BSTNode<E> removeRecursively(final BSTNode<E> current, final E value) {
        if (value.compareTo(current.getValue()) == 0) {
            if (numberChildren(current) == 0)
                return null;
            if (numberChildren(current) == 1)
                return current.getLeft() != null? current.getLeft(): current.getRight();
            // 2 children...
            BSTNode<E> newCurrent = current.getRight();
            BSTNode<E> leftMost = getLeftMost(newCurrent);
            leftMost.setLeft(current.getLeft());
            return newCurrent;
        }
        else if (value.compareTo(current.getValue()) < 0)
            current.setLeft(removeRecursively(current.getLeft(), value));
        else
            current.setRight(removeRecursively(current.getRight(), value));
        return current;
    }

    public void remove(final E value) {
        if (isEmpty())
            return;
        root = removeRecursively(root, value);
    }

    // TODO #3: implement the clearRecursively helper method
    private void clearRecursively(BSTNode current) {

    }

    // TODO #4: implement the clear method (based on clearRecursively)
    public void clear() {

    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            Queue<BSTNode<E>> queue = init();

            Queue<BSTNode<E>> init() {
                Queue<BSTNode<E>> queue = new Queue<>();
                queue.push(root);
                return queue;
            }

            @Override
            public boolean hasNext() {
                return !queue.isEmpty();
            }

            @Override
            public E next() {
                try {
                    BSTNode<E> current = queue.pop();
                    if (current.getLeft() != null)
                        queue.push(current.getLeft());
                    if (current.getRight() != null)
                        queue.push(current.getRight());
                    return current.getValue();
                } catch (Exception e) {
                    return null;
                }
            }
        };
    }
}
