import java.util.Scanner;

public class Palindromi {

    public static String reverse(String text) {
        String helper = "";
        int i = 1;

        while (i <= text.length()){
            helper = helper + text.charAt(text.length()-i);
            i++;
        }
        return helper;
    }

    public static boolean palindrome(String text) {
        // write code here
        if (text.equals(reverse(text))){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
