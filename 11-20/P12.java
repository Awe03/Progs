// Create a class Vib with the following details
// Data members: int x, String y
// Member functions
// Vib() [constructor to initialize class variables]
// Vib(int x, String y) [to initialize class variables to values of parameters]
// display() [to display the values of class variables]
// main() [to invoke all the methods]
class Vib {
    int x;
    String y;

    Vib() {
        x = 0;
        y = "";
    }

    Vib(int x, String y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println("x: " + x + ", y: " + y);
    }

    public static void main(String[] args) {
        Vib v1 = new Vib();
        Vib v2 = new Vib(10, "Hello");
        v1.display();
        v2.display();
    }
}
