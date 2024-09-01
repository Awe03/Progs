// Write a program to delete the third record from the above created file. Write a program to read the file to check if the record has been deleted.
import java.io.*;

class Delete {
    void deleteLine() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("newdata.dat");
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);

        FileOutputStream fileOutputStream = new FileOutputStream("newdata-deleted.dat");
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        int count = 0;
        String line;

        try {
            while ((line = dataInputStream.readUTF()) != null) {
                count++;
                if (count == 3) {
                    System.out.println("Third line previously was: " + line);
                    continue;
                }
                dataOutputStream.writeUTF(line);
            }
        } catch (EOFException e) {
            System.out.println("Finished deleting the line");
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            dataInputStream.close();
            fileInputStream.close();
            dataOutputStream.close();
            fileOutputStream.close();
        }
    }
}

class Read {
    void readRecords() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("newdata-deleted.dat");
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        System.out.println("New file: ");
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

public class Program25 {
    public static void main(String[] args) throws IOException {
        Delete obj = new Delete();
        obj.deleteLine();
        Read obj2 = new Read();
        obj2.readRecords();
    }
}