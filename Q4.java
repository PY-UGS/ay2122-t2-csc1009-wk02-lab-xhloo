import java.util.Scanner;

public class Q4 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = input.nextInt();

        String[] zodiac = {"monkey", "rooster", "dog", "pig", "rat", "ox","tiger",
        "rabbit", "dragon", "snake", "horse", "sheep"};

        System.out.println(zodiac[year % 12]); //e.g. 2001 % 12 = R9 (which is snake)
    }
}
