package d2_JDK;

import java.time.LocalDate;

public class LocalTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        int year = date.getYear();
        System.out.println(year);

        int dayWeek = date.getDayOfWeek().getValue();
        System.out.println(dayWeek);
        LocalDate date1 = date.withYear(2009);
        System.out.println(date1);

        LocalDate date2 = date.plusYears(2009);
        System.out.println(date2);
    }
}
