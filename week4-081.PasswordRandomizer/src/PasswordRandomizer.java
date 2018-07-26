import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length;
    private String randomPassword;
    private String character = "abcdefghijklmnopqrstuvwxyz";
    Random random = new Random();

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length=length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        this.randomPassword = "";
        for (int i = 0; i<this.length;i++){
            this.randomPassword+=this.character.charAt(this.random.nextInt(25));
        }
        return this.randomPassword;
    }
}
