// Write a program to input the names of students in an array using scanner class. Print the array elements in ascending order using selection sort.
import java.util.Scanner;

class P47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[6];
        System.out.println("Enter 6 names: ");
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine();
        }
        System.out.println("Names: ");
        for (int i = 0; i < names.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < names.length; j++) {
                if (names[j].compareTo(names[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String temp = names[i];
            names[i] = names[minIndex];
            names[minIndex] = temp;
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}