/*
A Smith number is a composite number, whose sum of the digits is equal to the sum of its prime factors. For example:
4, 22, 27, 58, 85, 94, 121 ………. are Smith numbers. 

Write a program in Java to enter a number and check whether it is a Smith number or not. 

Sample Input: 666
Sum of the digits: 6 + 6 + 6 = 18
Prime factors are: 2, 3, 3, 37
Sum of the digits of the prime factors: 2 + 3 + 3 + (3 + 7) = 18
Thus, 666 is a Smith Number. 
 */

import java.util.Scanner;

class Program24 {
    // Declaration of instance variables
    int n = 0;

    // In the function input() we input the number to check
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check for: ");
        n = sc.nextInt();
    }

    // In the function isSmith() we check and return whether n is a Smith number or not
    boolean isSmith() {
        // Check if number is prime (Smith numbers must be composite)
        boolean isPrime = true;
        if (n <= 1) return false;
        if (n == 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) return false;

        // Calculate sum of digits of n
        int digitSum = 0;
        int temp = n;
        while (temp > 0) {
            digitSum += temp % 10;
            temp /= 10;
        }

        // Calculate sum of digits of prime factors
        int primeFactorSum = 0;
        temp = n;
        for (int i = 2; i <= temp; i++) {
            while (temp % i == 0) {
                int factor = i;
                while (factor > 0) {
                    primeFactorSum += factor % 10;
                    factor /= 10;
                }
                temp /= i;
            }
        }

        return digitSum == primeFactorSum;
    }

    // In the main method we create an object of the class and call the required functions
    public static void main(String[] args) {
        Program24 obj = new Program24();
        obj.input();
        if (obj.isSmith()) System.out.println("It is a Smith number");
        else System.out.println("It is not a Smith number");
    }
}