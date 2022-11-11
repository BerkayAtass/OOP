import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number;

        Scanner scan = new Scanner(System.in);
        System.out.println("Write a number");
        number = scan.nextInt();

        System.out.println(fact(number));
    }

    static int fact(int a){

        if(a == 1)
        {
            return 1;
        }
        else
        {
            return a * fact(a-1);
        }

    }
}