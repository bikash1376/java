import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int maxNumber = scanner.nextInt();
        scanner.close();

        int a = 0, b = 1;
        System.out.print("Fibonacci Series up to " + maxNumber + ": ");

        while (a <= maxNumber) {
            System.out.print(a + " ");
            int nextNumber = a + b;
            a = b;
            b = nextNumber;
        }
    }
}
