public class Account {

    private double balance;
    private String ownerName;

    public Account( String ownerName, double balance){

        this.ownerName = ownerName;

        if(balance > 0.0){
            this.balance = balance;
        }
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void add(double amount){
        if(amount > 0.0){
            this.balance += amount;
        }
    }

    public void withdraw(double amount){
        if(amount <= this.balance){
            this.balance -= amount;
        }
    }
}
