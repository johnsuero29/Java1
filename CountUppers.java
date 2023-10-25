import java.util.Scanner;

public class CountUppers 
{
    public static void main(String[] args) 
    {
        Scanner scanor = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String name =  scanor.next();
        
        String uppers = name.toUpperCase();

        int count = 0;
        for(int i=0;i<name.length();i++)
        {
            for (int j=0; j<uppers.length(); j++)
            {
                if(uppers.charAt(j) == name.charAt(i))
                {
                    count++;
                }
            }
        }

        System.out.println(count);
        scanor.close();
    }
}
