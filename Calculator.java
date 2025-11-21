import java.util.Scanner;

/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int firstValue=sc.nextInt();
        System.out.println("Enter second number");
        int secondValue=sc.nextInt();
        int sum=firstValue+secondValue;
        System.out.println("the sum is "+sum);
        int difference=firstValue-secondValue;
        System.out.println("the difference is "+difference);
        int product=firstValue*secondValue;
        System.out.println("the product is "+product);
        int division=firstValue%secondValue;
    }
}