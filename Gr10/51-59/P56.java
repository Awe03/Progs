// Write a program to initialize a two-dimensional integer array of size 3x3 using Scanner class. Calculate the sum of all elements.
// Display the array elements in a matrix form and print the sum

import java.util.Scanner;

class P56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int sum = 0;
        System.out.println("Enter 9 elements: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Array: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}