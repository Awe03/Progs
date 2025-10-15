/*
A class Reverse string defines a recursive function to reverse a string and check if it is a palindrome. The details of the class are given below.
Class name: Revstr
Data members / Instance variables:
str: Stores a string
revstr: Stores the reverse of the string
Member functions / Methods:
void getstr(): To accept a string.
void check(): To display the original string, its reverse and whether the string is a palindrome or not.
Specify the class Revstr giving the details of the functions void getstr(), void reverse(int) and void check(). The main function needs to be written.

 */

import java.util.Scanner;

// The class Revstr reverses a string and checks whether it is a palindrome
class Revstr
{
    // Initialization of instance variables
    String str = "", revstr = "";

    // In the function getstr() we accept the string from the user
    void getstr()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = sc.nextLine();

        sc.close();
    }

    // In the function reverse() we reverse the string using recursion
    void reverse(int index)
    {
        if (index == str.length())
            return;
        revstr = str.charAt(index) + revstr;
        reverse(index + 1);
    }

    // In the function check() we display the original string, its reverse and whether it is a palindrome or not
    void check()
    {
        System.out.println("Original string: " + str);
        System.out.println("Reverse string: " + revstr);
        if (str.equals(revstr))
            System.out.println("The string is a palindrome");
        else
            System.out.println("The string is not a palindrome");
    }

    // In the main methods we create an object of the class and call the required functions
    public static void main(String[] args)
    {
        Revstr obj = new Revstr();
        obj.getstr();
        obj.reverse(0);
        obj.check();
    }
}