// Write a program to input your surname in uppercase letters. Store the characters of your surname in a character array
// Print the letters in ascending order using selection sort
import java.util.Scanner;

class P48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter surname: ");
        String str = sc.nextLine();
        char[] Arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            Arr[i] = str.charAt(i);
        }
        for (int i = 0; i < Arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < Arr.length; j++) {
                if (Arr[j] < Arr[index]) {
                    index = j;
                }
            }
            char temp = Arr[i];
            Arr[i] = Arr[index];
            Arr[index] = temp;
        }
        System.out.print("New surname: ");
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i]);
        }
    }
}