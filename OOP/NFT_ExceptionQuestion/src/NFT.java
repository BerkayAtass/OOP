public class NFT {

    private double balance;
    private String owner;

    public NFT(double balance, String owner){
        setBalance(balance);
        this.owner = owner;
    }

    public void setBalance(double balance){
        if(balance<0 || balance>1000){
            throw new IllegalArgumentException("Error balance");
        }
        else {
            this.balance = balance;
        }
    }

}
