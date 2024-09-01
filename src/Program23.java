// This program appends records to an existing .dat file

import java.io.*;
import java.util.Scanner;

class Program23 {
    // In the method appendToFile, using FileOutputStream and
    // DataOutputStream we append records that the user inputs
    // into an already existing 'data.dat' file
    void appendToFile() throws IOException {
        // Creation of objects required
        FileOutputStream fileOutputStream = new
                FileOutputStream("data.dat", true);
        DataOutputStream dataOutputStream = new
                DataOutputStream(fileOutputStream);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the text to write to the file (type ':qa!' to quit):");
            String input = sc.nextLine();
// While the user's input is not ":qa!" we continue to 
// write to the file
            while (!input.equals(":qa!")) {
                dataOutputStream.writeUTF(input);
                input = sc.nextLine();
            }
            System.out.println("Written to the file");
        } catch (Exception e) {
            // We print any errors
            System.err.println(e);
        } finally {
            // And finally we close all our writers
            dataOutputStream.close();
            fileOutputStream.close();
            sc.close();
        }
    }

    // In the main method, we simply create an object of the class
// to call the function appendToFile()
    public static void main(String[] args) throws IOException {
        Program23 obj = new Program23();
        obj.appendToFile();
    }
}
