package com.rays.io;
import java.io.*;

public class WriteCharByChar {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("C://Users//MADHUMITA//IO//output.txt")) {
            writer.write('H');
            writer.write('e');
            writer.write('l');
            writer.write('l');
            writer.write('o');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}