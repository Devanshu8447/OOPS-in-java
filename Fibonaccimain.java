import java.util.Scanner;

public class Fibonaccimain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number til you want to print fibonacci:");
        int n = sc.nextInt();
        DisplaySeries display = new DisplaySeries(n);
        display.printSeries();

    }
}
class Fibonacci{
    private int n;

    // Constructor to initialize the value of n
    public Fibonacci(int n) {
        this.n = n;
    }

    // Method to generate Fibonacci series
    public int[] generateSeries() {
        int[] series = new int[n];
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            series[i] = a;
            int next = a + b;
            a = b;
            b = next;
        }
        return series;
    }
}
class DisplaySeries{
    private Fibonacci fibonacci;

    // Constructor to initialize the Fibonacci object
    public DisplaySeries(int n) {
        fibonacci = new Fibonacci(n);  // Create an object of Fibonacci class
    }

    // Method to print the Fibonacci series
    public void printSeries() {
        int[] series = fibonacci.generateSeries();
        System.out.print("Fibonacci series: ");
        for (int num : series) {
            System.out.print(num + " ");
        }
    }
}

