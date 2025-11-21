import java.util.Scanner;

/**
 * Write a description of class Information here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Information
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student name");
        String name=sc.nextLine();
        System.out.println("Enter age");
        int age=sc.nextInt();
        System.out.println("Enter GPA");
        float GPA=sc.nextFloat();
    }
}