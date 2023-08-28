package com.dev.hackerrankproblems;

import java.util.Calendar;

public class DateTimeFormatting {

    public static void main(String[] args) {
        getTheDayNameOfMonth();

    }

    static void getTheDayNameOfMonth() {
        // Create a Calendar instance
        Calendar calendar = Calendar.getInstance();

        // Set the date to "08/05/2015"
        calendar.set(2015, 7, 5); // Note: month is zero-based, so 7 represents August

        // Get the day of the week
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // Convert the day of the week to a string representation
        String dayName = "";
        switch (dayOfWeek) {
            case Calendar.SUNDAY:
                dayName = "Sunday";
                break;
            case Calendar.MONDAY:
                dayName = "Monday";
                break;
            case Calendar.TUESDAY:
                dayName = "Tuesday";
                break;
            case Calendar.WEDNESDAY:
                dayName = "Wednesday";
                break;
            case Calendar.THURSDAY:
                dayName = "Thursday";
                break;
            case Calendar.FRIDAY:
                dayName = "Friday";
                break;
            case Calendar.SATURDAY:
                dayName = "Saturday";
                break;
        }

        // Print the day name
        System.out.println(dayName);
    }
}
