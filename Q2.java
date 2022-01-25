// Entering 3 numbers in different lines (pressing enter)

import java.util.Scanner;

public class Q2 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        System.out.println("The average of " + a + " " + b + " " + c + " " + "is " + average(a, b, c));
    }

    public static double average(double a, double b, double c)
    {
        return (a + b + c) /3;
    }
}
