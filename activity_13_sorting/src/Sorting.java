/*
 * CS 2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 13 - Sorting Algorithms
 */

import java.util.Arrays;

public class Sorting {

    // TODOd #1: implement the bubble sort algorithm
    public static void bubbleSort(int data[]) {
        // more conventional way
        for(int i = 0; i < data.length -1; i++){
            for(int j = 0; j < data.length - i - 1; j++){
                if(data[j] > data[j+1]){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
            System.out.println(Arrays.toString(data));
        }
        // my way
//        for(int n = data.length -1; n > 0; n--){
//            for(int i = 0; i < n; i++){
//                if(data[i] > data[i+1]){
//                    int temp = data[i];
//                    data[i] = data[i+1];
//                    data[i+1] = temp;
//                }
//            }
//        }
    }

    // TODOd #2: implement the selection sort algorithm
    public static void selectionSort(int data[]) {
        for(int i = 0; i < data.length-1; i++){
            int min = i;
            for(int j = i+1; j < data.length; j++){
                if(data[j] < data[min]){
                    min = j;
                }
            }
            if (min != i) {                 // if statement is for optimization. If the min is already in the correct position, then no need to swap
                int temp = data[i];
                data[i] = data[min];
                data[min] = temp;
            }
            System.out.println(Arrays.toString(data));
        }
    }

    // TODOd #3: implement the insertion sort algorithm
    public static void insertionSort(int data[]) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i; j >= 0; j--) {
                if (data[j] > data[j+1]) {
                    int temp = data[j+1];
                    data[j+1] = data[j];
                    data[j] = temp;
                } else {
                    break;
                }
            }
            System.out.println(Arrays.toString(data));
        }
    }


    // TODOd #4: implement the partition part of the quick sort algorithm
    public static int partition(int data[], int start, int end) {
        int i = start;
        for (int j = start; j < end; j++){
            if(data[j] < data[end]){
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
                i++;
            }
        }
        int temp = data[i];
        data[i] = data[end];
        data[end] = temp;
        System.out.println(Arrays.toString(data));
        System.out.println("partition: " + i);
        return i;
    }

    // TODOd #5: implement the quick sort algorithm
    public static void quickSort(int data[], int start, int end) {
        if(start < end){
            int pivot = partition(data, start, end);
            quickSort(data, start, pivot-1);
            quickSort(data, pivot, end);
        }
    }

    // TODOd #6: implement the merge part of the merge sort algorithm
    public static void merge(int data[], int begin, int middle, int end) {
        middle = (begin + end) / 2;
        int left[] = new int[middle - begin + 1];
        int right[] = new int[end - middle];
        for(int i = 0; i < left.length; i++){
            left[i] = data[begin + i];
        }
        for(int i = 0; i < right.length; i++){
            right[i] = data[middle + i + 1];
        }
        int i = 0, j = 0, k = begin;
        while(i <left.length && j < right.length){
            if(left[i] < right[j])
                data[k++] = left[i++];
            else
                data[k++] = right[j++];
        }
        while(i < left.length)
            data[k++] = left[i++];
        while(j < right.length)
            data[k++] = right[j++];
        System.out.println(Arrays.toString(data));
    }

    // TODO #7: implement the merge sort algorithm
    public static void mergeSort(int data[], int begin, int end) {
        if(begin < end) {
            int middle = (begin + end) / 2;
            mergeSort(data, begin, middle);
            mergeSort(data, middle + 1, end);
            merge(data, begin, middle, end);
        }

    }

    public static void main(String[] args) {
         //int data[] = {13, 12, 84, 79, 10, 77, 56, 1, 34, 27, 3};
        int data[] = {23, 7, 8, 19, 10};
        // perform various sorts using the different sorting algorithms implemented above
        System.out.println(Arrays.toString(data));
        //bubbleSort(data);
        //selectionSort(data);
        //insertionSort(data);
        quickSort(data, 0, data.length-1);
        //mergeSort(data, 0, data.length-1);
    }
    
}
