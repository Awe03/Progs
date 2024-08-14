// Write a program to input 6 names of states of India in an array using Scanner class. Print the array elements in descending order using bubble sort.
import java.util.Scanner;

class P44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] states = new String[6];
        System.out.println("Enter 6 states: ");
        for (int i = 0; i < states.length; i++) {
            states[i] = sc.nextLine();
        }
        System.out.println("States: ");
        for (int i = 0; i < states.length; i++) {
            for (int j = 0; j < states.length - i - 1; j++) {
                if (states[j].compareTo(states[j + 1]) < 0) {
                    String temp = states[j];
                    states[j] = states[j + 1];
                    states[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < states.length; i++) {
            System.out.println(states[i]);
        }
    }
}