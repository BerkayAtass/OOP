import java.util.Scanner;

 class RockPaperScissors {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int gameCount, p1Score = 0;
        int p2Score = 0;
        player p1 = new player();
        player p2 = new player();

        System.out.println("Type the name of the 1st player!");
        p1.setName(scan.nextLine());
        System.out.println("Type the name of the 2st player!");
        p2.setName(scan.nextLine());

        System.out.println("How many hands does the game have?");
        gameCount = scan.nextInt();

        while(gameCount != 0)
        {

            while(true)
            {
                System.out.println(p1.getName() +" turn");
                menu();
                p1.setSelect(scan.nextInt());
                if(p1.getSelect() == 1 || p1.getSelect() == 2 ||  p1.getSelect() == 3)
                {
                    break;
                }
                else
                {
                    System.out.println("Plase choose 1, 2 or 3!");
                }
            }


            while(true)
            {
                System.out.println(p2.getName() +" turn");
                menu();
                p2.setSelect(scan.nextInt());
                if(p2.getSelect() == 1 ||  p2.getSelect() == 2 ||  p2.getSelect() == 3)
                {
                    break;
                }
                else
                {
                    System.out.println("Plase choose 1, 2 or 3!");
                }
            }

            if(result(p1.getSelect(),p2.getSelect()) == 1)
            {
                System.out.println(p1.getName() +" won this turn");
                p1Score++;
                p1.setScore(p1Score);
            }
            else if(result(p1.getSelect(),p2.getSelect()) == 2)
            {
                System.out.println(p2.getName() + " won this turn");
                p2Score++;
                p2.setScore(p2Score);
            }
            else
            {
                System.out.println("Draw!");
            }

            System.out.println(" Current score");
            System.out.println("---------------------------------");
            System.out.println(p1.getName() + " = " + p1.getScore());
            System.out.println(p2.getName() + " = " + p2.getScore());

            gameCount--;
        }
    }


    public static void menu(){

        System.out.println("Please choose one of them");
        System.out.println("1 - Rock");
        System.out.println("2 - Paper");
        System.out.println("3 - Scissors");
        System.out.println("");
        System.out.print("-----------------------------------------------------------");
        System.out.println("");
    }

    public static int result(int p1, int p2){

        if(p1 == p2)
        {
            return 0;
        }
        else if(p1 == 1 && p2 == 3 || p1 == 2 && p2 == 1 || p1 == 3 && p2 == 2)
        {
            return 1;
        }
        else
        {
            return 2;
        }
    }
}