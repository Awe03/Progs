//  Write a program to input 2 words.
//  If both the words are of same length, print "Equal in length" else print "Unequal in length" and also find and display the longer one.
import java.util.Scanner;

class P26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String w1 = sc.next();
        sc.nextLine(); // consume the other word, in case entered [OPTIONAL YOU DON'T HAVE TO WRITE THIS]
        System.out.print("Enter second word: ");
        String w2 = sc.next();
        if (w1.length() == w2.length()) {
            System.out.println("Equal in length");
        } else {
            System.out.println("Unequal in length");
            if (w1.length() > w2.length()) {
                System.out.println(w1 + " is longer");
            } else {
                System.out.println(w2 + " is longer");
            }
        }
    }
}
