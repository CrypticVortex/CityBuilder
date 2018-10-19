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

    public void addDay(){
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

    @Override
    public String toString(){
        String date = "" + this.year;
        while(date.length() < 4)
            date = 0 + date;

        date += (Month.getMonthNumber(month) < 10)?
                ("/" + 0 ) + Month.getMonthNumber(month):
                "/" + Month.getMonthNumber(month);

        date += (day < 10)? ("/" + 0) + day: "/" + day;

        return date;
    }

    public int getYear() { return year; }
    public Month getMonth() { return month; }
    public int getDay() { return day; }
}
