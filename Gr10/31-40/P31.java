// Write a program in java to accept a string gin lowercase. Form a new word with the last character of each word and display the same
import java.util.Scanner;

class P31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string in lowercase: ");
        String str = sc.nextLine();
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                newStr += str.charAt(i - 1);
            } else if (i == str.length() - 1) {
                newStr += str.charAt(i);
            }
        }
        System.out.println("New string: " + newStr);
    }
}