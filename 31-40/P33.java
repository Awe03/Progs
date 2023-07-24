// Write a program in java to accept a word in uppercase and print the string in alphabetical order of it's alphabets.
// Input: COMPUTER
// Output: CEMOPRTU
import java.util.Scanner;

class P33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word in uppercase: ");
        String str = sc.next();
        for (int i = 65; i <= 90; i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == i) {
                    System.out.print(str.charAt(j));
                }
            }
        }
    }
}
