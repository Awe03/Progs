// Write a program to accept a string in uppercase. Form a new word with the first character of each word and display the same.
import java.util.Scanner;

class P30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string in uppercase: ");
        String str = sc.nextLine();
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                newStr += str.charAt(i);
            } else if (str.charAt(i) == ' ') {
                newStr += str.charAt(i + 1);
            }
        }
        System.out.println("New string: " + newStr);
        sc.close();
    }
}