import java.util.Scanner;

public class MinNumberHersvin {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("First Input: ");
            int firstInput = scanner.nextInt();
            System.out.print("Second Input: ");
            int secondInput = scanner.nextInt();

            System.out.print("Expected Output: ");
            if (firstInput < secondInput) {
                System.out.println("The min value is " + firstInput + ".");
            } else if (secondInput < firstInput) {
                System.out.println("The min value is " + secondInput + ".");
            } else {
                System.out.println("Inputs are equal.");
            }

          
        } while (true);

    }
}
