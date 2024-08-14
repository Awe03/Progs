// Write a program to accept a string and a word. Find and display the number of times a word appears in a sentence.
// Sample input:
// Enter a sentence: You have to dream before the dream comes true
// Enter a word: dream
// Sample output:
// dream appears 2 times

import java.util.Scanner;

class P35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        System.out.print("Enter a word: ");
        String w = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == w.charAt(0)) {
                int j = 0;
                while (j < w.length() && i < str.length() && str.charAt(i) == w.charAt(j)) {
                    i++;
                    j++;
                }
                if (j == w.length()) count++;
            }
        }
        System.out.println(w + " appears " + count + " times");
    }
}