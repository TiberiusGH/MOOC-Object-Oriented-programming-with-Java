
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        int firstNumber = 0;
        int secondNumber = 0;

        System.out.println("Enter the first number: ");
        firstNumber = Integer.parseInt(reader.nextLine());
        System.out.println("Enter the second number: ");
        secondNumber = Integer.parseInt(reader.nextLine());

        while (firstNumber<=secondNumber){
            System.out.println(firstNumber);
            firstNumber+=1;
        }
    }
}
