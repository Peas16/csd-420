/*
Paul Fralix 11/09/2025 CSD420 Assignment M4
This java program that stores 50,000 integers in LinkedList 
and test the time to traverse the list using an iterator vs. using the get(index) method.  
*/


import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTraversalTest {

    // Method to fill LinkedList with integers from 0 to n-1
    public static LinkedList<Integer> createLinkedList(int n) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        return list;
    }

    // Test traversal using iterator
    public static long traverseWithIterator(LinkedList<Integer> list) {
        long startTime = System.nanoTime();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next(); // Access each element
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    // Test traversal using get(index)
    public static long traverseWithGet(LinkedList<Integer> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < list.size(); i++) {
            list.get(i); // Access element by index
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    // Run the test with a given number of elements
    public static void runTest(int size) {
        System.out.println("\nTesting LinkedList with " + size + " elements...");

        LinkedList<Integer> list = createLinkedList(size);

        long iteratorTime = traverseWithIterator(list);
        long getTime = traverseWithGet(list);

        System.out.println("Traversal using Iterator: " + iteratorTime / 1_000_000.0 + " ms");
        System.out.println("Traversal using get(index): " + getTime / 1_000_000.0 + " ms");

        if (iteratorTime < getTime) {
            System.out.println("→ Iterator traversal is much faster.");
        } else {
            System.out.println("→ get(index) traversal is faster (unexpected).");
        }
    }

    public static void main(String[] args) {
        // Run test with 50,000 elements
        runTest(50_000);

        // Run test with 500,000 elements
        runTest(500_000);
    }
}

/*
------------------------------------------
COMMENTS AND ANALYSIS:

1. For LinkedList, using get(index) is inefficient because LinkedList does not provide 
   random access. Each call to get(i) starts from the head or tail and traverses the list 
   until it reaches the i-th element — O(n) per access. Thus, traversing all elements 
   this way results in O(n²) time complexity.

2. Using an Iterator is much faster (O(n)) because it maintains a reference to the 
   current node and simply moves to the next node in constant time for each element.

3. When testing with 50,000 elements:
   - Iterator traversal usually completes in a few milliseconds.
   - get(index) traversal may take hundreds of milliseconds or even seconds depending 
     on your system.

4. When increasing to 500,000 elements:
   - The iterator time increases linearly (about 10× longer).
   - The get(index) time increases dramatically (potentially 100× or more), because of 
     the quadratic growth in operations.

5. These results confirm that Iterator traversal is the correct and efficient way to 
   iterate through a LinkedList.
------------------------------------------
*/
