import java.util.Random;
import java.util.Scanner;


public class HomeWorkRandomNumArrays
{
    public static void main(String[] args)
    {
    int RandomNumber;
    int i, j, ArrayNumber[];
    ArrayNumber = new int[50];
    Random number= new Random();
    RandomNumber=number.nextInt(100);
    System.out.println(RandomNumber);

    Scanner MyObj= new Scanner(System.in);
    System.out.print("Please enter your name: ");
    String Name = MyObj.nextLine();
    System.out.println("Let the game begin! ");

    System.out.println("Please enter your best guess from 0 to 100");
    int GuessNumber;
        GuessNumber = MyObj.nextInt();
        i=1;
        do {
            ArrayNumber[i]=GuessNumber;
            i++;
            if (GuessNumber>RandomNumber)
            {
                System.out.println("Your number is too big. Please, try again");
            }
            else
            {
                System.out.println("Your number is too small. Please try again");
            }
        GuessNumber = MyObj.nextInt();
        }while(GuessNumber!=RandomNumber);
        j=i;
        System.out.printf("Congratulations %s!!!\n", Name);

        for (i=1;i<j;i++)
        {
            System.out.println(ArrayNumber[i]);
        }
    }
}

