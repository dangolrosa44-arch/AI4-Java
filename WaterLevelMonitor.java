import java.util.Scanner;

/**
 * Write a description of class WaterLevelMonitor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WaterLevelMonitor
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value");
        int Value=sc.nextInt();
        String message=(Value>=1000)?"Warning:Water level is above 1000":"Normal";
        System.out.println("the status is "+message);
    }
}