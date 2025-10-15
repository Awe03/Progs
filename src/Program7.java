/*
Design a class to determine of the class is a Special Number or not. In a Special Number the sum of the factorial of digits is equal to the number itself.
 */

import java.util.Scanner;

// The class SpecialNumber determines if a number is a Special Number or not
class SpecialNumber
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

    // In the function factorial() we calculate the factorial of a number
    int factorial(int num)
    {
        if (num == 0)
            return 1;
        return num * factorial(num - 1);
    }

    // In the function isSpecial() we check if the number is a Special Number
    boolean isSpecial(int num)
    {
        String str = Integer.toString(num);
        int sum = 0;
        for (int currentIndex = 0; currentIndex < str.length(); currentIndex++)
        {
            int digit = Integer.parseInt(String.valueOf(str.charAt(currentIndex)));
            sum += factorial(digit);
        }

        return sum == num;
    }

    // In the function display() we print the original number and if it is a Special Number
    void display()
    {
        if (isSpecial(number))
            System.out.println(number + " is a Special Number");
        else
            System.out.println(number + " is not a Special Number");
    }

    // In the main method we create an object of the class and call the required functions
    public static void main(String[] args)
    {
        SpecialNumber obj = new SpecialNumber();
        obj.input();
        obj.display();
    }
}
