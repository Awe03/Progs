// Define a class Taximeter having the following description
// Data members
// int taxino [taxi number]
// String name [passenger's name]
// int km [number of kilometers]
// Member functions
// void input() [input everything]
// int calculate [calculate bill per condition]
// |-------------------|-------------------|
// |        km         |      rate/km      |
// |-------------------|-------------------|
// |        to 2       |         25        |
// |        to 6       |         10        |
// |        to 12      |         15        |
// |        to 18      |         20        |
// |    more than 18   |         25        |
// |-------------------|-------------------|
// void display() [to display details]
//   Taxi no         Name         Km         Bill
//     xxx           xxx          xxx        xxx
// Create an object in the main method and call all the above functions
import java.util.Scanner;

class Taximeter {
    int km, taxino;
    String name;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter taxi number: ");
        taxino = sc.nextInt();
        System.out.println("Enter passenger name: ");
        name = sc.nextLine();
        System.out.println("Enter km travelled: ");
        km = sc.nextInt();
    }

    int calculate() {
        int price = 0;
        if (km <= 2) {
            price = km * 25;
        } else if (km <= 6) {
            price = ((km - 1) * 10) + 50;
        } else if (km <= 12) {
            price = ((km - 5) * 15) + 90;
        } else if (km <= 18) {
            price = ((km - 11) * 20) + 150;
        } else {
            price = ((km - 17) * 25) + 210;
        }
        return price;
    }

    void display() {
        Taximeter ob = new Taximeter();
        int res = ob.calculate();
        System.out.println("Taxi number\nName\nKm\nPrice\n" + taxino + "\n" + name + "\n" + km + "\n" + res);
    }

    public static void main(String[] args) {
        Taximeter ob = new Taximeter();
        ob.input();
        ob.display();
    }
}