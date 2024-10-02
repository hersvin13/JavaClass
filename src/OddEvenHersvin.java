import java.util.Scanner;

public class OddEvenHersvin {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Input Number: ");
            int number = scanner.nextInt();

            if (isEven(number)) {
                System.out.println("Expected Output: Even\n");
            } else {
                System.out.println("Expected Output: Odd\n");
            }
        }
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
