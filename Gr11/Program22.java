// Write a program to create a text file and create another file with the contents copied from the original file
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.util.Scanner;

class Program22 {
    void writeToFile() throws IOException {
        FileWriter fileWriter = new FileWriter("original.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the text to write to the file (type ':qa!' to quit):");
            String input = sc.nextLine();
            while (!input.equals(":qa!")) {
                printWriter.println(input);
                input = sc.nextLine();
            }
            System.out.println("Written to the file");
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
            sc.close();
        }
    }

    void readFromFile() throws IOException {
        FileReader fileReader = new FileReader("original.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter("copy.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        String line;
        try {
            while ((line = bufferedReader.readLine()) != null) {
                printWriter.println(line);
            }
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            fileReader.close();
            bufferedReader.close();
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        }
    }

    public static void main(String[] args) throws IOException {
        Program22 obj = new Program22();
        obj.writeToFile();
        obj.readFromFile();
    }
}