/** Paul Fralix 10/25/2025 CSD420 Assignment M2
 * This Java program creates a data file and writes data to it.
 */


package com.fralix.data; // omit or change if you didn't create a package

import java.io.*;
import java.util.Random;

public class WriteData {
    public static void main(String[] args) {
        String filename = "Fralix_datafile.dat"; // file in working directory
        Random rand = new Random();

        try (PrintWriter output = new PrintWriter(new FileOutputStream(filename, true))) {
            output.println("Random Integers:");
            for (int i = 0; i < 5; i++) {
                int num = rand.nextInt(100); // random integer 0–99
                output.print(num + " ");
            }
            output.println();

            output.println("Random Doubles:");
            for (int i = 0; i < 5; i++) {
                double num = rand.nextDouble() * 100; // random double 0–99.99
                output.printf("%.2f ", num);
            }
            output.println();
            output.println("-----------------------");

            System.out.println("Data written successfully to " + filename);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
