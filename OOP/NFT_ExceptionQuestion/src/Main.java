public class Main {
    public static void main(String[] args) {

        try {
            NFT nft = new NFT(3000,"User");
        }catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }
    }
}