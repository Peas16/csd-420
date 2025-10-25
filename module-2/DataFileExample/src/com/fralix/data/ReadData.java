/** Paul Fralix 10/25/2025 CSD420 Assignment M2
 * This Java program reads data from data file created.
 */



package com.fralix.data; // omit/change if no package

import java.io.*;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) {
        String filename = "Fralix_datafile.dat"; // same as writer

        try (Scanner input = new Scanner(new File(filename))) {
            System.out.println("Reading data from " + filename + ":\n");
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
            e.printStackTrace();
        }
    }
}
