/*
Design a class to calculate the value of m^n using a recursive function.
 */

import java.util.Scanner;

// The class Power calculates the value of m^n using recursion
class Power
{
    // Initialization of instance variables
    int m, n, result;

    // In the function input() we accept the values of m and n from the user
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of m: ");
        m = sc.nextInt();
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();
        sc.close();
    }

    // In the function power() we calculate the value of m^n using recursion
    int power(int m, int n)
    {
        if (n == 0)
            return 1;
        return m * power(m, n - 1);
    }

    // In the function display() we print the original numbers and the result
    void display()
    {
        System.out.println("Original numbers: m = " + m + ", n = " + n);
        result = power(m, n);
        System.out.println("Result: " + result);
    }

    // In the main method we create an object of the class and call the required functions
    public static void main(String[] args)
    {
        Power obj = new Power();
        obj.input();
        obj.display();
    }
}