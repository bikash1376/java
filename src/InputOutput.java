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


        System.out.println("Name:" +name+"\nAge:" +age);
    }
}
