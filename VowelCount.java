import java.util.Scanner;

public class VowelCount 
{
    public static void main(String[] args) 
    {
        Scanner scantor = new Scanner(System.in);
        boolean continoo = true;

        while(continoo)
        {
            System.out.println("Enter a string: ");
            int vowelCount = 0;
            int constCount = 0;
            String word = scantor.next();
            String newWord = word.toUpperCase();
            
            for(int i =0;i<word.length();i++)
            {
                if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u')
                {
                    vowelCount++;
                }
                else
                {
                    constCount++;
                }
            }
            System.out.println("Number of vowels: " + vowelCount);
            System.out.println("Number of consonants: " + constCount);
            if(word.equals("quit"))continoo=false;
        }
        
        
    }
}
