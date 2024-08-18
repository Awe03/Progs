// A transpose of an array is obtained by interchanging the elements of the rows and columns. A class Transarray contains a two dimensional integer array of order [m x n]. The maximum value possible for both ‘m’ and ‘n’ is 20. Design a class Transarray to find the transpose of a given matrix. The details of the members of the class are given below:
// Data members / Instance variables:
// •	arr[][]  :  stores the matrix elements
// •	m  :  integer to store the number of rows
// •	n  :  integer to store the number of column
// Member functions / Methods
// •	TransArray()  :  default constructor
// •	TransArray(int mm, int nn)  :  to initialize the size of the matrix M = mm, n = nn
// •	void fillArray()  :  to enter the elements of the matrix
// •	void transpose(transarray A)  :  to find the transpose of a given matrix
// •	void disparray()  :  displays the array in a matrix form
// Specify the class Transarray giving the details of the constructors and other functions. Write the main method to execute the program.

import java.util.Scanner;

class TransArray {
    int[][] arr;
    int m;
    int n;

    TransArray() {
        // Default constructor
    }

    TransArray(int mm, int nn) {
        m = mm;
        n = nn;
        arr = new int[m][n];
    }

    void fillArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    void transpose(TransArray A) {
        int[][] transposedArray = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transposedArray[i][j] = A.arr[j][i];
            }
        }
        A.arr = transposedArray;
    }

    void disparray() {
        System.out.println("Transposed Array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();
        TransArray obj = new TransArray(m, n);
        obj.fillArray();
        obj.transpose(obj);
        obj.disparray();
    }
}