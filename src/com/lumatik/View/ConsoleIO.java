package com.lumatik.View;

/**
 * Created by mgull on 3/5/2017.
 */
public class ConsoleIO {
    public void printUnsortedArray(int[] unsortedArrayIn) {
        System.out.println("Unsorted Array: ");
        for (int currInt : unsortedArrayIn) {
            System.out.print(currInt + " ");
        }
    }

    public void printSortedArray(int[] sortedArrayIn) {
        System.out.println("\nSorted Array: ");
        for (int currInt : sortedArrayIn) {
            System.out.print(currInt + " ");
        }
    }
}
