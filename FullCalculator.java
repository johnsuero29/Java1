package JavaBasics1.Java1;
import java.util.Scanner;

public class FullCalculator 
{
    public static void main(String[] args) 
    {
        Scanner scantor = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scantor.nextInt();
        System.out.println("Enter secoond number: ");
        int b = scantor.nextInt();

        System.out.println("Enter operation (add, sub, mul, div): ");
        String op =scantor.next();

        switch (op) 
        {
            case "add":
                System.out.println("Result: " + (a+b));
                break;
        
            case "sub":
                System.out.println("Result: " + (a-b));
                break;

            case "mul":
                System.out.println("Result: " + (a*b));
                break;

            case "div":
                System.out.println("Result: " + (a+b));
                break;
        }

        scantor.close();
    }
}
