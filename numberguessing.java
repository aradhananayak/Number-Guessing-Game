import java.util.Random;
import java.util.Scanner;

public class numberguessing {
    public static void main(String[] args)
    {
        Random ran = new Random();
        Scanner sc= new Scanner(System.in);
        int rannumber= ran.nextInt(1000);
       // System.out.println("Random number is" + " " + rannumber );
        int trycount=0;
        long starttime= System.currentTimeMillis();

        while(true) {
            System.out.println("Enter the guessed number (0-1000):");
            int playerguess = sc.nextInt();
            trycount++;
            if (playerguess == rannumber) {
                System.out.println("Correct! Your guess was right");
                System.out.println("It took you"+" "+ trycount+" tries");
                long endtime=System.currentTimeMillis();
                long elapsedtime=endtime-starttime;
                System.out.println("Time taken:"+(elapsedtime/1000)+"seconds");
                break;

            }
            else if (rannumber > playerguess) {
                System.out.println("Nope!The random number is higher. Guess again");
            } else {
                System.out.println("Nope!The random number is lower. Guess again");

            }
        }

          sc.close();


    }
}
