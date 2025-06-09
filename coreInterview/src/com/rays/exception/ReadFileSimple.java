package com.rays.exception;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ReadFileSimple {
    public static void main(String[] args) {
        try {
            Scanner reader = new Scanner(new File("example.txt"));
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
