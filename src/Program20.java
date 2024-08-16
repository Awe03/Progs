// This program performs bubble sort and binary search on an inputted // array
import java.util.Scanner;

class Sort
{
	// Initialization of data members
	int[] arr = new int[10] ;
	int item = 0 ;

	// In the method inpdata() we input integers to fill the array
	void inpdata()
	{
		// We create a scanner object to obtain input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 50 (non duplicate) numbers: ");
		for (int currentIteration = 0; currentIteration < arr.length; 
		     currentIteration++)
		{
			int input = sc.nextInt();
			// We have another for loop to check whether it is 
			// duplicate or not
			for (int currentIndex = 0; currentIndex < arr.length;
			     currentIndex++)
			{
				if (arr[currentIndex] == input)
				{
					System.out.println("Duplicate elements not allowed");
					// We recall the function
					inpdata();
				}
			}
			arr[currentIteration] = input;
		}
	}
	// In the method bubsort(), we sort array in ascending order 
// using bubble sort and then display it
void bubsort()
{
	// Bubble sort
	for (int currentIteration = 0; currentIteration < arr.length;
	     currentIteration++)
	{
		for (int currentIndex = 0; currentIndex < arr.length - currentIteration - 1; currentIndex++)
		{
			if (arr[currentIndex] > arr[currentIndex + 1])
			{
				int tempStorage = arr[currentIndex];
				arr[currentIndex] = arr[currentIndex + 1];
				arr[currentIndex + 1] = tempStorage;
			}
		}
	}

	// We print the sorted array
	System.out.print("Sorted array: [");
	for (int currentIndex = 0; currentIndex < arr.length;
	     currentIndex++)
	{
		System.out.print(" " + arr[currentIndex] + " ");
	}
	System.out.println("]");
}

// In the function binsearch(), we input the number to search for,
// search for it and then print it’s index
void binsearch()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number to search for: ");
	item = sc.nextInt();

	// Now we perform binary search
	int low = 0, high = arr.length - 1;
	while (high >= low)
	{
		int middle = (low + high) / 2;
	
		if (arr[middle] > item) high = middle - 1;
		if (arr[middle] < item) low = middle + 1;
		else if (arr[middle] == item) 
		{
			System.out.println("Item " + item + " is element " + (middle + 1));
			return;
		}
	}
	System.out.println("Item not found in the list");
}

// In the main method, we simply create an object of the class
// and call the functions
public static void main(String[] args)
{
	Sort obj = new Sort();
	obj.inpdata();
	obj.bubsort();
	obj.binsearch();
}
}
