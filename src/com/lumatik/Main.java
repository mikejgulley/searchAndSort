package com.lumatik;

import com.lumatik.Controller.BinarySearch;
import com.lumatik.Controller.BubbleSort;
import com.lumatik.View.ConsoleIO;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static ConsoleIO io = new ConsoleIO();
    private static int[] unsortedArray = {5, 97, 23, 456, 74};
    private static List<Integer> numList = new ArrayList<>();

    public static void main(String[] args) {
        // Bubble Sort
        System.out.println("Bubble Sort");
        io.printUnsortedArray(unsortedArray);
        int[] sortedArray = BubbleSort.sort(unsortedArray);
        io.printSortedArray(sortedArray);

        // Binary Search
        for(int currInt : unsortedArray) {
            numList.add(currInt);
        }

        System.out.println("\n\nBinary Search");
        int value = 3;
        boolean searchResult = BinarySearch.binarySearch(numList, value);
        if (searchResult) {
            System.out.println(value + " is in the list of numbers!");
        } else {
            System.out.println(value + " is NOT in the list of numbers!");
        }

    }
}
