// A class Sum is defined as follows
// Private members
// num [long int variable]
// Public member functions
// Sum(long int n) [Parameterized constructor to store value of int n to num]
// long int FindSum() [To find and return the sum of digits of num]
// Write a main method to create an object of the class and by invoking suitable functions, print the sum of digits along with number entered
import java.util.Scanner;

class Sum {
    long num;

    Sum(long n) { num = n; }

    long FindSum() {
        long sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        Sum obj = new Sum(sc.nextLong());
        System.out.println("Number: " + obj.num);
        System.out.println("Sum of digits: " + obj.FindSum());
    }
}
