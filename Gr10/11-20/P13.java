// A clothing store has announced the following festival discounts based on the total cost of the items purchased
// Data members
// totcost <double> [Store total cost]
// bill <double> [Store bill]

// | Total Cost | Discount |
// |------------|----------|
// | < 2000     | 5%       |
// | <= 5000    | 25%      |
// | <= 10000   | 35%      |
// | > 10000    | 50%      |

// Using a parameterized consturctor, write a program to input the total cost. In the member function compute(), calculate the amount to be paid
// by the customer after availing the discount. Finally display the details in the member function display()
import java.util.Scanner;

class Store {
    double bill, totcost;
    Store(double tc) {
        bill = 0;
        totcost = tc;
    }

    void compute() {
        if (totcost < 2000) {
            bill = totcost - (totcost * 0.05f);
        } else if (totcost <= 5000) {
            bill = totcost - (totcost * 0.25f);
        } else if (totcost <= 10000) {
            bill = totcost - (totcost * 0.35f);
        } else {
            bill = totcost - (totcost * 0.5f);
        }
    }

    void display() {
        System.out.println("Total cost: " + totcost);
        System.out.println("Bill: " + bill);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total cost: ");
        Store s = new Store(sc.nextDouble());
        s.compute();
        s.display();
    }
}
