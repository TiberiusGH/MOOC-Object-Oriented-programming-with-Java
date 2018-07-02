import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int sum = 1;
        int factor = 0;
        int i = 1;

        System.out.println("Enter a number: ");
        factor = Integer.parseInt(reader.nextLine());

        if (factor == 0) {
            System.out.println("Factorial is 1");
        } else {
            while (i <= factor) {
             sum *= i;
             i++;
            }
            System.out.println("Factorial is " + sum);
        }
    }
}
