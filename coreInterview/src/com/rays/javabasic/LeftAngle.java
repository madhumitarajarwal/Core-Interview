package com.rays.javabasic;

public class LeftAngle{

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            // Print spaces
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  "); // Two spaces to align with "* "
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
