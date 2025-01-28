package com.raz.Java_CH.array;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 1, 6};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int[] partialNumbers = {5, 3, 9, 1, 6};
        Arrays.sort(partialNumbers, 1, 4); // Sorts from index 1 to 3
        System.out.println(Arrays.toString(partialNumbers));

        int index = Arrays.binarySearch(numbers, 5); // Searches for 5
        System.out.println("Index of 5: " + index); // 2

        index = Arrays.binarySearch(numbers, 7); // Searches for 4 (not found)
        System.out.println("Index of 4: " + index); // -3 (insertion point)

       /*
       Comparing Arrays
       equals(array1, array2): Checks if two arrays are equal (same length and elements).

        deepEquals(array1, array2): Checks if two multidimensional arrays are equal.

        Filling Arrays
        fill(array, value): Fills the entire array with the specified value.
        fill(array, fromIndex, toIndex, value): Fills a specific range of the array with the specified value.

        Converting Arrays to Strings
        toString(array): Converts an array to a string representation.
        deepToString(array): Converts a multidimensional array to a string representation.

        Copying Arrays
        copyOf(array, newLength): Copies the array with a specified length.
        copyOfRange(array, fromIndex, toIndex): Copies a specific range of the array.

        Stream Operations
        stream(array): Converts an array into a stream for functional-style operations.
                                                                                                            */
    }
}
