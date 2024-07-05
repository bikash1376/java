import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {

        String name;
        int age;

        System.out.println("Enter your name");
        Scanner in = new Scanner(System.in);
        name = in.nextLine();

        System.out.println("Enter your age");
        age = in.nextInt();

        // Consume the leftover newline
        in.nextLine();

        System.out.println("Hi " + name + " Welcome to our restaurant. You don't look " + age + " at all. Here's the menu. Choose what you wanna have.. 1. Burger 2. Pizza 3. Chowmein");
        System.out.println("Enter your choice");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                System.out.println("So you want to have Burger");
                break;
            case 2:
                System.out.println("So you want to have Pizza");
                break;
            case 3:
                System.out.println("So you want to have Chowmein");
                break;
            default:
                System.out.println("Choose from the above list");
        }
    }
}
