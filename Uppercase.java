import java.util.Scanner;

public class Uppercase
{
    public static void main(String[] args) 
    {
        Scanner scanor = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String name =  scanor.next();
        
         System.out.println(name.toUpperCase());
    }
}