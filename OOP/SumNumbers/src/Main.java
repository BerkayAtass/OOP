import java.util.Scanner;

class SumNumber {

    public static void main(String[] args) {

        int a,b;

        Scanner scan = new Scanner(System.in);
        System.out.println("Write two numbers");

        a = scan.nextInt();
        b = scan.nextInt();
        sum ab = new sum (a, b);
        ab.printSum();
    }
}