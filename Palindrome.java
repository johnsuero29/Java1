import java.util.Scanner;

public class Palindrome 
{
    public static void main(String[] args) 
    {
        Scanner scantor = new Scanner(System.in);
        System.out.println("Enter an word: ");
        String x = scantor.next();
        System.out.println(isPalindrome(x));
    }

    static boolean isPalindrome(String num)
    {
        String dummy = "";
        
        for(int i = num.length()-1; i >= 0; i--)
        {
            dummy += num.charAt(i);
        }
        System.out.println(dummy);
        if(dummy.equals(num))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
