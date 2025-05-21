package com.rays.string;

public class StringBufferMethod {

    public static void main(String[] args) {

        // Create a StringBuffer object with initial value "Madhumita"
        StringBuffer sb = new StringBuffer("Madhumita");

        // Append "meena" to the existing StringBuffer content
        sb.append("meena");

        // Print the current content of the StringBuffer
        System.out.println(sb);

        // Print the length of the StringBuffer
        System.out.println("Length: " + sb.length());

        // Print the current capacity of the StringBuffer
        System.out.println("Capacity: " + sb.capacity());

        // Print the character at index 1 (zero-based index)
        System.out.println(sb.charAt(1));
        
        // Find the index of the substring "meena" within the StringBuffer
        System.out.println(sb.indexOf("meena"));
      
       
        // Replace characters from index 1 to 5 (exclusive) with "helloo"
        System.out.println(sb.replace(1, 2, "HELLO"));
          
        
        StringBuffer sb2=new StringBuffer("radha");
        // Reverse the content of the StringBuffer
        System.out.println(sb2.reverse());
        
       
        StringBuffer sb1=new StringBuffer("monika");
       //start index and end-1 index 2 to 4
        System.out.println(sb1.delete(2, 5));
        
        
        //start index and end-1 index 2 to 4
         System.out.println(sb.deleteCharAt(2));

    }

}