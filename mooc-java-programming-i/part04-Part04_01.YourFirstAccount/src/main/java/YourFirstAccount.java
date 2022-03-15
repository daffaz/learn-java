
public class YourFirstAccount {

    public static void main(String[] args) {
        Account account = new Account("Wawan", 100);
        
        account.deposit(20);
        System.out.println(account);
    }
}
