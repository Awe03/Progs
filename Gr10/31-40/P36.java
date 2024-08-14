// Write a program to input a string and display the reverse order of the words
import java.util.Scanner;

class P36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                rev += str.substring(i + 1) + " ";
                str = str.substring(0, i);
            }
        }
        rev += str;
        System.out.println(rev);
    }
}