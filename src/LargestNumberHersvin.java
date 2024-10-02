import java.util.Scanner;

public class LargestNumberHersvin {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int firstNumber, secondNumber, thirdNumber;

        do{

            System.out.print("Input the first number: ");
            firstNumber = scanner.nextInt();
            System.out.print("Input the second number: ");
            secondNumber = scanner.nextInt();
            System.out.print("Input the third number: ");
            thirdNumber = scanner.nextInt();
            System.out.println(".\n");

            System.out.println("Exepected Output: ");
            int greatestNumber = Math.max(firstNumber, Math.max(secondNumber, thirdNumber));
            System.out.println("Greatest number: " + greatestNumber + ".\n");

        } while (true);
    }
}
