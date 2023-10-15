package sorts;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr, int n) {
        int temp;
        boolean swapped;
        for (int i = 0; i < n-1; i++) {
            swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }

            // if no two elements were swapped by inner loop, then break
            // it means if there is no bigger elements in comparing,
            // then stop to iterate further
            if (swapped == false) {
                break;
            }
        }
    }

    // function to print an array
    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 0, 4, 1, 6, 3};
        bubbleSort(arr, arr.length);
        System.out.println("Sorted array: ");
        printArray(arr, arr.length);
    }
}
