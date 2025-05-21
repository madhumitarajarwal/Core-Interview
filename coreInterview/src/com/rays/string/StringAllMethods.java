package com.rays.string;

public class StringAllMethods {

    public static void main(String[] args) {
        String name = "Madhumita";
        String str = " Hello";

        // Print length of the string
        System.out.println("String length: " + name.length());

        // Print character at index 6
        System.out.println("String charAt: " + name.charAt(8));

        // Print index of first occurrence of 'a'
        System.out.println("String IndexOf 'a': " + name.indexOf("a"));

		/*
		 * // Print index of first occurrence of 'R' (not found, so returns -1)
		 * System.out.println("String IndexOf 'R': " + name.indexOf("h"));
		 */

		  System.out.println("String lastIndexOf 'i': " + name.lastIndexOf("a"));
		
        // Replace 'D' with 'k' (case sensitive)
        System.out.println("String replace: " + name.replace("d", "k"));

        // Convert to lowercase
        System.out.println("String toLowerCase: " + name.toLowerCase());

        // Convert to uppercase
        System.out.println("String toUpperCase: " + name.toUpperCase());

        // Check if string starts with "K"
        System.out.println("String startsWith 'K': " + name.startsWith("a"));

        // Check if string ends with "d"
        System.out.println("String endsWith 'd': " + name.endsWith("a"));

        // Print substring starting from index 6 to end
        System.out.println("String substring from index 6: " + name.substring(6));
        
     // Print substring starting from index 6 to end
        System.out.println("String substring from index 6: " + name.substring(2,4));

        // Concatenate two strings
        System.out.println("String Concatenation: "+name.concat(str));

        // Trim leading and trailing whitespace from string
        System.out.println("Trimmed string: " + name.trim());

       
        
      
                String str2 = "Hello World Java";
                String[] words = str2.split(" "); // Space ke basis par split kar raha hai

                for (String word : words) {
                    System.out.println(word);
        }

    }

}