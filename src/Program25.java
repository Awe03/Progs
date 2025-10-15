/*
A number whose square divided into two parts (none of the parts have only 0) and the sum of the parts is equal to the original number (given number) then it is called kaprekar number. 

Example of kaprekar numbers:- 45
The square of 45 = 2025
20 + 25 = 45, so 45 is a kaprekar number. 

10, 100, 1000 are not a kaprekar number
10^2 = 100 => 10 + 0= 10
100^2 = 10000 = 100 + 00 = 100
But the condition is none of the part having only 0, so these are not the kaprekar number. 
*/

import java.util.Scanner;

class Program25 {
    // Declaration of instance variables
    int n = 0;

    // In the function input() we input the number to check
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check for: ");
        n = sc.nextInt();
    }

    // In the function isKaprekar() we check and return whether n is a kaprekar number or not
    boolean isKaprekar() {
        // We convert the square to a string so we can handle splitting easily
        String str = (int) Math.pow(n, 2) + "";

        // We iterate through all possible splits of the square
        for (int i = 1; i <= str.length() - 1; i++) {
            // We split the square into two parts
            int firstNum = Integer.parseInt(str.substring(0, i));
            int secondNum = Integer.parseInt(str.substring(i));

            // If one part is zero
            if (firstNum == 0 || secondNum == 0) return false;
            if (firstNum + secondNum == n) return true;
        }

        return false;
    }

    // In the main method we create an object of the class and call the required functions
    public static void main(String[] args) {
        Program25 obj = new Program25();
        obj.input();
        if (obj.isKaprekar()) System.out.println("It is a kaprekar number");
        else System.out.println("It is not a kaprekar number");
    }
}