// Define a class Library with the following description
// Instance variables
// int acc_num, int days_late, int fine
// String author, String title
// Member methods
// void input() [Input and store the accession number, title, author, etc]
// void compute() [Calculate the fine charged at @5/day]
// void display() [Display the details in the following format]
// Accession Number      Title       Author      Fine
//      xxx               xxx          xx         xx
// Write a main method to create an object of the class and call other member methods.
import java.util.Scanner;

class Library {
    int acc_num, days_late = 0, fine = 0;
    String author, title;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter accession number: ");
        acc_num = sc.nextInt();
        System.out.println("Enter title: ");
        title = sc.nextLine();
        System.out.println("Enter author: ");
        author = sc.nextLine();
        System.out.println("Enter days late: ");
        days_late = sc.nextInt();
    }

    void compute() {
        fine = days_late * 5;
    }

    void display() {
        System.out.println("Accession Number\tTitle\tAuthor\tFine");
        System.out.println(acc_num + "\t" + title + "\t" + author + "\t" + fine);
    }

    public static void main(String args[]) {
        Library obj = new Library();
        obj.input();
        obj.compute();
        obj.display();
    }
}