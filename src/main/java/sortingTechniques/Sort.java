package sortingTechniques;

import java.util.Arrays;

/**
 * Various Sorting Techniques
 */
public class Sort {

    public static void main(String[] args) {
        int[] inputArray = new int[]{5,6,9,8,1,4,7,2,44,25,63};


        Sort sort = new Sort();
        System.out.println("Output Array is : \t"+Arrays.toString(sort.selectionSort(inputArray)));

    }

    /**
     * Bubble Sort:Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
     * https://www.geeksforgeeks.org/bubble-sort/
     *
     * @param inputArray Input Array
     * @return sortedArray Sorted output Array
     */
    public int[] bubbleSort(int[] inputArray) {

        for (int i = 0; i < inputArray.length - 1; i++) {
            for (int j = 0; j < inputArray.length - 1 - i; j++) {
                if (inputArray[j] > inputArray[j + 1]) {
                    int tmp = inputArray[j + 1];
                    inputArray[j + 1] = inputArray[j];
                    inputArray[j] = tmp;
                }
            }
        }
        return inputArray;
    }

    //TODO: Improve Bubble Sort. Have a boolean flag if no swaps are found, stop processing.

    /**
     * Selection Sort: Traverse through the whole array and find the minimum element and swap it with the first element etc.
     */
    public int[] selectionSort(int[] inputArray) {
        System.out.println("Input Array is: \t"+Arrays.toString(inputArray));

        for (int i = 0; i < inputArray.length - 1; i++) {

            int minIndex = i;
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[minIndex] > inputArray[j]) {
                    minIndex = j;
                }
            }
            //swap first one with min element
            int temp;
            temp = inputArray[i];
            inputArray[i] = inputArray[minIndex];
            inputArray[minIndex] = temp;
        }

        return inputArray;
    }


}
