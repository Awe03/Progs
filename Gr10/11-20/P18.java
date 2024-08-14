// Write a program to input a character using Scanner class and find whether it is an alphabet, digit, whitespace or special character
// Display the appropriate message
import java.util.Scanner;

class P18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char c = sc.next().charAt(0);

        if (Character.isAlphabetic(c)) System.out.println("Alphabet");
        else if (Character.isDigit(c)) System.out.println("Digit");
        else if (Character.isWhitespace(c)) System.out.println("Whitespace");
        else System.out.println("Special Character");
    }
}
