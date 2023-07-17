// Create the following overloaded function and write a main method to call the function based on the user's choice
// i) volume(int side) to find and return volume of a cube
// ii) volume(double l, double b, double h) to find out and return volume of a cuboid
// iii) volume(double r, double h) to find out and return volume of a cylinder using πr²h

import java.util.Scanner;

class P6 {
    int volume(int s) {
        return (int) Math.pow(s, 3);
    }

    double volume(double l, double b, double h) {
        return l * b * h;
    }

    double volume(double r, double h) {
        return (double) 22 / 7 * Math.pow(r, 2) * h;
    }

    public static void main(String[] args) {
        P6 obj = new P6();
        Scanner sc = new Scanner(System.in);
        char ch;
        do {
            System.out.println("Choose one of the options below:\n1. Volume of cube\n2. Volume of cuboid\n3. Volume of cylinder");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter side of cube:");
                    int side = sc.nextInt();
                    System.out.println("Volume: " + obj.volume(side));
                    break;
                case 2:
                    System.out.println("Enter length: ");
                    double l = sc.nextDouble();
                    System.out.println("Enter breadth: ");
                    double b = sc.nextDouble();
                    System.out.println("Enter height: ");
                    double h = sc.nextDouble();
                    System.out.println("Volume: " + obj.volume(l, b, h));
                    break;
                case 3:
                    System.out.println("Enter radius: ");
                    double r = sc.nextDouble();
                    System.out.println("Enter height: ");
                    h = sc.nextDouble();
                    System.out.println("Volume: " + obj.volume(r, h));
                    break;
                default:
                        throw new IllegalArgumentException("Invalid choice");
            }
            System.out.println("Do you want to go again?\nY/N");
            ch = sc.next().charAt(0);
        } while (ch == 'Y');
    }
}