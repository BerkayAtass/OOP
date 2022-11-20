public class Account {

    private double balance;
    private String ownerName;
    private int password;

    public Account( String ownerName, double balance, int password){

        this.ownerName = ownerName;
        this.password = password;
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

    public int getPassword() {
        return password;
    }
}
