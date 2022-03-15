
public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public void eatAffordably() {
        double price = 2.60;
        if (this.balance >= price) {
            this.balance -= price;
        }
    }

    public void eatHeartily() {
        double price = 4.60;

        if (this.balance >= price) {
            this.balance -= 4.60;
        }
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            if (this.balance + amount > 150) {
                this.balance = 150;
            } else {
                this.balance += amount;
            }
        } 
    }

    @Override
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}
