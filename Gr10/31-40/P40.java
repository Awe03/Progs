// Write a program to calculate the squares of the first ten natural numbers and assign them to an array
// Also display the squares in a single line
class P40 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.print("Squares: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = (i + 1) * (i + 1);
            System.out.print(arr[i] + " ");
        }
    }
}