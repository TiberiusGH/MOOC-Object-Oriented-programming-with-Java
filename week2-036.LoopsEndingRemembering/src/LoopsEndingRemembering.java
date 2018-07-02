import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);

        int sum = 0;
        int numberCount = 0;
        double avg;
        int evenNumbers=0;
        int oddNumbers=0;

        System.out.println("Type numbers: ");
        int number = Integer.parseInt(reader.nextLine());
        while(true){
            if(number==-1){
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is " + sum);
                System.out.println("How many numbers: " + numberCount);
                avg = (double) sum/(double) numberCount;
                System.out.println("Average: " + avg);
                System.out.println("Even numbers:" + evenNumbers);
                System.out.println("Odd numbers: " + oddNumbers);
                break;
            }else {
                sum += number;
                if (number%2==0){
                    evenNumbers++;
                }else {
                    oddNumbers++;
                }
                number = Integer.parseInt(reader.nextLine());
                numberCount++;

            }
        }

    }
}
