// Write a program to input 5 numbers in an array in ascending order. Take another input for the value to be searched.
// Using binary search, find and print the position of the number to be searched if it is present in the array.
// Also print an appropriate message "Element not found" if it is not present in the array
import java.util.Scanner;

class P53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers in ascending order: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter a number to be searched: ");
        int num = sc.nextInt();
        int low = 0, high = 4, mid = 0;
        boolean found = false;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == num) {
                found = true;
                break;
            } else if (arr[mid] < num) {
                low = mid + 1;
            } else if (arr[mid] > num) {
                high = mid - 1;
            }
        }
        if (found) {
            System.out.println("Position: " + (mid + 1));
        } else {
            System.out.println("Element not found");
        }
    }
}