import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a number.");
        number = scan.nextInt();
        System.out.print("3 times " + number + " = " + 3*number + " and 5 times " + number + " = " + 5*number);


    }

}