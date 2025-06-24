package com.rays.collection;

import java.util.HashSet;

public class TestHashSet {
    public static void main(String[] args) {
       
    	// Yahan pe e2 add nahi hoga, kyunki equals() ne kaha: "e1 aur e2 same hain"
    	// hashCode() bhi same aaya, isliye HashSet ne duplicate ko ignore kar diya.


        EqualHashCode e1 = new EqualHashCode(1, "Ram", 5000);
        EqualHashCode e2 = new EqualHashCode(1, "Ram", 5000); // Same data as e1
        EqualHashCode e3 = new EqualHashCode(2, "Shyam", 6000);

        HashSet<EqualHashCode> set = new HashSet<>();

        set.add(e1);
        set.add(e2); // Should not be added (duplicate)
        set.add(e3);

        for (EqualHashCode e : set) {
            System.out.println(e);
        }
    }
}
