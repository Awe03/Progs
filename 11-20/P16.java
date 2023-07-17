// Write a program using a class Hcflcm with the following specifications
// Data members
// int a [first number]
// int b [second number]
// Member functions
// Hcflcm(int x, int y) [Parameterized constuctor to initialize a to x and b to y]
// Print the HCF and LCM of both numbers
import java.util.Scanner;

class Hcflcm {
    int a, b, hcf, lcm;
    Hcflcm(int x, int y) {
        a = x;
        b = y;
    }

    void calculate() {
        hcf = findHCF(a, b);
        lcm = (a * b) / hcf;
    }

    int findHCF(int a, int b) {
        if (b == 0) return a;
        return findHCF(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Hcflcm obj = new Hcflcm(a, b);
        obj.calculate();
        System.out.println("HCF: " + obj.hcf);
        System.out.println("LCM: " + obj.lcm);
    }
}