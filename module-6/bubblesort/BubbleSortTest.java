/**
 * Paul Fralix 11/23/2025 CSD420 Assignment M6
 * BubbleSortTest.java
 * Tests both bubble-sort methods to ensure correct functionality.
 *
 */

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSortTest {
    public static void main(String[] args) {

        // -------------------------------
        // TEST 1: Comparable Sort (Strings)
        // -------------------------------
        String[] words = { "banana", "apple", "cherry", "date" };

        System.out.println("Original (Comparable): " + Arrays.toString(words));
        BubbleSort.sortComparable(words);
        System.out.println("Sorted   (Comparable): " + Arrays.toString(words));
        System.out.println();


        // -------------------------------
        // TEST 2: Comparable Sort (Integers)
        // -------------------------------
        Integer[] numbers = { 9, 4, 1, 7, 3, 2 };

        System.out.println("Original (Comparable): " + Arrays.toString(numbers));
        BubbleSort.sortComparable(numbers);
        System.out.println("Sorted   (Comparable): " + Arrays.toString(numbers));
        System.out.println();


        // -------------------------------
        // TEST 3: Comparator Sort (Reverse Order)
        // -------------------------------
        Integer[] nums2 = { 10, 5, 20, 15 };

        System.out.println("Original (Comparator): " + Arrays.toString(nums2));
        BubbleSort.sortComparator(nums2, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b - a; // reverse order
            }
        });
        System.out.println("Sorted   (Comparator): " + Arrays.toString(nums2));
        System.out.println();


        // -------------------------------
        // TEST 4: Comparator Sort (Custom Object)
        // -------------------------------
        Person[] people = {
                new Person("George", 35),
                new Person("Jen", 20),
                new Person("Katherine", 45)
        };

        System.out.println("Original (Person by Age): " + Arrays.toString(people));

        BubbleSort.sortComparator(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getAge() - p2.getAge();
            }
        });

        System.out.println("Sorted   (Person by Age): " + Arrays.toString(people));
    }
}

/**
 * Simple class used to test sorting with Comparator.
 */
class Person {
    private String name;
    private int age;

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + "(" + age + ")";
    }
}
