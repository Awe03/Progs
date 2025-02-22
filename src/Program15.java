/*
A financial institution has only two kinds of accounts, Simple and Compound. The class Account has two protected attributes accountNumber (a positive integer) and Principal (a double precision real number to store the money deposited initially). The interest for a Simple account is calculated using the Simple Interest formula:
SI=PRT/100
Where SI – Simple Interest, P – Principal, R – Rate of Interest per annum, T – Time in years. The interest for a Compound account is calculated by using the Compound Interest formula:
CI=P(1+R/100)^T
Where CI – Compound Interest, P – Principal, R – Rate of Interest per annum, T – Time in years. Rate and Time for two kinds of accounts may vary.
Model the above situation by defining classes Account, Simple and Compound where Simple and Compound are derived classes from class Account.
Write appropriate constructors for passing various attributes for the three classes.
Write the functions double interest() that calculates the appropriate interest and return the interest for the classes Simple and Compound.
Also write the function display() for the three classes which prints out all the attribute values as
Account number = ……….
Principal = ……….
Rate = ……….
Time = ……….
Interest = ……….
With each attribute on a single line. Make sure that each display() function is correctly placed within the appropriate class. Write the main method to call the functions
*/
import java.util.Scanner;

// This class managed the account details

class Account
{
    // Declaration of instance variables
    protected int accountNumber;
    protected double Principal;

    // Constructor that initializes the instance variables
    Account(int accountNumber, double Principal)
    {
        this.accountNumber = accountNumber;
        this.Principal = Principal;
    }

    // The function display() prints out all the attribute values
    void display()
    {
        System.out.println("Account number = " + accountNumber);
        System.out.println("Principal = " + Principal);
    }
}

// The class Simple defines the calculation of Simple Interest
class Simple extends Account
{
    // Declaration of instance variables
    double RateOfInterest;
    int Time;

    // Constructor that initializes the instance variables
    Simple(int accountNumber, double Principal, double
            RateOfInterest, int Time)
    {
        // We call the parent class constructor to update its instance
        // variables
        super(accountNumber, Principal);
        // We now update the child class's instance variables
        this.RateOfInterest = RateOfInterest;
        this.Time = Time;
    }

    // The function interest() calculates the Simple Interest
    double interest()
    {
        return (Principal * RateOfInterest * Time) / 100;
    }

    // The function display() prints out all the attribute values
    void display()
    {
        super.display();
        System.out.println("Rate = " + RateOfInterest);
        System.out.println("Time = " + Time + " years");
        System.out.println("Interest = " + interest());
    }

    // In the main method we create an object of the class and call the
    // required functions
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.println("Enter Principal: ");
        double Principal = sc.nextDouble();
        System.out.println("Enter rate of interest: ");
        double RateOfInterest = sc.nextDouble();
        System.out.println("Enter time: ");
        int Time = sc.nextInt();
        Simple obj = new Simple(accountNumber, Principal,
                RateOfInterest, Time);
        obj.interest();
        obj.display();
        sc.close();
    }
}

// The class Compound defines the calculation of Compound Interest
class Compound extends Account
{
    // Declaration of instance variables
    double RateOfInterest;
    int Time;

    // Constructor that initializes the instance variables
    Compound(int accountNumber, double Principal, double
            RateOfInterest, int Time)
    {
        // We call the parent class constructor to update its instance
        // variables
        super(accountNumber, Principal);
        // We now update the child class's instance variables
        this.RateOfInterest = RateOfInterest;
        this.Time = Time;
    }

    // The function interest() calculates the Simple Interest
    double interest()
    {
        return Principal * Math.pow((1 + RateOfInterest / 100),
                Time) - Principal;
    }

    // The function display() prints out all the attribute values
    void display()
    {
        super.display();
        System.out.println("Rate = " + RateOfInterest);
        System.out.println("Time = " + Time);
        System.out.println("Interest = " + interest());
    }

    // In the main method we create an object of the class and call the
    // required functions
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.println("Enter Principal: ");
        double Principal = sc.nextDouble();
        System.out.println("Enter rate of interest: ");
        double RateOfInterest = sc.nextDouble();
        System.out.println("Enter time: ");
        int Time = sc.nextInt();
        Compound obj = new Compound(accountNumber, Principal,
                RateOfInterest, Time);
        obj.interest();
        obj.display();
        sc.close();
    }
}