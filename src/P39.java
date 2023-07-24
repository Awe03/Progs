// Write a program to input 5 names in an array and print the output in reverse order of input
import java.util.Scanner;

class P39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 names: ");
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextLine();
        }
        for (int i = 4; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}