// Write a program to print all prime numbers between 2 numbers entered by the user with the following functions
// boolean isPrime(int n) [to return true if n is prime, else false]
// void showPrime(int s, int e) [to print all prime numbers by invoking isPrime()]
import java.util.Scanner;

class P4 {
    boolean isPrime(int n) {
        boolean prime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) prime = false;
        }
        return prime;
    }

    void showPrime(int s, int e) {
        for (int i = s; i <= e; i++) {
            if (isPrime(i)) System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P4 obj = new P4();
        System.out.print("Enter start: ");
        int s = sc.nextInt();
        System.out.print("Enter end: ");
        int e = sc.nextInt();
        obj.showPrime(s, e);
    }
}
