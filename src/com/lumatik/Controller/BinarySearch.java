package com.lumatik.Controller;

import java.util.List;

/**
 * Created by mgull on 3/5/2017.
 */
public class BinarySearch {
    public static boolean binarySearch(final List<Integer> numbersIn, final Integer value) {
        if (numbersIn == null || numbersIn.isEmpty()) {
            return false;
        }

        final Integer comparison = numbersIn.get(numbersIn.size() / 2);

        if (value.equals(comparison)) {
            return true;
        }

        if (value < comparison) {
            return binarySearch(numbersIn.subList(0, numbersIn.size() / 2), value);
        } else {
            return binarySearch(numbersIn.subList(numbersIn.size() / 2 + 1, numbersIn.size()), value);
        }

    }
}
