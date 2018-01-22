import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateFormatter {

    public static void main(String[] args) {

        SimpleDateFormat datePattern = new SimpleDateFormat("EEE, dd MMM yyyy");
        String dateString = "Tue, 16 Aug 2016";


        try {

            Date date = datePattern.parse(dateString);
            System.out.println(date);
        }

        catch (ParseException e){

            e.printStackTrace();

        }

        ZonedDateTime zonedDateTime = ZonedDateTime.parse("Tue, 16 Aug 2016 09:49:51 GMT",
                DateTimeFormatter.ofPattern("EEE, dd MMM yyyy HH:mm:ss z"));
        System.out.println(zonedDateTime);
    }

}
