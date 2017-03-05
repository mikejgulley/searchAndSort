package com.lumatik.Controller;

/**
 * Created by mgull on 3/5/2017.
 */
public class BubbleSort {
    public static int[] sort(int[] arrayIn) {
        boolean numbersSwitched;

        do {
            numbersSwitched = false;
            for (int i = 0; i < arrayIn.length - 1; i++) {
                if (arrayIn[i + 1] < arrayIn[i]) {
                    int temp = arrayIn[i + 1];
                    arrayIn[i + 1] = arrayIn[i];
                    arrayIn[i] = temp;
                    numbersSwitched = true;
                }
            }
        } while (numbersSwitched);

        return arrayIn;
    }
}