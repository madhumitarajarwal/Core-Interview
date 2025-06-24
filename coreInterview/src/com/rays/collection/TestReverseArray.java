package com.rays.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestReverseArray {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(6);
        l.add(5);
        l.add(3);
        l.add(4);

    //Collections.sort(l);   [1, 2, 3, 4, 5, 6]
    //Collections.reverse(l);   [4, 3, 5, 6, 2, 1]
        System.out.println(l);
        Collections.sort(l, Collections.reverseOrder());
        System.out.println(l);
    }
}