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

    // TODO #2: implement the selection sort algorithm
    public static void selectionSort(int data[]) {
        
    }

    // TODO #3: implement the insertion sort algorithm
    public static void insertionSort(int data[]) {
        
    }


    // TODO #4: implement the partition part of the quick sort algorithm
    public static int partition(int data[], int start, int end) {
        return 0;
    }

    // TODO #5: implement the quick sort algorithm
    public static void quickSort(int data[], int start, int end) {
        
    }

    // TODO #6: implement the merge part of the merge sort algorithm
    public static void merge(int data[], int begin, int middle, int end) {
        
    }

    // TODO #7: implement the merge sort algorithm
    public static void mergeSort(int data[], int begin, int end) {
        
    }

    public static void main(String[] args) {
         int data[] = {13, 12, 84, 79, 10, 77, 56, 1, 34, 27, 3};
        // perform various sorts using the different sorting algorithms implemented above
        System.out.println(Arrays.toString(data));
        bubbleSort(data);
        System.out.println(Arrays.toString(data));
    }
    
}
