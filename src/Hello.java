import java.util.Scanner;

public class Hello {
    public  static  void main (String[] args) {
        System.out.println("Hello World");
        System.out.print("Enter a number ");
        Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                a = a + 44;
                System.out.println(a);

    }
}
