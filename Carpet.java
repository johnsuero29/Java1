import java.util.Arrays;
import java.util.Scanner;

public class Carpet 
{
    public static void main(String[] args) 
    {
        boolean notDone = true;
        Scanner consolo = new Scanner(System.in);
        System.out.println("Enter price per square feet: ");
        double price = consolo.nextDouble();
        double totalSqFeet = 0;
        
        
        while(notDone)
        {
            double sqFeet = 1;
            Scanner consola = new Scanner(System.in);
            System.out.println("Enter room dimensions (width X height): ");
            String line = consola.nextLine();
            if(line.equals("done"))
            {
                notDone = false;
                break;
            }
            String[] array = line.split(" x ");
            System.out.println(Arrays.toString(array));
            
            totalSqFeet += Integer.parseInt(array[0]) * Integer.parseInt(array[1]);
        }
        System.out.println(totalSqFeet);
        System.out.println("Total cost: " + (price * totalSqFeet));

    }    
}
