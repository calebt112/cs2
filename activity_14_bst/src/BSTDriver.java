/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 14 - BSTDriver class
 */

import java.util.Iterator;

public class BSTDriver {

    // TODO: create a binary tree and add the data elements to reproduce the tree described in the lecture about trees; don't forget to print your tree at the end
    public static void main(String[] args) {

        //manual creation of a binary tree
        BSTNode<Integer> root = new BSTNode<>(25);
        BSTNode<Integer> N10 = new BSTNode<>(10);
        BSTNode<Integer> N5 = new BSTNode<>(5);
        BSTNode<Integer> N50 = new BSTNode<>(50);
        BSTNode<Integer> N75 = new BSTNode<>(75);

        root.setLeft(N10);
        root.setRight(N50);
        N10.setLeft(N5);
        N50.setRight(N75);

    }
}