import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int vote = 3;

        Account account = new Account("User", 0.0, 1234);


        if(permit(account)){
            while(vote != 0){

                System.out.println("--------------------------------");
                System.out.println("1- Add");
                System.out.println("2- Withdraw");
                System.out.println("3- Print account info");
                System.out.println("0- Exit");
                System.out.println("--------------------------------");
                vote = scan.nextInt();

                switch(vote){
                    case 1 :
                        System.out.println("Enter the amount you want to add");
                        account.add(scan.nextDouble());
                        break;
                    case 2 :
                        System.out.println("Enter the amount you want to withdraw");
                        account.withdraw(scan.nextDouble());
                        break;
                    case 3 :
                        System.out.println("Name :" + account.getOwnerName());
                        System.out.println("Balance :" + account.getBalance());
                        break;
                }
            }
        }
    }

    public static boolean permit(Account account){
        String name;
        int password,i;
        Scanner scan = new Scanner(System.in);

        for (i = 2; i >-1; i-- ){
            System.out.println("Enter username and password for bank access.");
            System.out.print("Name :");
            name = scan.nextLine();
            System.out.print("Password :"); //We need "1234"
            password = scan.nextInt();

            if(account.getOwnerName().equals(name) && account.getPassword() == password){
                return true;
            }else {
                System.out.println("You entered the wrong username or password. Your remaining attempts : " + i);
            }
        }
        System.out.println("Your account has been blocked, please try again later");
        return false;

    }
}