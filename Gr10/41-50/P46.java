// Write a program to input 5 different lowercase letters in an array. Print the letters in descending order using selection sort.
import java.util.Scanner;

class P46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] letters = new char[5];
        System.out.println("Enter 5 lowercase letters: ");
        for (int i = 0; i < letters.length; i++) {
            letters[i] = sc.next().charAt(0);
        }
        System.out.println("Letters: ");
        for (int i = 0; i < letters.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < letters.length; j++) {
                if (letters[j] > letters[minIndex]) {
                    minIndex = j;
                }
            }
            char temp = letters[i];
            letters[i] = letters[minIndex];
            letters[minIndex] = temp;
        }
        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }
    }
}