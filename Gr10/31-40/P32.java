// Write a program to accept the full name of a person and print the short name as shown below
// Input: Mohandas Karamchand Gandhi
// Output: M.K. Gandhi
import java.util.Scanner;

class P32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String name = sc.nextLine();
        int n = name.lastIndexOf(' ');
        for (int i = 0; i < n; i++) {
            if (name.charAt(i) == ' ') {
                System.out.print(name.charAt(i + 1) + ".");
            }
            if (i == 0) {
                System.out.print(name.charAt(i) + ".");
            }
        }
        System.out.println(" " + name.substring(n + 1));
    }
}