/*
Implement the following class hierarchy.
Bank Acc -> Saving Acc

Class Bank Acc contains details about the account holder. New account no. is obtained via a static member AccNo. Which is incremented with account creation. It has methods deposit() and withdraw() along with getBalance() and display().
Class Saving Acc inherits from Bank Acc and additionally stores Rate of Interest (monthly). It has a method addInterest() that computes interest and adds it to balance. It overrides display() method of Bank Acc.
*/

import java.util.Scanner;

// The class BankAcc contains details about the account holder
class BankAcc
{
    // Declaration of instance variables
    protected int accountNumber;
    protected double balance;
    protected static int AccNo = 0;

    // Constructor that initializes the instance variables
    BankAcc(double balance)
    {
        this.balance = balance;
        accountNumber = AccNo++;
    }

    // The function deposit() adds the inputted amount to the balance
    void deposit(double amount)
    {
        balance += amount;
        System.out.println("Amount deposited successfully.");
    }

    // The function withdraw() subtracts the amount from the balance
    void withdraw( double amount)
    {
        balance -= amount;
        System.out.println("Amount withdrawn successfully.");
    }

    // The function getBalance() returns the balance
    double getBalance()
    {
        return balance;
    }

    // The function display() prints out all the attribute values
    void display()
    {
        System.out.println("Account number = " + accountNumber);
        System.out.println("Balance = " + getBalance());
    }
}

// The class SavingAcc inherits from BankAcc and contains the rate of
// interest
class SavingAcc extends BankAcc
{
    // Declaration of instance variables
    double RateOfInterest;

    // Constructor that initializes the instance variables
    SavingAcc(double balance, double RateOfInterest)
    {
        // We call the parent class constructor to update its instance
        // variables
        super(balance);
        // We now update the child class's instance variables
        this.RateOfInterest = RateOfInterest;
    }

    // The function addInterest() calculates the interest and adds it to
    // the balance
    void addInterest()
    {
        balance += balance * RateOfInterest / 100;
        System.out.println("Interest added successfully.");
    }

    // The function display() prints out all the attribute values
    void display()
    {
        super.display();
        System.out.println("Rate of Interest = " + RateOfInterest);
    }

    // In the main method we obtain input from the user and create an
    // object of the class and call the required functions
    public static void main(String[] args)
    {
        // We obtain the initial balance and rate of interest from the
        // user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial balance: ");
        double balance = sc.nextDouble();
        System.out.println("Enter the rate of interest: ");
        double rateOfInterest = sc.nextDouble();
        System.out.println("Enter the amount to deposit: ");
        double depositAmount = sc.nextDouble();
        System.out.println("Enter the amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();

        SavingAcc obj = new SavingAcc(balance, rateOfInterest);
        obj.display();
        obj.deposit(depositAmount);
        obj.display();
        obj.withdraw(withdrawAmount);
        obj.display();
        obj.addInterest();
        obj.display();

        sc.close();
    }
}
