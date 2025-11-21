import java.util.Scanner;

/**
 * Write a description of class UserInputExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UserInputExample
{
    public static void main(String[]arg)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter firstNumber");
    int firstValue=sc.nextInt(); 
    System.out.println("Enter secondNumber");
    int secondValue=sc.nextInt();
    
    int greater=(firstValue>secondValue)?firstValue:secondValue;
    
    System.out.println("the greater value from two number is "+greater);
    }
}