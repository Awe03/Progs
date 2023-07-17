// Write a program to input a string, toggle each char of it and print it.
import java.util.Scanner;

class P21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine(), res = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) res+=Character.toLowerCase(c);
            else if (Character.isLowerCase(c)) res+=Character.toUpperCase(c);
            else res+=c;
        }
        System.out.println(res);
        sc.close();
    }
}
