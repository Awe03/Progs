// Write a program to insert a record after reading two records in the previously created file. The details of the new record must be entered by the user. Write a program to check the contents of the newly created file
import java.io.*;
import java.util.Scanner;

class Writer {
    void insertRecord() throws IOException {
        // assume data.dat already exists
        FileInputStream fileInputStream = new FileInputStream("data.dat");
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);

        FileOutputStream fileOutputStream = new FileOutputStream("newdata.dat", true);
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String line;

        try {
            while ((line = dataInputStream.readUTF()) != null) {
                if (count == 2) {
                    System.out.println("Enter text to insert: ");
                    dataOutputStream.writeUTF(sc.nextLine());
                    count = 0;
                }
                dataOutputStream.writeUTF(line);
                count++;
            }
        } catch (EOFException e) {
            System.out.println("Finished writing the file");
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            dataInputStream.close();
            fileInputStream.close();
            dataOutputStream.close();
            fileOutputStream.close();
            sc.close();
        }
    }
}

class Reader {
    void readRecords() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("newdata.dat");
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        try {
            String line = dataInputStream.readUTF();
            while (line != null) {
                System.out.println(line);
                line = dataInputStream.readUTF();
            }
        } catch (EOFException e) {
            System.out.println("End of file reached");
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            dataInputStream.close();
            fileInputStream.close();
        }
    }
}

class Program24 {
    public static void main(String[] args) throws IOException {
        Writer writer = new Writer();
        Reader reader = new Reader();
        writer.insertRecord();
        reader.readRecords();
    }
}
