package chapter3;

import java.time.*;

public class DatesAndTime {

    public static void main(String[] args) {
        
       /*System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        */

        LocalDate date1 = LocalDate.of(2005,6,7);
        System.out.println(date1);
        LocalDate date2 = LocalDate.of(2015,Month.JANUARY,20);
        System.out.println(date2);

        LocalTime time1 = LocalTime.of(6, 15, 54,500);
        System.out.println(time1);

        LocalDateTime ldt1 = LocalDateTime.of(2005,Month.JULY,2,6,5,40,2000);
        System.out.println(ldt1);
    
        
        // date plus or minus - years, months, weeks, days

        System.out.println(date1.plusDays(30).minusWeeks(2));

        // time plus or minus - hours, minutes, seconds, nanos

        //Date plus or minus - years, months, weeks, days, hours, minutes, seconds, nanos (ALL)

        
    }
}