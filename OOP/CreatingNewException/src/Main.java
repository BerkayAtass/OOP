import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double money;
        Worker worker1 = new Worker("Ahmet");
        Worker worker2 = new Worker("Mehmet");
        Worker worker3 = new Worker("Veli");
        Worker all[] = {worker1,worker2,worker3};

        try {
           for (int i = 0; i < 3 ; i++){
               System.out.println("Enter a salary for " + all[i]);
               money = scan.nextDouble();
               all[i].setSalary(money);

               if (money < 0.0){
                   throw new Exception("The money's value must be a positive number.");
               }
           }
        }catch (Exception e){
            System.out.println("Error : " + e.getMessage());
        }finally {
            scan.close();
            System.out.println(worker1.toString());
            System.out.println(worker2.toString());
            System.out.println(worker3.toString());
            System.out.println("Total worker numbers is " + all[0].getCount());
        }


    }
}