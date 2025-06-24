package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethod2 {

    public static void main(String[] args) {

        // Creating two collections
        Collection<Integer> c = new ArrayList<>();
        Collection<Integer> c1 = new ArrayList<>();

        // Adding elements to c1
        c1.add(55);
        c1.add(10);

        // Adding elements to c
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);

        // Adding 50 to c and printing the result (true if added successfully)
        System.out.println("Add 50 to c: " + c.add(50));

        // Printing the contents of c
        System.out.println("Contents of c: " + c);

        // Checking if c contains all elements of c1
        System.out.println("c contains all elements of c1: " + c.containsAll(c1));

        // Adding all elements of c1 to c
        System.out.println("Add all elements of c1 to c: " + c.addAll(c1));

        // Printing the updated contents of c
        System.out.println("Updated contents of c: " + c);

        // Printing the size of c
        System.out.println("Size of c: " + c.size());

        // Checking if c contains the element 10
        System.out.println("c contains 10: " + c.contains(10));

        // Checking if c is empty
        System.out.println("c is empty: " + c.isEmpty());

        // Removing one occurrence of 10 from c
        System.out.println("Remove 10 from c: " + c.remove(10));

        // Printing the contents after removal
        System.out.println("Contents of c after removing 10: " + c);

        // Removing all elements from c (same as clearing)
        System.out.println("Remove all elements from c: " + c.removeAll(c));

        // Clearing the collection (though it's already empty now)
        c.clear();

        // Final state of c
        System.out.println("Final contents of c after clear(): " + c);
    }
}
