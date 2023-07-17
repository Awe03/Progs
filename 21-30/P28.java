// Write a program to accept a string and count and replace all the vowels with the letter 'z'.
// Display the original string, the number of vowels and the new string.
import java.util.Scanner;

class P28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int count = 0;
        String newStr = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ("aeiouAEIOU".indexOf(c) != -1) {
                count++;
                newStr += 'z';
            } else {
                newStr += c;
            }
        }
        System.out.println("Original: " + s);
        System.out.println("Vowels: " + count);
        System.out.println("New: " + newStr);
    }
}
