import java.io.*;
import java.util.Scanner;

class Program23 {
    void appendToFile() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("data.dat", true);
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the text to write to the file (type ':qa!' to quit):");
            String input = sc.nextLine();
            while (!input.equals(":qa!")) {
                dataOutputStream.writeUTF(input);
                input = sc.nextLine();
            }
            System.out.println("Written to the file");
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            dataOutputStream.close();
            fileOutputStream.close();
            sc.close();
        }
    }

    public static void main(String[] args) throws IOException {
        Program23 obj = new Program23();
        obj.appendToFile();
    }
}