import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] list = new int[10];
        int i,n;
        Scanner scan = new Scanner(System.in);

        for( i = 0; i<10 ; i++)
        {
            System.out.print((i+1) + ". number =  ");
            list[i] = scan.nextInt();
        }
        System.out.println("Write a number for find the placement");
        n = scan.nextInt();
        System.out.println("The placement of this number in the list = " + search(n,list));

    }


    static int search (int n, int[] list) {

        int i = 0;
        while(list[i] != n)
        {
            i++;
        }
        i++;
        return i;
    }
}