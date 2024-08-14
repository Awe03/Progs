// Define a class Equation to print the results of the following with the help of given functions.
// n!/(r!*(n-r)!)
import java.util.Scanner;

class P3 {
    int fact (int num) {
        int f = 1;
        for (int i = 1; i <= num; i++) {
            f *= i;
        }
        return f;
    }

    void PrintResult(int r, int n) {
        int result = fact(n) / (fact(r) * fact(n - r));
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P3 obj = new P3();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();
        obj.PrintResult(r, n);
    }
}
