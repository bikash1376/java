import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Enter three numbers:");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        in.close();

        if (a > b && a > c)
            System.out.println("The largest number is: " + a);
        else if (b > a && b > c)
            System.out.println("The largest number is: " + b);
        else if (c > a && c > b)
            System.out.println("The largest number is: " + c);
        else if (a == b && b == c)
            System.out.println("All numbers are equal");
        else
            System.out.println("There is no single largest number");
    }
}
