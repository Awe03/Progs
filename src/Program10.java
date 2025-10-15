/*
A dequeue enables the user to add and remove integers from both the ends i.e. front and rear. Define a class DeQueue with the following details.
Class name: DeQueue
Data Members:
·	ele[] : array to hold the integer elements.
·	cap : stores the maximum capacity of the array.
·	front : to point the index of the front.
·	rear : to point the index of the rear.
Member functions:
·	DeQueue(int max) : Constructor to initialize the data member cap = max, front = rear = 0 and create the integer array.
·	void pushfront(int v) : To add integers from the front index if possible else display the message(“full from front”).
·	int popfront() : To remove the return elements from front. If array is empty then return -999.
·	void pushrear(int v) : To add integers from the front index if possible else display the message(“full from rear”)
·	int poprear() : o remove and return elements from rear. If the array is empty then return –999
 */

/*
Algorithm:
Algorithm for public static void main (String[] args) method:
Step 1: Start.
Step 2: Create a Scanner object and accept the capacity of the dequeue.
Step 3: Create an object of the DeQueue class, passing the capacity as a parameter.
Step 4: Accept user input for operations and call the appropriate methods.
Step 5: End.

Algorithm for DeQueue(int max) constructor:
Step 1: Start.
Step 2: Initialize cap to max, front and rear to 0.
Step 3: Create the integer array ele of size cap.
Step 4: End.

Algorithm for void pushfront(int v) method:
Step 1: Start.
Step 2: Check if front is 0, indicating the dequeue is full from the front. If so, display "full from front" and return.
Step 3: Decrement front and add the element v at the front index.
Step 4: End.

Algorithm for int popfront() method:
Step 1: Start.
Step 2: Check if front equals rear, indicating the dequeue is empty. If so, return -999.
Step 3: Store the element at front index, increment front, and return the stored element.
Step 4: End.

Algorithm for void pushrear(int v) method:
Step 1: Start.
Step 2: Check if rear equals cap, indicating the dequeue is full from the rear. If so, display "full from rear" and return.
Step 3: Add the element v at the rear index and increment rear.
Step 4: End.

Algorithm for int poprear() method:
Step 1: Start.
Step 2: Check if front equals rear, indicating the dequeue is empty. If so, return -999.
Step 3: Decrement rear, store the element at rear index, and return the stored element.
Step 4: End.
*/

import java.util.Scanner;

// This class implements a dequeue data structure
class DeQueue
{
    // Declaration of instance variables
    int[] ele;
    int cap, front, rear;

    // Constructor that initializes the dequeue
    DeQueue(int max)
    {
        cap = max;
        front = 0;
        rear = 0;
        ele = new int[cap];
    }

    // In the function pushfront() we add an integer from the front
    void pushfront(int v)
    {
        // Check if dequeue is full from front
        if (front == 0)
        {
            System.out.println("full from front");
            return;
        }

        // Add element at front
        front--;
        ele[front] = v;
    }

    // In the function popfront() we remove and return element from front
    int popfront()
    {
        // Check if dequeue is empty
        if (front == rear)
        {
            return -999;
        }

        // Remove element from front
        int element = ele[front];
        front++;
        return element;
    }

    // In the function pushrear() we add an integer from the rear
    void pushrear(int v)
    {
        // Check if dequeue is full from rear
        if (rear == cap)
        {
            System.out.println("full from rear");
            return;
        }

        // Add element at rear
        ele[rear] = v;
        rear++;
    }

    // In the function poprear() we remove and return element from rear
    int poprear()
    {
        // Check if dequeue is empty
        if (front == rear)
        {
            return -999;
        }

        // Remove element from rear
        rear--;
        int element = ele[rear];
        return element;
    }

    // In the main method we create an object and test the dequeue operations
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the capacity of the dequeue: ");
        int capacity = sc.nextInt();

        DeQueue obj = new DeQueue(capacity);

        int choice;
        do
        {
            System.out.println("\n1. Push Front");
            System.out.println("2. Pop Front");
            System.out.println("3. Push Rear");
            System.out.println("4. Pop Rear");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter value to push at front: ");
                    int val = sc.nextInt();
                    obj.pushfront(val);
                    break;

                case 2:
                    int result = obj.popfront();
                    if (result == -999)
                        System.out.println("Dequeue is empty");
                    else
                        System.out.println("Popped from front: " + result);
                    break;

                case 3:
                    System.out.print("Enter value to push at rear: ");
                    int val2 = sc.nextInt();
                    obj.pushrear(val2);
                    break;

                case 4:
                    int result2 = obj.poprear();
                    if (result2 == -999)
                        System.out.println("Dequeue is empty");
                    else
                        System.out.println("Popped from rear: " + result2);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);

        sc.close();
    }
}
