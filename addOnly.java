import java.util.Scanner;

public class addOnly 
{
    public static void main(String[] args) 
    {
        Scanner scantor = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scantor.nextInt();
        System.out.println("Enter secoond number: ");
        int b = scantor.nextInt();

        System.out.println("Result: " + (a+b));
        scantor.close();
    }    
}
