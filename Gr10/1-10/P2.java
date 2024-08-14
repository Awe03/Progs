// Create a function int counter (long num, int d) to read a number in num and an integer in d as a digit
// Count and return the occurrence of d (digit) in num if d is present in num otherwise return 0.
// Write a main function to input a number and print occurrence of d in num using the function counter()
import java.util.Scanner;

class P2 {
    int counter(long num, int d) {
        int c = 0;
        while (num > 0) {
            if (num % 10 == d) c++;
            num /= 10;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        System.out.println("Enter the digit you want to check for: ");
        int d = sc.nextInt();
        P2 obj = new P2();
        System.out.println("Occurrences: " + obj.counter(n, d));
    }
}
