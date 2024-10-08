package com.YahooFinance.scapper.helper;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
    public static String formatDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd");
        return dateFormat.format(date);
    }

    public static Period extractPeriod(String period) {
        int num = Integer.parseInt(period.substring(0, period.length() - 1));
        char timeUnit = period.charAt(period.length() - 1);

        Calendar startDate = Calendar.getInstance();
        Calendar endDate = Calendar.getInstance();

        switch (timeUnit) {
            case 'Y':
            case 'y':
                startDate.add(Calendar.YEAR, -num);
                break;
            case 'M':
            case 'm':
                startDate.add(Calendar.MONTH, -num);
                break;
            case 'W':
            case 'w':
                startDate.add(Calendar.DATE, -num * 7);
                break;
            default:
                System.out.println("Error: Invalid time unit");
        }
        return new Period(formatDate(startDate.getTime()), formatDate(endDate.getTime()));
    }

//    public static void main(String[] args) {
//        Period period = extractPeriod("9M");
//        System.out.println(period);
//    }
}
