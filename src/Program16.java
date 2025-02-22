/*
A class Personal contains employee details and another class Retire contains the employer’s Provident Fund and Gratuity. The details of the two classes are given below
Class name: Personal
Data members / Instance variables:
•	Name: Stores the employee name
•	Pan: Stores the employee PAN number
•	Basic_pay: Stores the employee basic salary (in decimals)
•	Acc_no: Stores the employee bank account number
Member functions:
•	Personal(): Parameterized constructor to assign values to data members
•	void display(): To display employee details

Class name: Retire
Data members / Instance variables:
•	Yrs: Stores the employee years of service
•	Pf: Stores the employee Provident Fund amount (in decimals)
•	Grat: Stores the employee Gratuity amount (in decimals)
Member functions:
•	Retire(): Parameterized constructor to assign values to data members of both classes
•	void provident(): Calculates the PF as (2% of basic pay) *  years of service
•	void gratuity(): Calculates the Gratuity as 12 month salary, if the years of service is more than or equal to 10 years else gratuity amount is nil
•	void display(): Displays the employee details along with the PF (Provident Fund) and Gratuity amount

Specify the class Personal giving details of the constructor and member functions void display(). Using the concept of inheritance, specify the class Retire giving details of the constructor and member functions. Write the main method to implement the classes.
*/

import java.util.Scanner;

// This class contains employee details
class Personal
{
    // Declaration of instance variables
    String Name, Pan, Acc_no;
    double Basic_pay;

    // Constructor that initializes the instance variables
    Personal(String Name, String Pan, double Basic_pay, String
            Acc_no)
    {
        this.Name = Name;
        this.Pan = Pan;
        this.Basic_pay = Basic_pay;
        this.Acc_no = Acc_no;
    }

    // The function display() displays the employee details
    void display()
    {
        System.out.println("Employee Name: " + Name);
        System.out.println("PAN Number: " + Pan);
        System.out.println("Basic Pay: " + Basic_pay);
        System.out.println("Account Number: " + Acc_no);
    }
}

// The class Retire calculates the Provident Fund and Gratuity
class Retire extends Personal
{
    // Declaration of instance variables
    int Yrs;
    double Pf, Grat;

    // Constructor that initializes the instance variables
    Retire(String Name, String Pan, double Basic_pay, String Acc_no,
           int Yrs)
    {
        // We call the parent class constructor to update its instance
        // variables
        super(Name, Pan, Basic_pay, Acc_no);
        // We now update the child class's instance variables
        this.Yrs = Yrs;
    }

    // The function provident() calculates the Provident Fund
    void provident()
    {
        Pf = (0.02 * Basic_pay) * Yrs;
    }

    // The function gratuity() calculates the Gratuity
    void gratuity()
    {
        if (Yrs >= 10)
            Grat = 12 * Basic_pay;
        else
            Grat = 0;
    }

    // The function display() displays the employee details along with
    // the Provident Fund and Gratuity amount
    void display()
    {
        super.display();
        System.out.println("Years of Service: " + Yrs);
        System.out.println("Provident Fund: " + Pf);
        System.out.println("Gratuity: " + Grat);
    }

    // In the main method we obtain input from the user and create an
    // object of the class to call the required functions
    public static void main(String[] args)
    {
        // Obtaining input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee name: ");
        String Name = sc.nextLine();
        System.out.println("Enter the PAN number: ");
        String Pan = sc.nextLine();
        System.out.println("Enter the basic pay: ");
        double Basic_pay = sc.nextDouble();
        System.out.println("Enter the account number: ");
        String Acc_no = sc.next();
        System.out.println("Enter the years of service: ");
        int Yrs = sc.nextInt();

        Retire obj = new Retire(Name, Pan, Basic_pay, Acc_no, Yrs);
        obj.provident();
        obj.gratuity();
        obj.display();

        sc.close();
    }
}
