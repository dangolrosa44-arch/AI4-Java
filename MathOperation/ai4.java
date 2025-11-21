package MathOperation;
import java.util.Scanner;


/**
 * Write a description of class ai4 here.
 *
 * @author (your name)
 // * @version (a version number or a date)
 */
public class ai4
{
   public static void main(String[]arg)
   {
    Scanner sc=new Scanner(System.in);
       // System.out.println("Enter a numeric grade");
       // float grade=sc.nextFloat();
       // String marks=(grade>=40)?"passed":"failed";
       // System.out.println("the student "+marks );
    System.out.println("Enter seconds");
    int sec=sc.nextInt();
    int h=sec/3600;
    int min=(sec%3600)/60;
    int s=sec%60;
    System.out.println("the hour is "+h + "\n" + "the minuite is "+min + "\n" + "the second is "+s);
    
    
   }
    
}