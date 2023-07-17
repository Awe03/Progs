// Create a function void check (int x, int y, char ch) that accepts and arithmetic operator (+, -, /, *) in ch and 2 integers in x and y
// Now on the basis of the operator stored in ch, perform the operation on x and y and print the result
// Write a main function to input 2 integers and an operator and by invoking function check () to print the output
import java.util.Scanner;
class P1 {
    void check(int x, int y, char ch) {
        switch (ch) {
            case '+':
                System.out.println(x + y);
                break;
            case '-':
                System.out.println(x - y);
                break;
            case '/':
                System.out.println(x / y);
                break;
            case '*':
                System.out.println(x * y);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 integers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.print("Enter an operator: ");
        char ch = sc.next().charAt(0);
        P1 obj = new P1();
        obj.check(x, y, ch);
        sc.close();
    }
}
