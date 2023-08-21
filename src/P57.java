// Write a program in java to create a 5x3 matrix and store integer numbers using scanner class. Find the sum of all the elements
// stored in each individual row and each individual column. Display the sum for each row and each column
import java.util.Scanner;

class P57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][3];
        System.out.println("Enter 15 elements: ");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < 5; i++) {
            int rowSum = 0;
            for(int j = 0; j < 3; j++) {
                rowSum += arr[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + " is " + rowSum);
        }
        for(int i = 0; i < 3; i++) {
            int colSum = 0;
            for(int j = 0; j < 5; j++) {
                colSum += arr[j][i];
            }
            System.out.println("Sum of column " + (i + 1) + " is " + colSum);
        }
    }
}