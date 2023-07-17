// Define a class movieMagic with the following description
// Instance variables
// int year [year of release]
// String title [movie title]
// float rating [movie rating] [min rating = 0.0, max rating = 5.0]
// Member methods
// void accept() [to input and store variables]
// void display() [to display title, year and a message based on rating as per the table below]

//  |  Rating  |  Message  |
//  |----------|-----------|
//  |  <= 2    |  Flop     |
//  |  <= 3.4  |  Semi hit |
//  |  <= 4.5  |  Hit      |
//  |  <= 5    |  Super hit|

// write a main method to create an object of the class
import java.util.Scanner;

class MovieMagic {
    int year;
    String title;
    float rating;

    MovieMagic() {
        year = 0;
        title = "";
        rating = 0.0f;
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year of release: ");
        year = sc.nextInt();
        System.out.print("Enter the title of the movie: ");
        title = sc.next();
        System.out.print("Enter the rating of the movie: ");
        rating = sc.nextFloat();
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Year of release: " + year);
        if (rating <= 2) System.out.println("Flop");
        else if (rating <= 3.4) System.out.println("Semi hit");
        else if (rating <= 4.5) System.out.println("Hit");
        else if (rating <= 5) System.out.println("Super Hit");
    }

    public static void main(String[] args) {
        MovieMagic obj = new MovieMagic();
        obj.accept();
        obj.display();
    }
}
