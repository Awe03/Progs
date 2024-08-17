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

class Transarray {
    int[][] arr;
    int m;
    int n;

    public Transarray() {
        // Default constructor
    }

    public Transarray(int mm, int nn) {
        m = mm;
        n = nn;
        arr = new int[m][n];
    }

    public void fillArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    public void transpose(Transarray A) {
        int[][] transposedArray = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transposedArray[i][j] = A.arr[j][i];
            }
        }
        A.arr = transposedArray;
    }

    public void disparray() {
        System.out.println("Transposed Array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Program20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();
        Transarray transarray = new Transarray(rows, columns);
        transarray.fillArray();
        transarray.transpose(transarray);
        transarray.disparray();
        scanner.close();
    }
}