// Define a class Temperature described as below
// Data members
// max, min [to sore maximum and minimum temperature in Celsius]
// f1, f2 [to store maximum and minimum temperature in Fahrenheit]
// Member methods
// A parameerized constructor to initialize data members
// To compute the maximum and minumum temperature to Fahrenheit [ (9/5) * C + 32 ]
// The program displays the maximum and minimum temperature of Fahrenheit
import java.util.Scanner;

class Temperature {
    float max, min, f1, f2;

    Temperature(float max, float min) {
        this.max = max;
        this.min = min;
    }

    void compute() {
        f1 = (max * 9/5) + 32;
        f2 = (min * 9/5) + 32;
    }

    void display() {
        System.out.println("Max in Fahrenheit: " + f1);
        System.out.println("Min in Fahrenheit: " + f2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter max temperature: ");
        float max = sc.nextFloat();
        System.out.print("Enter min temperature: ");
        Temperature t = new Temperature(max, sc.nextFloat());
        t.compute();
        t.display();
    }
}
