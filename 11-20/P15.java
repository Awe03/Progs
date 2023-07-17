// Define a class named Student described as followed
// Data members
// name, age, m1, m2, m3 [marks in 3 subjects]
// minimum
// average
// Methods
// A parameterized consurctor to initialize the data members
// To accept the details of the student
// To compute the average and maximum out of 3 subjects
// To display the name, age, makrks in 3 subjects, maximum and average
// Write a main() method to create an object of the class and call the above member methods
import java.util.Scanner;

class Student {
    int m1, m2, m3, max, age;
    float avg;
    String name;

    Student(int m1, int m2, int m3, int age, String name) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.age = age;
        this.name = name;
    }

    void compute() {
        this.max = Math.max(m1, Math.max(m2, m3));
        this.avg = ((float) m1 + m2 + m3) / 3f;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + m1 + ", " + m2 + ", " + m3);
        System.out.println("Max: " + max);
        System.out.println("Avg: " + avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        System.out.println("Enter marks in 3 subjects: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        Student s = new Student(m1, m2, m3, age, name);
        s.compute();
        s.display();
    }
}