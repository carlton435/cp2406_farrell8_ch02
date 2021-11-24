import java.util.Scanner;
class MinutesConversion {
    public static void main(String[] args)
    {
        int minutes;
        double hours;
        double days;
        double MinToHour = 60;
        double HourToDay = 24;
        Scanner input = new Scanner(System.in);
        System.out.print("How many minutes:");
        minutes = input.nextInt();
        hours = minutes / MinToHour;
        days = hours / HourToDay;
        System.out.println(minutes + " minutes is " + hours + " hours or " + days + " days.");
    }
}
