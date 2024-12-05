/**
 * Implementation of a Priority Queue using an unsorted list.
 * The priority queue stores elements in an unsorted list, and the element
 * with the highest priority (smallest value) is retrieved or removed
 * during operations.
 * Example: Input elements (unsorted): 5, 4, 3, 2, 1. 
 * Processing in order of priority: 1, 2, 3, 4, 5.
 * The implementation supports adding elements, retrieving the smallest
 * element (peek), and removing elements in priority order (poll).
 */
 
import java.util.ArrayList;

import java.util.List;
 
// Class to implement a Priority Queue using an unsorted list

class UnsortedPriorityQueue {

    private List<Integer> list; // List to store elements
 
    // Constructor to initialise the list

    public UnsortedPriorityQueue() {

        list = new ArrayList<>();

    }
 
    // Method to add an element to the queue

    public void add(int element) {

        list.add(element); // Add element to the end of the list

    }
 
    // Method to get and remove the element with the highest priority (smallest value)

    public int poll() {

        if (list.isEmpty()) { // Check if the queue is empty

            throw new IllegalStateException("Queue is empty!"); // Throw an exception if empty

        }
 
        int minIndex = 0; // Index to track the smallest element

        // Loop to find the smallest element in the list

        for (int i = 1; i < list.size(); i++) {

            if (list.get(i) < list.get(minIndex)) { // Compare current element with the smallest

                minIndex = i; // Update index of the smallest element

            }

        }

        // Remove and return the smallest element

        return list.remove(minIndex);

    }
 
    // Method to peek at the element with the highest priority without removing it

    public int peek() {

        if (list.isEmpty()) { // Check if the queue is empty

            throw new IllegalStateException("Queue is empty!"); // Throw an exception if empty

        }
 
        int minValue = list.get(0); // Start with the first element as the smallest

        // Loop to find the smallest element

        for (int value : list) {

            if (value < minValue) { // Compare each element with the smallest found so far

                minValue = value; // Update the smallest value

            }

        }

        return minValue; // Return the smallest value without removing it

    }
 
    // Method to check if the queue is empty

    public boolean isEmpty() {

        return list.isEmpty(); // Return true if the list has no elements

    }

}
 
public class PriorityQueueWithUnsortedList {

    public static void main(String[] args) {

        // Create an instance of the priority queue

        UnsortedPriorityQueue1 pq = new UnsortedPriorityQueue1();
 
        // Add elements to the queue

        pq.add(4); // Add 4

        pq.add(5); // Add 5

        pq.add(2); // Add 2

        pq.add(3); // Add 3

        pq.add(1); // Add 1
 
        // Print the message before processing

        System.out.println("Processing elements in order of priority:");
 
        // Process elements in priority order (smallest to largest)

        while (!pq.isEmpty()) { // Loop until the queue is empty

            System.out.println(pq.poll()); // Retrieve and remove the smallest element

        }

    }

}

 