// Specify a class Check with the following overloaded programs
// i) void compare(int x, int y) to compare and print the smallest and if equal, print suitable message
// ii) void compare(char x, char y) to compare the numeric values of the 2 characters and print the character with the higher numeric value. If both characters are the same print any one
// Write a main method to call the overloaded function
import java.util.Scanner;

class Check {
    void compare(int x, int y) {
        if (x < y) System.out.println("Smallest is " + x);
        else if (x > y) System.out.println("Smallest is " + y);
        else System.out.println("Both are equal");
    }

    void compare(char x, char y) {
        if (x > y) System.out.println(x + " is greater");
        else if (x < y) System.out.println(y + " is greater");
        else System.out.println(x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st num: ");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd num: ");
        int n2 = sc.nextInt();
        Check obj = new Check();
        obj.compare(n1, n2);
        System.out.println("Enter 1st char: ");
        char c1 = sc.next().charAt(0);
        System.out.println("Enter 2nd char: ");
        char c2 = sc.next().charAt(0);
        obj.compare(c1, c2);
    }
}