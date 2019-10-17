import java.util.Random;
import java.util.Scanner;


public class HomeWorkRandomNumArrays
{
    public static void main(String[] args)
    {
    Random number= new Random();
    System.out.println(number.nextInt(15));

    Scanner PlayerName= new Scanner(System.in);
    System.out.print("Please enter your name: ");
    String Name = PlayerName.nextLine();
    System.out.println("Player 1 is: " + Name);


    }
}
