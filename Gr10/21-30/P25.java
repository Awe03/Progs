// sample input: I love java programming
// sample output:
// I
// I love
// I love java
// I love java programming
import java.util.Scanner;

class P25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                System.out.println(s.substring(0, i));
            }
        }
        System.out.println(s);
    }
}