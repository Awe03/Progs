/*
Given a 2-D array, write a program to print it out in spiral order. Implement Spiral with the following specifications
Class name: Spiral
Instance Variables:
Array a to hold N x N array
int N to hold the value of N
Member methods:
Constructor method: Receives parameter N and creates an N x N array with values 1 to N
printNormal(): Prints the array in normal order
printSpiral(): Prints the array in spiral order
Also create method main() that should obtain the value of N and then create and print the array.
 */

import java.util.Scanner;

class Spiral {
    int[][] a;
    int N;

    Spiral(int N) {
        this.N = N;
        this.a = new int[N][N];

        // We now fill the array
        int count = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = count;
                count++;
            }
        }
    }

    void printNormal() {
        System.out.println("Printing normally");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    void printSpiral() {
        int top = 0, bottom = N - 1;
        int left = 0, right = N - 1;

        System.out.println("Printing Spiral");
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.print(a[top][i] + " ");
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                System.out.print(a[i][right] + " ");
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(a[bottom][i] + " ");
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(a[i][left] + " ");
                }
                left++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int N = sc.nextInt();

        Spiral obj = new Spiral(N);

        obj.printNormal();
        obj.printSpiral();
    }
}