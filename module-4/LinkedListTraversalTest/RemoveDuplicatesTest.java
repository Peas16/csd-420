/*
Paul Fralix 11/09/2025 CSD420 Assignment M4
This java program that stores 50,000 integers in LinkedList 
and test the time to traverse the list using an iterator vs. using the get(index) method.  
*/


import java.util.ArrayList;
import java.util.Random;

public class RemoveDuplicatesTest {

    public static void main(String[] args) {
        // Create and fill the original ArrayList with 50 random values from 1 to 20
        ArrayList<Integer> originalList = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 50; i++) {
            originalList.add(rand.nextInt(20) + 1); // random value 1–20
        }

        System.out.println("Original List (with duplicates):");
        System.out.println(originalList);

        ArrayList<Integer> noDuplicatesList = removeDuplicates(originalList);

        System.out.println("\nList after removing duplicates:");
        System.out.println(noDuplicatesList);
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> newList = new ArrayList<>();
        for (E element : list) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }
}
