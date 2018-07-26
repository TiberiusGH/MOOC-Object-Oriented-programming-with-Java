import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random randomNumber = new Random();
    private Integer drawnNumber;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        for (int i = 1; i <= 7; i++) {
            this.drawnNumber=this.randomNumber.nextInt(39) + 1;
            if (!this.containsNumber(this.drawnNumber)) {
                this.numbers.add(this.drawnNumber);
            }else {
                i--;
            }
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if (!this.numbers.contains(number)){
            return false;
        }
        return true;
    }
}
