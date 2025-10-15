/*
A wondrous square is an n by n grid which fulfills the following conditions:
i) It contains integers from 1 to n^2, where each integer only appears once.
ii) The sum of integers in any row or column must add up to 0.5 * n * (n^2 + 1).
For example the following grid is a wondrous square where the sum of each row or column is 65 when n = 5
17  24  1   8   15
23  5   7   14  16
4   6   13  20  22
10  12  19  21  3
11  18  25  2  9
Write a program to read n (2 <= n <= 10) and the values stored in these n by n cells and output if the grid represents a wondrous square or not.
Also, output all the prime numbers in the grid along with their row index and column index as shown in the output. A natural number is said to be prime if it has exactly two divisors. E.g. 2, 3, 5, 7, 11....
The first element of the given grid i.e. 17 is stored at row index 0 and column index 0
Sample data:
Input:
N = 4
16  5   1    2
6   4   10   14
9   8   10   14
3   7   11   13
Output:
Yes it represents a wondrous square.
Prime   Row Index    Column Index
2           0             3
3           3             0
5           2             3
7           3             1
11          3             2
13          3             3
 */

import java.util.Scanner;

class Program19 {
    int[][] array;
    int n = 0;

    boolean isPrime(int number) {
        boolean isPrime = true;
        if (number == 1) return false;
        if (number == 2) return true;
        for (int i = 2; i < number; i++) if (number % i == 0) isPrime = false;

        return isPrime;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        n = sc.nextInt();
        array = new int[n][n];

        System.out.println("Enter the " + n + "x" + n + " grid:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
            }
        }
    }

    boolean isWondrous() {
        // properInput contains whether the input is from 1 to n^2
        boolean properInput = false;
        float sum = 0.5f * n * (float) (Math.pow(n,2) + 1);

        boolean[] usedNumbers = new boolean[n * n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int number = array[i][j];
                if (number < 1 || number > n * n || usedNumbers[number - 1]) return false;
                usedNumbers[number - 1] = true;
            }
        }

        // Check row sum
        for (int i = 0; i < n; i++) {
            int sumOfRow = 0;
            for (int j = 0; j < n; j++) {
                sumOfRow += array[i][j];
            }
            if (sumOfRow != sum) return false;
        }

        // Check column sum 
        for (int j = 0; j < n; j++) {
            int columnSum = 0;
            for (int i = 0; i < n; i++) {
                columnSum += array[i][j];
            }
            if (columnSum != sum) return false;
        }

        return true;
    }

    void displayPrimes() {
        // We need the number of primes so we can create arrays of needed sizes
        int primeCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isPrime(array[i][j])) {
                    primeCount++;
                }
            }
        }

        if (primeCount == 0) {
            System.out.println("No prime numbers found.");
            return;
        }

        // These three arrays hold the values of the prime number, the row number and the column number
        int[] primeValues = new int[primeCount];
        int[] primeRows = new int[primeCount];
        int[] primeCols = new int[primeCount];

        // Now we fill these three arrays up
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isPrime(array[i][j])) {
                    primeValues[index] = array[i][j];
                    primeRows[index] = i;
                    primeCols[index] = j;
                    index++;
                }
            }
        }

        // We need to sort the array in ascending order, while still keeping the other two (rows and columns) in sync with the rearrangement
        for (int i = 0; i < primeCount - 1; i++) {
            for (int j = 0; j < primeCount - 1 - i; j++) {
                if (primeValues[j] > primeValues[j + 1]) {
                    int tempVal = primeValues[j];
                    primeValues[j] = primeValues[j + 1];
                    primeValues[j + 1] = tempVal;

                    int tempRow = primeRows[j];
                    primeRows[j] = primeRows[j + 1];
                    primeRows[j + 1] = tempRow;

                    int tempCol = primeCols[j];
                    primeCols[j] = primeCols[j + 1];
                    primeCols[j + 1] = tempCol;
                }
            }
        }

        // Now we can finally print the sorted array
        System.out.println("Prime   Row Index    Column Index");

        for (int i = 0; i < primeCount; i++) {
            System.out.println(primeValues[i] + "\t" + primeRows[i] + "\t\t" + primeCols[i]);
        }
    }

    public static void main(String[] args) {
        Program19 program = new Program19();
        program.input();

        if (program.isWondrous()) {
            System.out.println("Yes it represents a wondrous square.");
        } else {
            System.out.println("No it does not represent a wondrous square.");
        }

        program.displayPrimes();
    }
}