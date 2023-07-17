// Create a package myPackage that contains the following classes. The description of each class is given along with it

// Classname: Square
// areaSquare(int side) [to calculate area of square and print it]
// perimeterSquare(int side) [to calculate perimeter of square and print it]

// Classname: Rectangle
// areaRectangle(double length, double breadth) [to calculate area of rectangle and print it]
// perimeterRectangle(double length, double breadth) [to calculate perimeter of rectangle and print it]

// Define another java class myClass in another package that can access the methods of myPackage and call the area and perimeter of the Square and Rectangle

// Use different access specifies for the function declaration and check the scope of accessing the methods form one class to another class
package myPackage;
import java.util.Scanner;

class myClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();
        Square s = new Square();

        System.out.println("Enter side of square: ");
        int side = sc.nextInt();
        s.areaSquare(side);
        s.perimeterSquare(side);
        
        System.out.println("Enter length and breadth of rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        r.areaRectangle(l, b);
        r.perimeterRectangle(l, b);
    }
}
