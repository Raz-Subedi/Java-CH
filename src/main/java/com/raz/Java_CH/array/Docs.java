package com.raz.Java_CH.array;

public class Docs {
    public static void main(String[] args) {

      /*  An array in Java is a data structure that stores a fixed-size sequential collection of elements of the same type.
        Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
        Arrays can hold primitive data types (like int, char, double, etc.) or objects (like String, custom classes, etc.).*/


      /*
        Fixed Size: Once an array is created, its size cannot be changed.
        Indexed: Elements in an array are accessed using an index, starting from 0.
        Homogeneous: All elements in an array must be of the same type.
        Contiguous Memory: Elements are stored in contiguous memory locations.*/


        /*
        Syntax:

        dataType[] arrayName;     // Declaration
        dataType arrayName[];      // can be done but less recommended.

        arrayName = new dataType[size];   // Instantiation*/


        int[] numbers;              // Declaration
        numbers = new int[5];       // Instantiation (size = 5)

      //  int[] numbers = {10, 20, 30, 40, 50}; // Array of size 5 with values
    }
}
