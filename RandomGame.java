import java.util.Random;
import java.util.Scanner;

public class RandomGame 
{
    public static void main(String[] args) 
    {
        Scanner consolo = new Scanner(System.in);
        
        Random rando = new Random();
        int randNum = rando.nextInt(5);
        System.out.println(randNum);

        while(true)
        {
            System.out.println("Enter a number: ");
            int guess = consolo.nextInt();
            if(guess == randNum)
            {
                System.out.println("You guessed it!");
                break;
            }
        }    
    }    
}
