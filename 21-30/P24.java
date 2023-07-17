// sample input: java
// sample output:
// j
// ja
// jav
// java
import java.util.Scanner;

class P24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.substring(0, i + 1));
        }
        sc.close();
    }
}
