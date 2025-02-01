/*
A class Scores defines the scores of a candidate in 6 subjects and another class BestFour defines the best of four subjects. Details of the classes are given below.
Class name: Scores
Data members:
•	int number[6][2]: Contains marks of 6 subjects and the subject code
Member functions:
•	Scores(): Constructor to accept the marks
•	int point(int index): To return the points in each subject according to the following marks

Marks	Point
≥ 90	1
80 – 89	2
70 – 79	3
60 – 69	4
50 – 59	5
≤ 40	6

Class name: BestFour
Member functions:
•	void bestSubjects(): To display the total points and the best 4 subjects using concept of inheritance
Specify the details of both the classes using the concept of inheritance.
*/

/*
Algorithm:
Algorithm for public static void main (String[] args) method:
Step 1: Start.
Step 2: Create an object of the class BestFour() and call the function bestSubjects().
Step 3: End.

Algorithm for Scores() constructor:
Step 1: Start.
Step 2: Create a Scanner object and accept and store marks and subject codes for 6 subjects.
Step 3: End.

Algorithm for int point (int index) method:
Step 1: Start.
Step 2: Find the marks of the subject at the provided index in the array number[][] and calculate and return the points for the subject marks based on the slab in the question.
Step 3: End

Algorithm for void bestSubjects () method:
Step 1: Start.
Step 2: Using bubble sort, first sort the array in descending order.
Step 3:  Create a variable sum and in a for loop that runs from 0 to the number of subjects (6) call point() passing the current iteration subject as a parameter to the function, and finally adding that value to the variable sum. Finally, print the sum of points after the for loop.
Step 4:  Print the best four subjects by using a for loop running from 0 to 4 since the array was already sorted in ascending order, so the best of 4 subjects should be the first four elements in an array.
Step 5: End.
*/

import java.util.Scanner;

// This class contains marks of 6 subjects, and calculates its points
class Scores
{
    int[][] number = new int[6][2];

    // Constructor that accepts marks
    Scores()
    {
        Scanner sc = new Scanner(System.in);
        // Input
        System.out.println("Enter marks for 6 subjects and its code: ");
        for (int currentSubject = 0; currentSubject < 6;
             currentSubject++)
        {
            System.out.println("Id: ");
            number[currentSubject][0] = sc.nextInt();
            System.out.println("Marks: ");
            number[currentSubject][1] = sc.nextInt();
        }

        sc.close();
    }

    // The function point() calculates and returns points for the subject
// marks
    int point(int index)
    {
        int subjectMarks = number[index][1];
        if (subjectMarks >= 90)
            return 1;
        else if (subjectMarks >= 80)
            return 2;
        else if (subjectMarks >= 70)
            return 3;
        else if (subjectMarks >= 60)
            return 4;
        else if (subjectMarks >= 50)
            return 5;
        else
            return 6;
    }
}

// This class calculates and prints total points and best of four subjects
class BestFour extends Scores
{
    // Constructor to call parent class constructor
    BestFour()
    {
        super();
    }

    // The function bestSubjects() displays the total points and best
    // four subjects
    void bestSubjects()
    {
        // Using bubble sort we sort number[][]
        for (int currentIteration = 0; currentIteration <
                number.length - 1; currentIteration++)
        {
            for (int currentIndex = 0; currentIndex < number.length - currentIteration - 1;currentIndex++)
            {
                if (number[currentIndex][1] <
                        number[currentIndex + 1][1])
                {
                    int[] temp;
                    temp = number[currentIndex];
                    number[currentIndex] =
                            number[currentIndex + 1];
                    number[currentIndex + 1] = temp;
                }
            }
        }

        // We calculate sum
        int sum = 0;
        for (int currentSubject = 0; currentSubject < 6;
             currentSubject++)
        {
            sum += point(currentSubject);
        }

        System.out.println("Sum of points: " + sum);

        // Now we print the best four
        for (int currentSubject = 0; currentSubject < 4;
             currentSubject++)
        {
            System.out.println("Code: " + number[currentSubject]
                    [0]);
            System.out.println("Marks: " + number[currentSubject]
                    [1]);
        }
    }

    // In the main method we create an object of BestFour and call the
    // functions
    public static void main(String[] args)
    {
        BestFour obj = new BestFour();
        obj.bestSubjects();
    }
}
