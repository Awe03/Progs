/*
Write a program to input N and M number of names in two different single dimensional arrays A and B respectively, such that none of them have duplicate names. Merge the arrays A and B into a single array C, such that the resulting array is sorted alphabetically. Display all the three arrays. 
Test your program for the following data and some random data: 

Sample data: 

Input:
Enter the names in array A, N = 2
Enter the names in array B, M = 3
First array: A
Suman
Anil
Second array: B
Usha
Sachin
John 

Output:
Sorted Merged array: C
Anil
John
Sachin
Suman
Usha
Sorted First array: A
Anil
Suman
Sorted Second array: B
John
Sachin
Usha 
 */

import java.util.Scanner;

class Program21 {
    // Declaration of instance variables
    String[] A, B, C;
    int N, M;

    // In the function input() we input N, M and fill the arrays A and B
    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the names in array A, N = ");
        N = sc.nextInt();
        System.out.println("Enter the names in array B, M = ");
        M = sc.nextInt();

        // We initialize and fill the arrays
        A = new String[N];
        B = new String[M];
        C = new String[M+N];

        System.out.println("First Array: A");
        for (int i = 0; i < N; i++) {
            A[i] = sc.next().trim();
        }

        System.out.println("Second Array: B");
        for (int i = 0; i < M; i++) {
            B[i] = sc.next().trim();
        }
    }

    // In the function verify() we verify that there are no duplicates
    void verify() {
        // Using nested for loops we compare each array element
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (A[i].equals(B[j])) {
                    System.out.println("Duplicate found ");
                    System.exit(0);
                }
            }
        }
    }

    // In the function merge() we merge the two arrays
    void merge() {
        int currentIndex = 0;
        for (int i = 0; i < N; i++, currentIndex++) {
            C[currentIndex] = A[i];
        }

        for (int i = 0; i < M; i++, currentIndex++) {
            C[currentIndex] = B[i];
        }
    }

    // In the function sort() we sort the array using bubble sort
    void sort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j+1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // In the function display() we display the merged and sorted array C
    void display() {
        System.out.println("Sorted Merged array: C");
        for (int i = 0; i < M+N; i++) {
            System.out.println(C[i] + " ");
        }

        System.out.println("Sorted First array: A");
        for (int i = 0; i < N; i++) {
            System.out.println(A[i] + " ");
        }

        System.out.println("Sorted Second array: B");
        for (int i = 0; i < M; i++) {
            System.out.println(B[i] + " ");
        }
    }

    // In the main method we create an object of the class and call the required functions
    public static void main(String[] args) {
        Program21 obj = new Program21();
        obj.input();
        obj.verify();
        obj.merge();
        obj.sort(obj.A);
        obj.sort(obj.B);
        obj.sort(obj.C);
        obj.display();
    }
}