package com.rays.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListInterface {

    public static void main(String[] args) {

        // ========== ArrayList ==========
    	
        //Internally uses a dynamic array,Fast for random access using indexes.
        //Slower for inserting/removing elements in the middle, because it may involve shifting elements.

        ArrayList list = new ArrayList();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);

        System.out.println(list.get(2)); // 300 - Accessing element at index 2
        System.out.println(list.hashCode()); // Hash code of ArrayList (used internally, rarely used directly)
        System.out.println(list.indexOf(200)); // Index of element 200 (should be 1)
        System.out.println(list.subList(1, 3)); // Returns a sublist from index 1 to 2 [200, 300]
        System.out.println(list.lastIndexOf(400)); // Last occurrence index of 400

        System.out.println("=====================================");

        // ========== LinkedList ==========
        
        // Doubly-linked list internally.
        // Good for frequent insertions/deletions.
        //Slower for random access (like get(index)), because it must traverse the list.

        LinkedList l = new LinkedList();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);

        System.out.println(l.element()); // Retrieves but does not remove head (10)
        System.out.println(l.getFirst()); // Retrieves first element (10)
        System.out.println(l.getLast()); // Retrieves last element (40)
        System.out.println(l.peek() + "pekkkk"); // Similar to element(), but returns null if empty
        System.out.println(l.peekFirst()); // Retrieves first element (10)
        System.out.println(l.peekLast()); // Retrieves last element (40)

        System.out.println(l.offer(20)); // Adds 20 at the end, returns true
        System.out.println(l); // List after adding

        System.out.println(l.offerFirst(120)); // Adds 120 at the beginning
        System.out.println(l.offerLast(150)); // Adds 150 at the end

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");

        // ========== Stack ==========
        // Stack is based on Vector, follows LIFO (Last-In-First-Out)based on resizeable array.
        // Use push/pop/peek/search for stack operations.

        Stack s = new Stack();

        s.push(1); // Pushes 1 onto the stack
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5); // Top of the stack

        System.out.println(s.empty()); // false - stack is not empty
        System.out.println(s.peek() + "guggg"); // Peeks top element without removing (5)
        System.out.println(s.search(5) + "search"); // Searches for 5, returns 1 (1-based position from top)
        System.out.println(s.pop()); // Removes and returns top element (5)
        System.out.println(s + "endddddddddd"); // Current stack [1, 2, 3, 4]

        System.out.println("=========+++++++++++++++++++++=====================");

        // ========== Vector ==========
        // Vector is like ArrayList but synchronized (thread-safe).
        // Has extra methods like elementAt(), capacity().
        // Slower in single-threaded applications compared to ArrayList.

        Vector v = new Vector();
        v.add(50);
        v.add(100);
        v.add(150);
        v.add(200);

        System.out.println(v.elementAt(2)); // 150 - Similar to get(2)
        System.out.println(v.subList(1, 3)); // Sublist from index 1 to 2 [100, 150]
        System.out.println(v.hashCode()); // Hash code of Vector
        System.out.println(v.size()); // Number of elements
        System.out.println(v.capacity()); // Internal array size (default is 10, grows as needed)
    }
}
