// Write a program to input name of 5 countries and their capitals in 2 different arrays
// Also input a country name to be searched in the given array using a linear search
// If the country is present then print it's capital name, else print the message "Country not found"

import java.util.Scanner;

class P51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] countries = new String[5];
        String[] capitals = new String[5];
        System.out.println("Enter 5 countries and their capitals: ");
        for (int i = 0; i < 5; i++) {
            countries[i] = sc.nextLine();
            capitals[i] = sc.nextLine();
        }
        System.out.println("Enter a country name to be searched: ");
        String country = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < 5; i++) {
            if (countries[i].equals(country)) {
                System.out.println("Capital: " + capitals[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Country not found");
        }
        sc.close();
    }
}