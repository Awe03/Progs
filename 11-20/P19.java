// Write a program to input an alphabet character using Scanner class. If the inputted alphabet is in lowercase, convert it to upper case or vice versa
// and display the result. Display an error message if an alphabet is not entered
import java.util.Scanner;

class P19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet: ");
        char c = sc.next().charAt(0);
        if (!Character.isLetter(c)) throw new IllegalArgumentException("Not an alphabet");
        if (Character.isUpperCase(c)) System.out.println(Character.toLowerCase(c));
        else System.out.println(Character.toUpperCase(c));
        sc.close();
    }
}