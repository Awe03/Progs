// Write a program to input 10 numbers in an array. Also, input a number to be searched in the given array using a linear search
// and if the number is present, print the message "Number present in index __" else print the message "Not found in the list"
import java.util.Scanner;

class P49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Arr = new int[10];
        boolean found = false;
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            Arr[i] = sc.nextInt();
        }
        System.out.println("Enter a number to be searched: ");
        int num = sc.nextInt();
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] == num) {
                System.out.println("Number present in index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not found in the list");
        }
    }
}