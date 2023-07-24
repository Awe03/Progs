// Write a program that encodes a word into Pig Latin.
// To translate word into a Pig Latin word, convert the word into uppercase and then place the first vowel of the original word as the start of the new word along with the remaining alphabets.
// The alphabets present before the vowel are shifted towards the end followed by "AY".
import java.util.Scanner;

class P37i {
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


// Write a program to accept a string and print the word containing the maximum number of vowels
// [NOTE: SCANNER IS ALREADY IMPORTED ABOVE IN THIS CASE, HENCE IT'S NOT WRITTEN HERE. YOU'RE EXPECTED TO IMPORT IT IF WRITING SEPARATELY]
class P37ii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine() + " ";
        String maxWord = "";
        int maxCount = 0, prevWordIndex = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                int vowels = 0;
                String word = str.substring(prevWordIndex, i);
                for (int j = 0; j < word.length(); j++) {
                    if ("AEIOUaeiou".indexOf(word.charAt(j)) != -1) {
                        vowels++;
                    }
                }
                if (vowels > maxCount) {
                    maxWord = word;
                    maxCount = vowels;
                }
                prevWordIndex = i + 1;
            }
        }
        System.out.println("Word with max vowels: " + maxWord);
    }
}