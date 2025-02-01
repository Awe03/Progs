/*
A class Student defines student related information such as name, roll number and date of birth while another class Marks defines marks in various subjects, total percentage and grade of the student. The details of both classes are given below.
Class name: Student
Data members:
•	String name: Stores name
•	String DOB: Stores date of birth
•	Int roll: Stores roll number
Member functions:
•	void inputData(): To input value of all data members
•	void printData(): To display value of all data members with suitable heading

Class name: Marks
Data members:
•	p, c, m, cts, e:  Float variables to store marks of Physics (p), Chemistry (c), Maths (m), Computer Science (cts) and English (e)
•	tot, per:  Float variables to store total marks and percentage
•	gd:  Character variable to store grade of the student as per the given criteria
Percentage	Grade
≥ 90	A
≥ 60 & < 90	B
≥ 40 & < 60	C
< 40	D
Member functions:
•	void readData(): To read marks in all the subjects out of 100 (each)
•	void compute(): To find and store total marks, percentage and grade of the student
•	void showData(): To display marks in various subjects, total percentage and grade
Using the concept of inheritance, specify both the classes and invoke the functions.
*/

/*
Algorithm:
Algorithm for public static void main (String[] args) method:
Step 1: Start.
Step 2: Create an object of the Marks class.
Step 3: Call the functions inputData(), readData(), compute(), printData(), and showData().
Step 4: End.

Algorithm for void inputData () method:
Step 1: Start.
Step 2: Create a Scanner object, and accept and store the student's name, date of birth, and roll number.
Step 3: End.

Algorithm for void readData() method:
Step 1: Start.
Step 2: Create a Scanner object, and accept marks for Physics, Chemistry, Maths, Computer Science, and English.
Step 3: End

Algorithm for void compute () method:
Step 1: Start.
Step 2: Calculate the total marks and percentage by adding marks of all subjects for the total marks, then dividing that by 5 to get percentage.
Step 3: Based on the slab provided, calculate and store the grade.
Step 4: End.

Algorithm for void printData () method:
Step 1: Start.
Step 2: Print the student's name, date of birth, and roll number.
Step 3: End.

Algorithm for void showData () method:
Step 1: Start.
Step 2: Print marks for Physics, Chemistry, Maths, Computer Science, and English. Also print the total marks, percentage and grade calculated.
Step 3: End.
*/

import java.util.Scanner;

// This is the parent class
class Student
{
    // Initialization of instance variables
    String name = "", DOB = "";
    int roll = 0;

    // The function inputData() accepts values of all data members from
    // the user
    void inputData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the student: ");
        name = sc.nextLine();
        System.out.println("Enter date of birth: ");
        DOB = sc.nextLine();
        System.out.println("Enter roll number: ");
        roll = sc.nextInt();
        // Consume the newline character
        sc.nextLine();
    }

    // The function printData() prints all data members
    void printData()
    {
        System.out.println("Student name: " + name);
        System.out.println("Date of birth: " + DOB);
        System.out.println("Roll number: " + roll);
    }
}

// The child class Marks
class Marks extends Student
{
    // Initialization of instance variables
    float p = 0, c = 0, m = 0, cts = 0, e = 0;
    float tot = 0, per = 0;
    char gd;

    // The function readData() accepts marks of all subjects
    void readData()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks for: ");
        System.out.println("Physics: ");
        p = sc.nextFloat();
        System.out.println("Chemistry: ");
        c = sc.nextFloat();
        System.out.println("Maths ");
        m = sc.nextFloat();
        System.out.println("Computer Science: ");
        cts = sc.nextFloat();
        System.out.println("English : ");
        e = sc.nextFloat();

        sc.close();
    }

    // In the function compute() we calculate and store the total marks,
    // percentage and grade of the student
    void compute()
    {
        tot = p + c + m + cts + e;
        per = tot / 5f;

        // Calculation of grade
        if (per >= 90)
            gd = 'A';
        else if (per >= 60)
            gd = 'B';
        else if (per >= 40)
            gd = 'C';
        else
            gd = 'D';
    }

    // In the function showData() we display marks in various subjects,
    // total, percentage and grade
    void showData()
    {
        System.out.println("Marks in Physics: " + p);
        System.out.println("Marks in Chemistry: " + c);
        System.out.println("Marks in Maths: " + m);
        System.out.println("Marks in Computer Science: " + cts);
        System.out.println("Marks in English: " + e);
        System.out.println("Total marks: " + tot);
        System.out.println("Percentage: " + per);
        System.out.println("Grade: " + gd);
    }

    // In the main method, we create an object of the child class and call
    // all the required functions
    public static void main(String[] args)
    {
        Marks obj = new Marks();
        // We call the required functions
        obj.inputData();
        obj.readData();
        obj.compute();
        obj.printData();
        obj.showData();
    }
}
