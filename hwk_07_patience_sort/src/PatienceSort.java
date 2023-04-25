/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Student: Caleb Thompson
 * Description: Homework 07 - PatienceSort
 */

import java.util.Arrays;

public class PatienceSort {

    // the patience sort algorithm
    public static void patienceSort(int data[]) throws Exception {

        // this is the list of stacks (each a stack of integers)
        LinkedList<Stack<Integer>> stacks = new LinkedList<>();

        // TODOd #1: loop through the data array and get the array's current element
        // TODOd #2: at each iteration, find a stack available and push the array's current element onto it
        // TODOd #3: if there isn't a stack available, create a new one, push the data array's current element onto it, and then append the newly created stack to the list of stacks.

        for (int i = 0; i < data.length; i++) {
            int current = data[i];
            boolean found = false;
            for (int j = 0; j < stacks.size(); j++) {
                Stack<Integer> stack = stacks.get(j);
                if (current <= stack.peek()) {
                    stack.push(current);
                    found = true;
                    break;
                }
            }
            if (!found) {
                Stack<Integer> stack = new Stack<>();
                stack.push(current);
                stacks.add(stack);
            }
        }

        // merge of stacks
        if (stacks.isEmpty())
            return;
        System.out.println(stacks);
        for (int i = 0; i < data.length; i++) {
            Stack<Integer> stackMin = stacks.get(0);
            int j = 0;
            for (int k = 1; k < stacks.size(); k++) {
                Stack<Integer> stackCurrent = stacks.get(k);
                if (stackCurrent.peek() < stackMin.peek()) {
                    stackMin = stackCurrent;
                    j = k;
                }
            }
            data[i] = stackMin.pop();
            if (stackMin.isEmpty())
                stacks.remove(j);
        }
    }

    public static void main(String[] args) throws Exception {
        int data[] = {13, 12, 84, 79, 10, 77, 56, 1, 34, 27, 3};
        System.out.println(Arrays.toString(data));
        patienceSort(data);
        System.out.println(Arrays.toString(data));
    }
}
