// Write a program in java to create a 4x4 matrix and store integer numbers using scanner class. Find the sum of the elements stored in
// the diagonal positions (from right to left). Display the sum. Also display the diagonal elements (right to left) in matrix form.
import java.util.Scanner;

class P59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][4];
        int sum = 0;
        System.out.println("Enter 16 elements: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 3; j >= 0; j--) {
                if (i + j == 3) {
                    sum += arr[i][j];
                    System.out.print(" " + arr[i][j] + " ");
                }
                else System.out.print(" X ");
            }
            System.out.println();
        }
        System.out.println("Sum: " + sum);
    }
}