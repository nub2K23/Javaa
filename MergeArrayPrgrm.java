// Given are 2 one dimensional arrays, A and B which are sorted in ascending order. 
// Write a program to merge them into a single sorted array C that contains every item 
// from arrays A and B, in ascending order.

// 13

import java.util.Arrays;

public class MergeArrayPrgrm {
    private static int[] mergeArray(int[] arrA, int[] arrB) {
        int[] mergedArray = new int[arrA.length + arrB.length];
        int i = 0, j = 0, k = 0;
        while  (i < arrA.length && j < arrB.length) {
            if (arrA[i] < arrB[j]) {
                mergedArray[k] = arrA[i];
                i++;
                k++;
            } else {
                mergedArray[k] = arrB[j];
                j++;
                k++;
            }
        }
        while (i < arrA.length) {
            mergedArray[k] = arrA[i];
            i++;
            k++;
        }

        while (j < arrB.length) {
            mergedArray[k] = arrB[j];
            j++;
            k++;
        }
        return mergedArray;
    }

    public static void main(String[] args) {
        int[] arrA = new int[] {-7, 12, 17, 29, 41, 56, 79};
        int[] arrB = new int[] {-9, -3, 0, 5, 19};
        int[] mergedArray = mergeArray(arrA, arrB);
        System.out.println("Array A: " + Arrays.toString(arrA));
        System.out.println("Array B: " + Arrays.toString(arrB));
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }
}