import java.util.Scanner;

public class Multab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number for the multiplication table: ");
        int number = scanner.nextInt();

        System.out.print("Enter the range (up to which number you want the table): ");
        int range = scanner.nextInt();
        System.out.println("Multiplication table of " + number + " up to " + range + ":");
        for (int i = 1; i <= range; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        scanner.close();
    }
}