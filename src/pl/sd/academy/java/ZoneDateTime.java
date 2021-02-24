package pl.sd.academy.java;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.TimeZone;

public class ZoneDateTime {
    public static void main(String[] args) {

        String[] timeZones= TimeZone.getAvailableIDs();
        for (String zone : timeZones) {
            System.out.println(zone);
        }
        String[] dates = new String[]{
                "1999-12-31T23:30",
                "2015-02-28T17:45",
                "2015-07-21T17:45"
        };
        LocalDateTime[] localDateTimes = new LocalDateTime(dates[i]);
   for (int i = 0; i< dates.length; i++){
       times[i]= LocalDateTime.parse(dates[i]);
       System.out.println(times[i]);
   }
        ZoneId[] zoneIds = new ZoneId[]{
            ZoneId.of("UTC"),
                    ZoneId.of("UTC"),
                    ZoneId.of("Europe/London"),
                    ZoneId.of("US Central"),
                    ZoneId.of("Asia/Calcutta"),
                    ZoneId.of("Europe/Warsaw"),
                    ZoneId.of("GMT+1"),
        };
            for (LocalDateTime localDateTime :times) {

            }
        }


    }

//UTC, Europe/London, Europe/London, Asia/Calcutta, Europe/Warsaw, GMT+1