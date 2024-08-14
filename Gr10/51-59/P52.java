// Write a program to input 10 names in an array. Input a name to be searched and then find the number of occurrences of the name
// in the given array ignoring case using linear search. Display the frequency of the given name
import java.util.Scanner;

class P52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[10];
        System.out.println("Enter 10 names: ");
        for (int i = 0; i < 10; i++) {
            names[i] = sc.nextLine();
        }
        System.out.println("Enter a name to be searched: ");
        String name = sc.nextLine();
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                count++;
            }
        }
        System.out.println("Frequency: " + count);
    }
}