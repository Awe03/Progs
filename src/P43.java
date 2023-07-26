// Write a program to input 4 characters in an array. Print the characters in descending order using bubble sort
import java.util.Scanner;

class P43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[4];
        System.out.println("Enter 4 characters: ");
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.next().charAt(0);
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("The characters are: ");
        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i]);
        }
    }
}