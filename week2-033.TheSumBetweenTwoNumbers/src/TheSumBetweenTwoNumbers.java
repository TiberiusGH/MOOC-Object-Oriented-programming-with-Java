
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int firstNumber = 0;
        int secondNumber = 0;
        int sum = 0;

        System.out.print("Enter the first number: ");
        firstNumber = Integer.parseInt(reader.nextLine());
        System.out.print("Enter the second number: ");
        secondNumber = Integer.parseInt(reader.nextLine());

        while (firstNumber<=secondNumber){
            sum +=firstNumber;
            firstNumber++;
        }
        System.out.println("The sum is "+sum);
    }
}
