/*
Design a class Factorial to compute the factorial of a number
Class name: Factorial
Data members:
•	n: Integer whose factorial is to be calculated
•	f: Stores the factorial
Member functions:
•	Factorial(): Constructor to initialize variables
•	void read(): To accept the value of the number
•	void fact(): To calculate the factorial of a number recursively
•	void display(): To display the number and the factorial
Specify the class Factorial giving details to void read(), fact(), and display(). Define main. Create an object and call the methods
*/

/*
Algorithm:
Algorithm for public static void main (String[] args) method:
Step 1: Start.
Step 2: Create an object of the class Factorial and call the functions read() and display().
Step 3: End.

Algorithm for Factorial () constructor:
Step 1: Start.
Step 2: Initialize the instance variables n to 0 and f to 1.
Step 3: End.

Algorithm for void read () method:
Step 1: Start.
Step 2: Create a Scanner object, and accept and store the value of n, finally closing the scanner object.
Step 3: End

Algorithm for void fact () method:
Step 1: Start.
Step 2: If n is equal to 1, indicating that we have reached the end, terminate the function using return. We need not multiply it with 1 as it produces no difference.
Step 3: Otherwise multiply f by n, decrement n and then recursively call the function again.
Step 4: End.

Algorithm for void display () method:
Step 1: Start.
Step 2: Print the original value of the number n. Call the function fact() to calculate the factorial then print the value of the factorial f.
Step 3: End.
*/

import java.util.Scanner;

// This class calculates the factorial of a number
class Factorial
{
    // Initialization of instance variables
    int n, f;

    // Constructor that initializes variables
    Factorial()
    {
        n = 0;
        f = 1;
    }

    // In the function read() we accept the value of n
    void read()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n = sc.nextInt();

        sc.close();
    }

    // In the function fact() we calculate the factorial recursively
    void fact()
    {
        if (n == 1)
            return;
        else
        {
            f *= n;
            n--;
            fact();
        }
    }

    // In the function display() we print the original number, call
    // factorial() and print the factorial
    void display()
    {
        System.out.println("Original number: " + n);
        fact();
        System.out.println("Factorial: " + f);
    }

    // In the main method we create an object of the class and call
    // the functions read() and display()
    public static void main(String[] args)
    {
        Factorial obj = new Factorial();
        obj.read();
        obj.display();
    }
}
