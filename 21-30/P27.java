// Write a program to input a word and check and print whether it is a Palindrome or not. Also print the original and reversed word.
import java.util.Scanner;

class P27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String w = sc.next();
        String rev = "";
        for (int i = w.length() - 1; i >= 0; i--) {
            rev += w.charAt(i);
        }
        if (w.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
        System.out.println("Original: " + w);
        System.out.println("Reversed: " + rev);
    }
}
