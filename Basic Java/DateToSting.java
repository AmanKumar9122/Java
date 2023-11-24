import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToSting {
   
    public static String dateToString(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        return dateFormat.format(date);
    }

    public static void main(String[] args) {
        Date date = new Date(); // Replace with your desired date

        String formattedDate = dateToString(date);
        System.out.println(formattedDate);
    }
}