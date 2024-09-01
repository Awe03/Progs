import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class WriteBinary {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("data.dat");
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of records to write:");
            int n = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                System.out.println("Enter the text for record " + (i + 1) + ":");
                String line = sc.nextLine();
                dataOutputStream.writeUTF(line);
            }
            dataOutputStream.close();
            fileOutputStream.close();
            System.out.println("Finished writing the file");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
