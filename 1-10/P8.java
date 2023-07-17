// Define a class named FruitJuice with the following description
// Instance variables
// int productcode [product code]
// String flavor [stores flavor]
// String packtype [stores packaging type]
// int packsize [stores packaging size]
// int productprice [stores product price]
// Member methods
// void input() [to input and store all details]
// void discount() [to reduce product price by 10%]
// void display() [to display all details]
// Write a main method to create an object of the class and call all methods
import java.util.Scanner;

class FruitJuice {
    int productcode, packsize, productprice;
    String flavor, packtype;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product code: ");
        productcode = sc.nextInt();
        System.out.println("Enter flavor: ");
        flavor = sc.nextLine();
        System.out.println("Enter packaging type: ");
        packtype = sc.nextLine();
        System.out.println("Enter packaging size: ");
        packsize = sc.nextInt();
        System.out.println("Enter product price: ");
        productprice = sc.nextInt();
    }

    void discount() {
        productprice = (int) (productprice - ((double) 10/100 * productprice));
    }

    void display() {
        System.out.println("Product Code\tFlavor\tPacktype\tPacksize\tProduct Price\n" + productcode + "\t" + flavor + "\t" + packtype + "\t" + packsize + "\t" + productprice);
    }

    public static void main(String[] args) {
        FruitJuice ob = new FruitJuice();
        ob.input();
        ob.discount();
        ob.display();
    }
}