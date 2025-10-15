/*
Write a program to print the multiplication table of any number entered by the user using the concept of recursion. The table of factors will range from zero to ten.
 */

import java.util.Scanner;

// The class Multiplication prints the multiplication table of a number
class Multiplication
{
    // Initialization of instance variables
    int number = 0;

    // In the function input() we accept the value of the number
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        sc.close();
    }

    // In the function multiply() we calculate the multiplication table using recursion
    void multiply(int num, int currentMultiplier)
    {
        if (currentMultiplier > 10)
            return;
        else
        {
            System.out.println(num + " x " + currentMultiplier + " = " + num *
                    currentMultiplier);
            multiply(num, currentMultiplier + 1);
        }
    }

    // In the main method we create an object of the class and call the required functions
    public static void main(String[] args)
    {
        Multiplication obj = new Multiplication();
        obj.input ();
        obj.multiply(obj.number, 0);
    }
}