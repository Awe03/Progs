/*
An Emirp number is a number which is prime backwards and forwards. For example, 13 and 31 are both prime numbers. Thus 13 is an Emirp number.
Design a class Emirp to check if a given number is Emirp or not. Some of the members of the class are given below:
Class name: Emirp
Data members / Instance variables:
N: Stores the number
rev: Stores the reverse of the number
f: Stores the divisor
Member functions / Methods:
Emirp(int nn): To assign n = nn, rev = 0 and f = 2
int isprime(int x): To check whether the number is prime using the recursive technique and return 1 if prime otherwise return 0
void isEmirp(): Reverse the given number and check if both the original number and the reverse number are prime, by invoking the function isprime(int) and display the result with an appropriate message.
Specify the class Emirp giving details of the constructor(int), isprime(int) and void Emirpt(). Define main() function to create an object and call the methods to check for Emirp number.

 */

import java.util.Scanner;

// The class Emirp checks if a number is an Emirp number
class Emirp
{
    // Declaration of instance variables
    int N, rev, f;

    // Constructor that initializes instance variables
    Emirp(int nn)
    {
        N = nn;
        rev = 0;
        f = 2;
    }

    // In the function isprime() we check if the number is prime
    int isprime(int x)
    {
        if (x == 1)
            return 0;
        if (f == x)
            return 1;
        if (x % f == 0)
            return 0;
        f++;
        return isprime(x);
    }

    // In the function isEmirp() we check if the number is an Emirp number
    void isEmirp()
    {
        // The variable temp stores a copy of the variable N which we can modify
        int temp = N;
        while (temp > 0)
        {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }

        // Now if both the original number and the reversed number are prime then we print that it is an Emirp number
        if (isprime(N) == 1 && isprime(rev) == 1)
            System.out.println(N + " is an Emirp number");
        else
            System.out.println(N + " is not an Emirp number");
    }

    // In the main method we create a Scanner object and an object of the class to obtain input from the user and call the required functions
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number= sc.nextInt();
        sc.close();

        Emirp obj = new Emirp(number);
        obj.isEmirp();
    }
}