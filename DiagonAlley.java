import java.lang.reflect.Array;
import java.util.Scanner;

public class DiagonAlley 
{
    public static void main(String[] args) 
    {
        Scanner consolo = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String line = consolo.nextLine();
        
        String[] words = line.split(" ");
        for(String word : words)
        {
            String space = " ";
            for(int i = 0; i<word.length(); i++)
            {
                if(i==0)
                {
                    space=" ";
                }
                else
                {
                    space+= " ";
                }
                
                System.out.println((space) + word.charAt(i));
            }
        }
    }    
}
