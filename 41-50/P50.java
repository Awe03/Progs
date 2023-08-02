// Write a program to input 5 names in an array. Input the name to be searched and then print the first occurrence in the array using linear search
import java.util.Scanner;

class P50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        System.out.println("Enter 5 names: ");
        for (int i = 0; i < 5; i++) {
            names[i] = sc.nextLine();
        }
        System.out.println("Enter name to be searched: ");
        String str = sc.nextLine();
        int index = 0;
        for (int i = 0; i < 5; i++) {
            if (names[i].equals(str)) {
                index = i;
                break;
            }
        }
        System.out.println(names[index] + " found at index " + index);
    }
}