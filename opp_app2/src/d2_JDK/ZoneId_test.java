package d2_JDK;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneId_test {
    public static void main(String[] args) {
        //ZoneId zoneId = ZoneId.systemDefault();
       // System.out.println(zoneId);
       //System.out.println(zoneId.getAvailableZoneIds());


        ZoneId zoneId1 = ZoneId.of("America/New_York");
        ZonedDateTime now = ZonedDateTime.now(zoneId1);
        System.out.println(now);

        ZonedDateTime now2 = ZonedDateTime.now(Clock.systemUTC());
        System.out.println(now2);
        System.out.println(now2.getZone());
        System.out.println(now2.getDayOfMonth());

    }
}
