import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;


public class Time {
    public static void main(String[] args) {
        //ZoneId zone1 = ZoneId.of("America/Chicago");
        //LocalTime lTime = LocalTime.now();
        //System.out.println(lTime.toString());
        DateFormat df = new SimpleDateFormat("hh:mm a");
        System.out.println(df);
    }
}