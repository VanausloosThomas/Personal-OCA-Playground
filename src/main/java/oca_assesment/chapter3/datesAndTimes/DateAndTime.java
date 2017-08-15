package main.java.oca_assesment.chapter3.datesAndTimes;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateAndTime {

    public static void main(String[] args) {
        DateAndTime dateAndTime = new DateAndTime();
        dateAndTime.printAllDateAndTimeTypes();
        dateAndTime.monthsStartFromOneInsteadOfZero();
        dateAndTime.datesAreImmutable();
        dateAndTime.periodCanNotBeUsedWithLocalTime();
        dateAndTime.dateTimeFormatter();
//        System.out.println(new String() == new DateAndTime());        Not allowed to compare to different kinds of objects using == !
        System.out.println(new StringBuilder().append("printing a StringBuilder will call its toString() method wich return the string value"));
    }

    //creating dates and times (no timezones on the exam!)

    //localDate only contains a date, no time or timezone
    public void localDateTest(){
        LocalDate localDate = LocalDate.now();                                  // No constructor is used/allowed! Only static methods!!!
        LocalDate localDate2 = LocalDate.of(2017,7,16);
        LocalDate localDate3 = LocalDate.of(2017, Month.JULY,16);
    }


    //localTime only contains a time, no date or timezone
    public void localTimeTest(){
        LocalTime localTime = LocalTime.of(12, 45);
    }

    //localDateTime contains a date,time but no timezone
    public void localDateTimeTest(){
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.of(2017,12,1,15,45);
        LocalDateTime localDateTime2 = LocalDateTime.of(date,time);
    }

    public void printAllDateAndTimeTypes(){
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
    }

    public void monthsStartFromOneInsteadOfZero(){
        LocalDate localDate1 = LocalDate.of(2017,7,16);
        LocalDate localDate2 = LocalDate.of(2017, Month.JULY,16);
        System.out.println(localDate1.equals(localDate2)?"months start counting from 1 instead of 0!":"this cant be right!");
    }

    public void datesAreImmutable(){
        LocalDate localDate=LocalDate.now();
        /*localDate =*/ localDate.plusDays(5);
        System.out.println(localDate.equals(LocalDate.now())? "dates and time are immutable! Dont forget to assign them to a reference variable!!!":"false");
    }

    public void datesAndTimesCanBeChained(){
        LocalDate localDate = LocalDate.now()
                                .minusDays(2)
                                .minusYears(5);
    }

    public void period(){
        Period period = Period.ofDays(3);
        Period period2 = Period.ofWeeks(3);
        Period period3 = Period.ofYears(3);
        Period period4 = Period.ofMonths(3);
        Period period5 = Period.of(3,4,5); // of.. methods can not be chained !!!
        // for smaller time-spans there is the Duration class !!!
    }

    public void periodCanNotBeUsedWithLocalTime(){
        Period period = Period.ofDays(1);
        LocalTime localTime = LocalTime.now();
//        localTime.plus(period);                 //UnsupportedTemporalTypeException!
        System.out.println(localTime);
    }


    //Formatting date and time

    public void dateTimeFormatter(){
        System.out.println("Date and time formatting using DateTimeFormatter: ");
        LocalTime time = LocalTime.now();
        LocalDate date = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.of(date,time);

        System.out.println(date.format(DateTimeFormatter.ISO_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
//        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)));     throws error
//        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withLocale(Locale.GERMANY)));
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(dateTime));     //same as exampe 5!!

        //MMMM = monthname spelled out, MM = month in nrs
        DateTimeFormatter ownFormat = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println("own format:");
        System.out.println(ownFormat.format(dateTime));
    }
}
