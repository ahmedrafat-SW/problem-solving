package com.dev.hackerrankproblems.oneweekpreparation;

public class TimeConversion {

    public static String timeConversion(String s) {
        String period = s.substring(8); // Get AM/PM
        int hour = Integer.parseInt(s.substring(0, 2)); // Extract hour
        String minutesAndSeconds = s.substring(2, 8); // Extract :mm:ss part

        if (period.equals("AM")) {
            if (hour == 12) { // 12 AM case → Convert to 00
                return "00" + minutesAndSeconds;
            }
            return s.substring(0, 8); // Other AM cases remain the same
        } else {
            if (hour == 12) { // 12 PM case → Remains the same
                return s.substring(0, 8);
            }
            return (hour + 12) + minutesAndSeconds; // Convert PM hour to 24-hour format
        }
    }


    public static void main(String[] args) {
        System.out.println("timeConversion(\"07:05:45PM\") = " + timeConversion("07:05:45PM"));
        System.out.println("timeConversion(\"12:00:00AM\") = " + timeConversion("12:00:00AM"));
        System.out.println("timeConversion(\"12:45:54PM\") = " + timeConversion("12:45:54PM"));

    }
}
