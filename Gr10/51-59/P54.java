// Write a program to input 10 characters in ascending order. Search for a character given by the user as an input using Binary search
// If the character is present, print its position otherwise print "Character not present"
import java.util.Scanner;

class P54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[10];
        System.out.println("Enter 10 characters in ascending order: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.next().charAt(0);
        }
        System.out.println("Enter a character to be searched: ");
        char ch = sc.next().charAt(0);
        int low = 0, high = 9, mid = 0;
        boolean found = false;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == ch) {
                found = true;
                break;
            } else if (arr[mid] < ch) {
                low = mid + 1;
            } else if (arr[mid] > ch) {
                high = mid - 1;
            }
        }
        if (found) {
            System.out.println("Position: " + (mid + 1));
        } else {
            System.out.println("Character not present");
        }
    }
}