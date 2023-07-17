// Write a program that encodes a word into Pig Latin.
// To translate word into a Pig Latin word, convert the word into uppercase and then place the first vowel of the original word as the start of the new word along with the remaining alphabets.
// The alphabets present before the vowel are shifted towards the end followed by "AY".
import java.util.Scanner;

class P37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = sc.next();
        String w = str.toUpperCase();
        int i = 0;
        while (i < w.length() && "AEIOU".indexOf(w.charAt(i)) == -1) {
            i++;
        }
        System.out.println(w.substring(i) + w.substring(0, i) + "AY");
        sc.close();
    }
}