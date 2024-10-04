import java.util.Scanner;

public class NegativePositiveHersvin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Input: ");
            number = scanner.nextInt();

            if (number > 0) {
                System.out.println("Expected output: Positive\n");
            } else if (number < 0) {
                System.out.println("Expected output: Negative\n");
            } else {
                System.out.println("Expected output: Neutral\n");
            }

        } while (number != -999); 
        scanner.close();
    }
}
