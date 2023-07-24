// Write a program to input 10 non-zero numbers in an array and find the count of even numbers and odd numbers
// Print the total count of even numbers and odd numbers present in the array
import java.util.Scanner;

class P41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int even = 0, odd = 0;
        System.out.println("Enter 10 non-zero numbers: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}