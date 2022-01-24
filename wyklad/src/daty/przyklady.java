package daty;
import java.time.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class przyklady {

    public static void main(String[] args){

        int year = 2001;
        int month = 12;
        int day = 15;

        Date teraz = new Date();
        String teraz2 = new Date().toString();
        System.out.println("\n teraz : " + teraz);
        System.out.println("\n teraz2 : " + teraz2);

        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        Date d = calendar.getTime();
        double tenYersInMiliSeconds = 10 * 365.25 * 24 * 60 * 60 * 1000;
        System.out.println("\n tenyersinmiliseconds : " + tenYersInMiliSeconds);
        System.out.println("\n d przed zmiana : " + d);
        d.setTime(d.getTime() - (long) tenYersInMiliSeconds);
        System.out.println("\n d po zmianie : " + d);

        long diffInMillies = Math.abs(teraz.getTime() - d.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        System.out.println("\n DIFF  : " + diff);
        int okres = Period.between(LocalDate.of(2001, 10, 12), LocalDate.of(2010, 10, 14)).getYears();
        System.out.println("\n PERIOD BETWEEN   : " + okres);



        LocalDate teraz3 = LocalDate.now();
        System.out.println("\n teraz3 : " + teraz3);

        LocalDate jakas_data = LocalDate.of(year, month, day);
        System.out.println("\n jakas data : " + jakas_data);

        Date teraz4 = new Date(2001, 12, 24);
        System.out.println("\n teraz4 : " + teraz4);




    }


}
