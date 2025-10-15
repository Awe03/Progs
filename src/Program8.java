/*
Using techniques of recursion check determine if a number is prime or not.
 */

import java.util.Scanner;

// The class Prime checks if a number is prime
class Prime
{
    // Initialization of instance variables
    int number = 0;

    // In the function input(0 we accept the value of the number
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        sc.close();
    }

    // In the function isPrime() we check if the number is prime
    boolean isPrime(int divisor)
    {
        // 1 is not a prime number
        if (number == 1)
            return false;
        if (number % divisor == 0)
            return false;
        if (divisor == number - 1)
            return true;
        return isPrime(++divisor);
    }

    // In the function display() we print the original number and if it is prime
    void display()
    {
        if (isPrime(2))
            System.out.println(number + " is a prime number");
        else
            System.out.println(number + " is not a prime number");
    }

    // In the main method we create an object of the class and call the required functions
    public static void main(String[] args)
    {
        Prime obj = new Prime();
        obj.input();
        obj.display();
    }
}
