import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.util.Scanner;

class WriteInput {
    public static void writeToFile() throws IOException {
        FileWriter fileWriter = new FileWriter("input.txt");
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
            System.out.println("Successfully written to the file");
        } catch (Exception e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        } finally {
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
            sc.close();
        }        
    }
}

class WriteOutput {
    public static void readFromFile() throws IOException {
        FileReader fileReader = new FileReader("input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        try {
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        } finally {
            fileReader.close();
            bufferedReader.close();
        }
    }
}

class Program21 {
    public static void main(String[] args) throws IOException {
        WriteInput.writeToFile();
        WriteOutput.readFromFile();
    }
}