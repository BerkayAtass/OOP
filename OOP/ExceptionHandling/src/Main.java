import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1, number2;
        try {
            number1 = scan.nextInt();
            number2 = scan.nextInt();
            System.out.println(number1/number2);
        }catch (ArithmeticException e){
            System.out.println("Error : " + e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("Error : " + e.getMessage());
        }
        finally {
            scan.close();
        }
    }
}