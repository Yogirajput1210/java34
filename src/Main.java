import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");

        int a = sc.nextInt();
        System.out.print("Enter your second number: ");
        int b = sc.nextInt();

            int c = a / b;

            System.out.println("Result of division: " + c);

    }
}
