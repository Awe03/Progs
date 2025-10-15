/*
A Circular queue is a linear data structure which works on the principle of FIFO, enables the user to enter data from the rear end and remove data from the front end with the rear end connected to the front end to form a circular pattern.
Define a class CirQueue with the following details:
Class name: CirQueue
Data members / instance variables:
·	cq[] : Array to store the integers
·	cap : Stores the maximum capacity of the array
·	front : To point the index of the front end
·	rear : To point the index of the rear end
Member functions:
·	CirQueue(int max) : Constructor to initialize the data member cap = max, front = 0 and rear= 0.
·	void push(int n) : To add integer in the queue from the rear end if possible, otherwise display the message “QUEUE IS FULL”.
·	int pop() : Removes and returns the integer from the front end of the queue if any, else returns -9999.
·	void show() : Displays the queue elements
 */

import java.util.Scanner;

class CirQueue
{
    // Declaration of instance variables
    int[] cq;
    int cap, front, rear;

    // Constructor that initializes the circular queue
    CirQueue(int max)
    {
        cap = max;
        front = 0;
        rear = 0;
        cq = new int[cap];
    }

    // In the function push() we add an integer to the queue from rear end
    void push(int n)
    {
        // Check if queue is full
        if ((rear + 1) % cap == front)
        {
            System.out.println("QUEUE IS FULL");
            return;
        }

        // Add element at rear
        cq[rear] = n;
        rear = (rear + 1) % cap;
    }

    // In the function pop() we remove and return element from front end
    int pop()
    {
        // Check if queue is empty
        if (front == rear)
        {
            return -9999;
        }

        // Remove element from front
        int element = cq[front];
        front = (front + 1) % cap;
        return element;
    }

    // In the function show() we display the queue elements
    void show()
    {
        // Check if queue is empty
        if (front == rear)
        {
            System.out.println("Queue is empty");
            return;
        }

        // Display elements from front to rear
        System.out.print("Queue elements: ");
        int i = front;
        while (i != rear)
        {
            System.out.print(cq[i] + " ");
            i = (i + 1) % cap;
        }
        System.out.println();
    }

    // In the main method we create an object and test the circular queue operations
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the capacity of the circular queue: ");
        int capacity = sc.nextInt();

        CirQueue obj = new CirQueue(capacity);

        int choice;
        do
        {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Show");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = sc.nextInt();
                    obj.push(value);
                    break;

                case 2:
                    int result = obj.pop();
                    if (result == -9999)
                        System.out.println("Queue is empty");
                    else
                        System.out.println("Popped element: " + result);
                    break;

                case 3:
                    obj.show();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);

        sc.close();
    }
}