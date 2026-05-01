package MethodsSystem;

import ConsoleSystem.Console;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

public class MethodDate {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    
    private static LocalDate convertToLocalDate(Date date) {
        if (date == null) return null;
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }
    
    public static int[] toIntegerDate(Date date) {
        LocalDate localDate = convertToLocalDate(date);
        if (localDate == null) return null;
        
        return new int[]{
            localDate.getDayOfMonth(), 
            localDate.getMonthValue(), 
            localDate.getYear()
        };
    }
    
    public static boolean isEqual(Date date1, Date date2) {
        LocalDate d1 = convertToLocalDate(date1);
        LocalDate d2 = convertToLocalDate(date2);
        
        if (d1 == null || d2 == null) return false;
        return d1.isEqual(d2);
    }
    
    public static Date toDate(int day, int month, int year) {
        try {
            String dateString = String.format("%02d-%02d-%04d", day, month, year);
            LocalDate localDate = LocalDate.parse(dateString, formatter);
            
            return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        } catch (DateTimeParseException e) {
            Console.errorOut("Convert to date parse exception", e);
        }
        return null;
    }
}