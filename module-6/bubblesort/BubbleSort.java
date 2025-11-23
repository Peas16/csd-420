/**
 * Paul Fralix 11/23/2025 CSD420 Assignment M6
 * BubbleSort.java
 * Demonstrates two generic bubble sort methods:
 * 1. sortComparable - uses Comparable interface
 * 2. sortComparator - uses Comparator interface
 * Each method sorts an array in ascending order.
 */

import java.util.Comparator;

public class BubbleSort {

    /**
     * Sorts an array using bubble sort and the Comparable interface.
     * Items in the array MUST implement Comparable.
     *
     * @param <T> a type that extends Comparable<T>
     * @param array array to be sorted
     */
    public static <T extends Comparable<T>> void sortComparable(T[] array) {
        boolean swapped = true;

        while (swapped) {
            swapped = false;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    T temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        }
    }

    /**
     * Sorts an array using bubble sort and a Comparator.
     *
     * @param <T> any object type
     * @param array array to be sorted
     * @param comp comparator to determine sorting order
     */
    public static <T> void sortComparator(T[] array, Comparator<T> comp) {
        boolean swapped = true;

        while (swapped) {
            swapped = false;

            for (int i = 0; i < array.length - 1; i++) {
                if (comp.compare(array[i], array[i + 1]) > 0) {
                    T temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        }
    }
}
