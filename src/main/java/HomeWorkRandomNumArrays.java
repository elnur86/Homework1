import java.util.Random;
import java.util.Scanner;


public class HomeWorkRandomNumArrays
{
    public static void main(String[] args)
    {
    int RandomNumber;
    Random number= new Random();
    RandomNumber=number.nextInt(15);
    System.out.println(RandomNumber);

    Scanner MyObj= new Scanner(System.in);
    System.out.print("Please enter your name: ");
    String Name = MyObj.nextLine();
    System.out.println("Let the game begin! ");

    System.out.println("Please enter your best guess from 0 to 100");
    int GuessNumber;
    do {
        GuessNumber = MyObj.nextInt();
            if (GuessNumber>RandomNumber)
            {
                System.out.println("Your number is too big. Please, try again");
            }
            else
            {
                System.out.println("Your number is too small. Please try again");
            }
        }while(GuessNumber==RandomNumber);
    }
}

