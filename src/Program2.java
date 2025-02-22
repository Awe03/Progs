/*
A class convert has been defined to extract digits of an integer. The details of the class are given below:
Class name: Extract
Data members / Instance variables:
•	n: stores an integer
Member functions / Methods:
•	Extract(): Constructor to assign 0 to n
•	void inpnum(): To accept value of n
•	void extDigit(int): To extract digits of n using the recursive technique
Specify the class Extract giving details of the constructor, void inpnum(), and void exDigit(int). Define the main main() function to create an object and call the methods to print the extracted digits.
*/

import java.util.Scanner;

// The class Extract extracts digits from a number
class Extract
{
    // Declaration of instance variables
    int n;

    // Constructor that initializes instance variables
    Extract()
    {
        n = 0;
    }

    // In the function inpnum() we accept the value of n
    void inpnum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        sc.close();
    }

    // In the function extDigit() we extract the digits of n using
    // recursion
    void extDigit(int num)
    {
        if (num == 0)
            return;
        extDigit(num / 10);
        System.out.println(num % 10 + " ");
    }

    // In the main method we create an object of the class and call the
    // required functions
    public static void main(String[] args)
    {
        Extract obj = new Extract();
        obj.inpnum();
        obj.extDigit(obj.n);
    }
}
