package org.example.day;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class DayOfYear {
    public static void main(String[] args) throws IOException {
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH)+1;
        int day = now.get(Calendar.DAY_OF_MONTH);
        System.out.println(year);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("請使用者輸入年份");
        String yearString = br.readLine();
        year = (!yearString.isEmpty())?Integer.parseInt(yearString):year;

        System.out.println("請使用者輸入月份");
        String monthString = br.readLine();
        month = (!monthString.isEmpty())?Integer.parseInt(monthString):month;
        System.out.println("請使用者輸入日");
        String dayString = br.readLine();
        day = (!dayString.isEmpty())?Integer.parseInt(dayString):day;
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
    }
}
