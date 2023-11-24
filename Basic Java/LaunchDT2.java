import java.time.*;
public class LaunchDT2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        //System.out.println(date);

        int day = date.getDayOfMonth();
        int month = date.getMonthValue();
        int year = date.getYear();

        System.out.println(day+" / "+month+" / "+year);

        LocalTime Time = LocalTime.now();
        //System.out.println(Time);

        int hour= Time.getHour();
        int min = Time.getMinute();
        int sec = Time.getSecond();

        System.out.println(hour+":"+min+":"+sec);
    }
}