//write a program to compute the ASCII codes of each letter of an entered string
import java.util.Scanner;

class P22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            System.out.println((int)s.charAt(i));
        }
        sc.close();
    }
}
