// Write a program to input marks in 6 different subjects in an array. Find the marks in descending order using selection sort.
import java.util.Scanner;

class P45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[6];
        System.out.println("Enter marks in 6 subjects: ");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println("Marks: ");
        for (int i = 0; i < marks.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < marks.length; j++) {
                if (marks[j] > marks[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = marks[i];
            marks[i] = marks[minIndex];
            marks[minIndex] = temp;
        }
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}