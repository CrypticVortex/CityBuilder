package com.crypticvortex.cb.core.time;

public enum Month {
    JANUARY,
    FEBRUARY,
    LEAP_FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;


    public static int getDays(Month month){
        switch(month){
            case JANUARY:return 31;
            case FEBRUARY: return 28;
            case LEAP_FEBRUARY: return 29;
            case MARCH: return 31;
            case APRIL: return 30;
            case MAY: return 31;
            case JUNE: return 30;
            case JULY: return 31;
            case AUGUST: return 31;
            case SEPTEMBER: return 30;
            case OCTOBER: return 31;
            case NOVEMBER: return 30;
            default: return 31;
        }
    }

    public static Month getNextMonth(Month month, int year){
        switch (month){
            case JANUARY:{
                if(Date.isLeapYear(year))
                    return LEAP_FEBRUARY;
                return FEBRUARY;
            }
            case FEBRUARY:
            case LEAP_FEBRUARY: return MARCH;
            case MARCH: return APRIL;
            case APRIL: return MAY;
            case MAY: return JUNE;
            case JUNE: return JULY;
            case JULY: return AUGUST;
            case AUGUST: return SEPTEMBER;
            case SEPTEMBER: return OCTOBER;
            case OCTOBER: return NOVEMBER;
            case NOVEMBER: return DECEMBER;
            default: return JANUARY;
        }
    }

    public static int getMonthNumber(Month month){
        switch(month){
            case JANUARY:return 1;
            case FEBRUARY:
            case LEAP_FEBRUARY: return 2;
            case MARCH: return 3;
            case APRIL: return 4;
            case MAY: return 5;
            case JUNE: return 6;
            case JULY: return 7;
            case AUGUST: return 8;
            case SEPTEMBER: return 9;
            case OCTOBER: return 10;
            case NOVEMBER: return 11;
            default: return 12;
        }
    }

}
