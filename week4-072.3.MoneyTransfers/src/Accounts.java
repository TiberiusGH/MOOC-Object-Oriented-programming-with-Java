
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here

        Account aAccount = new Account("A",100);
        Account bAccount = new Account("B",0);
        Account cAccount = new Account("C",0);

        transfer(aAccount,bAccount,50);
        transfer(bAccount,cAccount,25);

    }

    public static void transfer(Account from, Account to, double howMuch){
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }


}
