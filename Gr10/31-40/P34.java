// Write a program to accept a string in uppercase and find the frequency of each vowel present in the string
import java.util.Scanner;

class P34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word in uppercase: ");
        String str = sc.next();
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == 'A') a++;
            else if (str.charAt(j) == 'E') e++;
            else if (str.charAt(j) == 'I') i++;
            else if (str.charAt(j) == 'O') o++;
            else if (str.charAt(j) == 'U') u++;
        }
        System.out.println("A: " + a);
        System.out.println("E: " + e);
        System.out.println("I: " + i);
        System.out.println("O: " + o);
        System.out.println("U: " + u);
    }
}