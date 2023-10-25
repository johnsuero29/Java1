import java.util.Scanner;
import java.util.StringTokenizer;

public class Capital
{
    public static void main(String[] args) 
    {
        Scanner scanor = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String sentenceString =  scanor.nextLine();

        String result;
    
        String[] words = sentenceString.split(" ");
        for(String word: words)
        {
            String res = word.substring(0, 1).toUpperCase();
            res += (word.substring(1, word.length()));
            System.out.print(res+ " ");
        }
    
    }
}
