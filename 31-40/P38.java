// Write a program to input 10 integers in an array and print them one below the other. Calculate and print the sum and average of the input
import java.util.Scanner;

class P38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 integers: ");
        int[] arr = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        double average = (double) sum / 10;
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}