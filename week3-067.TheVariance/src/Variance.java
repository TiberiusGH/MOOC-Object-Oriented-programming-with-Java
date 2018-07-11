import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        // Write your code here
        int sum = 0;
        for (int listItems : list) {
            sum += listItems;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        return sum(list)*1.0/list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double var=0.0;
        double avg = average(list);
        for (double population:list) {
            var =var + Math.pow(population-avg,2);
        }
        return var/(list.size()-1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
