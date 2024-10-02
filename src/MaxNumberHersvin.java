import java.util.Scanner;

public class MaxNumberHersvin {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("First Input: ");
            int firstInput = scanner.nextInt();
            
            System.out.print("Second Input: ");
            int secondInput = scanner.nextInt();

            if (firstInput > secondInput) {
                System.out.println("Expected Output: The max value is " + firstInput + ".\n");
            } else if (secondInput > firstInput) {
                System.out.println("Expected Output: The max value is " + secondInput + ".\n");
            } else {
                System.out.println("Expected Output: Inputs are equal.\n");
            }

        } while (true);  
    }
}
