/*
Design a class Library and another class Compute to perform the task. The details of the two classes are given below:
Class name: Library
Member functions:
•	Library(): Parameterized constructor to assign values to data members
•	void show(): Displays the book details

Class name: Compute
Data members / Instance variables:
•	D: Number of days taken in returning the book to store the fine
Member functions:
•	Compute(): Parameterized constructor to assign values to data members of both classes
•	void fine(): Calculates the fine for excess days
•	void display(): Displays the book details along with number of days, fine and the total amount to be paid.
Total amount is calculated as (2% of price of book * total number of days) + fine.
*/

/*
Algorithm:
Algorithm for public static void main (String[] args) method:
Step 1: Start.
Step 2: Create a scanner object and obtain input from the user for the book's name, author, price, and number of days taken in returning the book.
Step 3: Create an object of the class Compute, passing all the inputted values as parameters to the constructor and call fine() and display()
Step 4: End.

Algorithm for Library(String name, String author, double price) constructor:
Step 1: Start.
Step 2: Assign the values of the parameters to the instance variables name, author, and p.
Step 3: End.

Algorithm for void show() method:
Step 1: Start.
Step 2: Print the name, author, and price of the book.
Step 3: End.

Algorithm for Compute(String name, String author, double price, int days) constructor:
Step 1: Start.
Step 2: Using bubble sort, first sort the array in descending order.
Step 3: Call the parent class’s constructor using super() to initialize the parent class’s instance variables.
Step 4: Assign the parameter days to the instance variable D.
Step 5: End.

Algorithm for void fine() method:
Step 1: Start.
Step 2: Create an int variable fine with default value 0.
Step 3: If the number of days D is more than 10, set fine to 100.
Step 4: End.

Algorithm for void display() method:
Step 1: Start.
Step 2: Call the show() method of the parent class to display book details.
Step 3: We need to recalculate the fine since we cannot access the variable fine from the function fine(). Thus, create an int variable fine with default value 0 and if the number of days D is more than 10, set fine to 100.
Step 4: Print the number of days, fine, and total amount to be paid.
Step 5: End.
*/
import java.util.Scanner;

// This class manages book details
class Library
{
    // Declaration of instance variables
    String name, author;
    double p;

    // Constructor that assigns values to instance variables
    Library(String name, String author, double price)
    {
        this.name = name;
        this.author = author;
        this.p = price;
    }

    // In the function show() we display the book details
    void show()
    {
        System.out.println("Name of the book: " + name);
        System.out.println("Author of the book: " + author);
        System.out.println("Price of the book: " + p);
    }
}

// The class Compute defines the child class
class Compute extends Library
{
    // Declaration of instance variables
    int D;

    // In the constructor Compute() we accept values for all the instance
    // variables of both classes, and update both the classes
    Compute(String name, String author, double price, int days)
    {
        // We call the parent class constructor to update its instance
        // variables
        super(name, author, price);
        // We now update the child class’s instance variable
        D = days;
    }

    // The function fine() calculates the fine for the excess days
    void fine()
    {
        // If the days are > 10 then fine is 100
        int fine = 0;
        if (D > 100)
            fine = 100;
    }

    // In the function display() we display the book details, number of
    // days, fine and total amount to be paid
    void display()
    {
        // To display book details we need to call the parent class’s
        // show() function
        show();

        // We must recalculate the fine to print it
        int fine = 0;
        if (D > 10)
            fine = 100;

        // We print the details such as number of days, fine and
        // amount to be paid
        System.out.println("Number of days: " + D);
        System.out.println("Fine to be paid: " + fine);
        System.out.println("Total amount to be paid: " + ((0.2d * p *
                D) + fine));
    }

    // In the main method we obtain input from the user, create an
    // object of the child class and call the required methods
    public static void main(String[] args)
    {
        // We obtain input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the book: ");
        String name = sc.nextLine();
        System.out.println("Enter the author of the book: ");
        String author = sc.nextLine();
        System.out.println("Enter the price of the book: ");
        double price = sc.nextDouble();
        System.out.println("Enter the number of days taken in returning the book: ");
        int days = sc.nextInt();

        // Now we create an object of the class and call the
        // required functions
        Compute obj = new Compute(name, author, price, days);
        obj.fine();
        obj.display();
    }
}
