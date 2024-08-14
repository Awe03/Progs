// Write a program to input a string and print the nymber of alphabets, digits, whitespaces and special characters
import java.util.Scanner;

class P20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String st = sc.nextLine();
        int a = 0, n = 0, w = 0, s = 0;
        for (int i = 0; i < st.length(); i++) {
            char c = st.charAt(i);
            if (Character.isLetter(c)) a++;
            else if (Character.isDigit(c)) n++;
            else if (Character.isWhitespace(c)) w++;
            else s++;
        }
        System.out.println("Alphabets: " + a);
        System.out.println("Numbers: " + n);
        System.out.println("White spaces: " + w);
        System.out.println("Special characters: " + s);
    }
}