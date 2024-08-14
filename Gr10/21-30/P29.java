// Write a program to input a string in lowercase, and turn only the first character. Display the new string.
import java.util.Scanner;

class P29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) newStr += Character.toUpperCase(str.charAt(i));
            else if (str.charAt(i) == ' ') {
                newStr += " " + Character.toUpperCase(str.charAt(i + 1));
                i++;
            } else newStr += str.charAt(i);
        }
        System.out.println("New string: " + newStr);
    }
}