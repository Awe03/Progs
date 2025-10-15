/*
Write a program to declare a square matrix A[][] of order M × M where ‘M’ is the number of rows and the number of columns, such that M must be greater than 2 and less than 10. 
a) Accept the value of M as user input. Display an appropriate message for an invalid input. Allow the user to input integers into this matrix. Perform the following tasks:
b) Display the original matrix.
c) Check if the given matrix is said to be symmetric or not. 
A square matrix is said to be symmetric, if the element of the ith row and jth column is equal to the element of the jth row and ith column.
Find the sum of the elements of left diagonal and the sum of the elements of right diagonal of the matrix and display them. 

Example 1
INPUT:
M = 3
Enter elements of the matrix:
1 2 3
2 4 5
3 5 6
OUTPUT:
ORIGINAL MATRIX
1 2 3
2 4 5
3 5 6
THE GIVEN MATRIX IS SYMMETRIC.
THE SUM OF THE LEFT DIAGONAL = 11
THE SUM OF THE RIGHT DIAGONAL = 10 

Example 2
INPUT:
M = 4
Enter elements of the matrix:
7 8 9 2
4 5 6 3
8 5 3 1
7 6 4 2
OUTPUT:
ORIGINAL MATRIX
7 8 9 2
4 5 6 3
8 5 3 1
7 6 4 2
THE GIVEN MATRIX IS NOT SYMMETRIC.
THE SUM OF THE LEFT DIAGONAL = 17
THE SUM OF THE RIGHT DIAGONAL = 20 

Example 3
INPUT: M = 12
OUTPUT: SIZE IS OUT OF RANGE. 
 */

import java.util.Scanner;

class Program20 {
    int[][] matrix;
    int M;
    Scanner sc = new Scanner(System.in);

    // In the function inputSize() we input and validate M
    void inputSize() {
        System.out.println("M: ");
        M = sc.nextInt();

        if (M <= 2 || M >= 10) {
            System.out.println("SIZE IS OUT OF RANGE.");
            System.exit(0);
        }

        matrix = new int[M][M];
    }

    // In the method inputMatrix() we fill the matrix
    void inputMatrix() {
        System.out.println("Enter elements of the matrix: ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    // In the function displayMatrix() we display the original matrix using a for loop
    void displayMatrix() {
        System.out.println("ORIGINAL MATRIX");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // In the function isSymmetric() we check and return whether the matrix is symmetric
    void isSymmetric() {
        boolean isSymmetric = true;

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
            if (!isSymmetric) break;
        }

        if (isSymmetric) {
            System.out.println("THE GIVEN MATRIX IS SYMMETRIC.");
        } else {
            System.out.println("THE GIVEN MATRIX IS NOT SYMMETRIC.");
        }
    }

    // In the method calculateDiagonalSums() we calculate and print the sum of left and right diagonals of the matrix
    void calculateDiagonalSums() {
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;

        for (int i = 0; i < M; i++) {
            leftDiagonalSum += matrix[i][i];
            rightDiagonalSum += matrix[i][M - 1 - i];
        }

        System.out.println("THE SUM OF THE LEFT DIAGONAL = " + leftDiagonalSum);
        System.out.println("THE SUM OF THE RIGHT DIAGONAL = " + rightDiagonalSum);
    }

    // In the main method we create an object of the class to call the required functions
    public static void main(String[] args) {
        Program20 obj = new Program20();
        obj.inputSize();
        obj.inputMatrix();
        obj.displayMatrix();
        obj.isSymmetric();
        obj.calculateDiagonalSums();
    }
}