// Write a program to input 10 numbers in an array. Find and print the minimum and maximum number present in the array
import java.util.Scanner;

class P42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0], max = arr[0];
        for (int i = 1; i < 10; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}