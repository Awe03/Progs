// Write a program to create a text file and accept information from the user. Write a program to read the contents of the previously created file

import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.util.Scanner;

class WriteInput {
    public static void writeToFile() {
        try {
            FileWriter fileWriter = new FileWriter("input.txt");
            // Accept input from the user
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the text to write to the file (type ':qa!' to quit):");
            String input = sc.nextLine();
            while (!input.equals(":qa!")) {
                // Write the input to the file
                PrintWriter printWriter = new PrintWriter(fileWriter);
                printWriter.println(input);
                printWriter.flush();
                input = sc.nextLine();
            }
            fileWriter.close();
            sc.close();
            System.out.println("Successfully written to the file");
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}

class WriteOutput {
    public static void readFromFile() {
        try {
            FileReader fileReader = new FileReader("input.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            fileReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}

class Program21 {
    public static void main(String[] args) {
        WriteInput.writeToFile();
        WriteOutput.readFromFile();
    }
}