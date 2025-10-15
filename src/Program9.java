/*
Write a program to input n and print the nth Fibonacci term.
 */

import java.util.Scanner;

class Program9 {
    int n = 0;

    // In the function input() we accept the value of n
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();
        sc.close();
    }

    // In the function fibonacci() we calculate the nth term using recursion
    int fibonacci(int num) {
        if (num == 0) return 0;
        if (num == 1) return 1;
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    // In the function display() we print the result
    void display()
    {
        System.out.println("The Fibonacci term at " + n + " is: "    + fibonacci(n));
    }

    // In the main method we create an object of the class and call the required functions
    public static void main(String[] args)
    {
        Program9 obj = new Program9();
        obj.input();
        obj.display();
    }
}