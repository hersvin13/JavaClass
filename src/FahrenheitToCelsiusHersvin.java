import java.util.Scanner;

public class FahrenheitToCelsiusHersvin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;

        do {
            System.out.print("fahrenheit = ");
            fahrenheit = scanner.nextDouble();
            if (fahrenheit != -999) {
                celsius = (fahrenheit - 32) * 5 / 9;
                System.out.println("\nexpected output: " + celsius);
                System.out.println("\n");
            }
        } while (fahrenheit != -999);

        scanner.close();
    }
}
