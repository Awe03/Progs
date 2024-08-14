// Write a program to initialize two different single dimension arrays of 5 names and telephone numbers of your friends.
// Now arrange all the names in alphabetical order using Bubble sort technique and display all the names along with their
// respective telephone numbers
import java.util.Scanner;

class P55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        long[] tel = new long[5];
        System.out.println("Enter 5 names and their respective numbers: ");
        for (int i = 0; i < 5; i++) {
            names[i] = sc.next();
            tel[i] = sc.nextLong();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    String ntemp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = ntemp;
                    long ttemp2 = tel[j];
                    tel[j] = tel[j + 1];
                    tel[j + 1] = ttemp2;
                }
            }
        }
        System.out.println("Names\t\tNumbers");
        for (int i = 0; i < 5; i++) {
            System.out.println(names[i] + "\t\t" + tel[i]);
        }
    }
}