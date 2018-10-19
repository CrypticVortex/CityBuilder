package com.crypticvortex.cb.core.time;

public class Date {
    private int year, day;
    private Month month;
    private boolean isLeapYear;

    public Date(int year, Month month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public static boolean isLeapYear(int year){
        if(year % 400 == 0)
            return true;
        if(year % 100 == 0)
            return false;
        if(year % 4 == 0)
            return true;
        return false;
    }

    public void addDays(){
        if(Month.getDays(month) == ++day) {
            day = 1;
            addMonth();
            return;
        }
    }

    private void addMonth(){
        month = Month.getNextMonth(month, year);
        if(month == Month.JANUARY)
            addYear();
    }

    private void addYear(){
        ++year;
        isLeapYear = isLeapYear(year);
        month = Month.JANUARY;
    }
}
