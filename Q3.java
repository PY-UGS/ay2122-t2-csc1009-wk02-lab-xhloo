public class Q3 
{
    public static void main(String[] args)
    {
        long totalMilliseconds, totalSeconds, currentSecond, totalMinutes, currentMinute, totalHours, currentHour = 0;

        totalMilliseconds = System.currentTimeMillis();
        totalSeconds = totalMilliseconds / 1000;
        currentSecond = totalSeconds % 60;
        totalMinutes = totalSeconds / 60;
        currentMinute = totalMinutes % 60;
        totalHours = totalMinutes / 60;
        currentHour = totalHours % 24;

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    }
}
