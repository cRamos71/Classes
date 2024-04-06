package edu.ufp.inf.lp2.p01_intro.p01_person.data.math;

import java.util.*;

/**
 * 
 */
public class Date {

    private short day;
    private short month;
    private int year;

    public short getDay() {
        return day;
    }

    public void setDay(short day) {
        this.day = day;
    }

    public short getMonth() {
        return month;
    }

    public void setMonth(short month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Default constructor
     */
    public Date() {
    }

    public Date(short day, short month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Date date)) return false;
        return day == date.day && month == date.month && year == date.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }

    /**
     * @param d 
     * @return
     */
    public int compareTo(Date d) {
        if(this.year == d.year && this.month == d.month && this.day == d.day) {
            return 0;
        } else if(this.year == d.year){
            if(this.month == d.month){
                return (this.day - d.day) / Math.abs(this.day - d.day);
            }else {
                return (this.month - d.month) / Math.abs(this.month - d.month);
            }
        }
        return (this.year - d.year) / Math.abs(this.year - d.year);

    }

    /**
     * @param d 
     * @return true if this date
     */
    public boolean afterDate(Date d) {
        // TODO implement here
        return false;
    }

    /**
     * @param d 
     * @return
     */
    public boolean beforeDate(Date d) {
        // TODO implement here
        return false;
    }

    /**
     * @param d 
     * @return
     */
    public int diferenceDays(Date d) {
        // TODO implement here
        return 0;
    }

    /**
     * @param d 
     * @return
     */
    public int diferenceMonths(Date d) {
        // TODO implement here
        return 0;
    }

    /**
     * @param d 
     * @return
     */
    public int diferenceYears(Date d) {
        //return date.daysCrawlerRecursive(new date(this), d);
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public void incrementDate() {
        // TODO implement here
        return;
    }

    /**
     * @param begin 
     * @param end 
     * @return
     */
    private long daysCrawlerRecursiveAux(Date begin, Date end) {
        // TODO implement here
        return 0;
    }

    /**
     * @param begin  
     * @param end  
     * @return
     */
    public int daysCrawlerRecursive(Date begin , Date end ) {
        // TODO implement here
        return 0;
    }

    /**
     * @param begin 
     * @param end 
     * @return
     */
    public int daysCrawler(Date begin, Date end) {
        // TODO implement here
        return 0;
    }

    /**
     * @param begin 
     * @param end 
     * @return
     */
    public int monthsCrawler(Date begin, Date end) {
        // TODO implement here
        return 0;
    }

    /**
     * @param year 
     * @return
     */
    public boolean isLeapYear(int year) {
        // TODO implement here
        return false;
    }

    /**
     * @param month 
     * @param year 
     * @return
     */
    public int daysMonth(short month, int year) {
        // TODO implement here
        return 0;
    }

    /**
     * @param beginDay 
     * @param beginMonth 
     * @param endDay 
     * @param endMonth
     * @param year 
     * @return
     */
    public int daysBetweenMonths(short beginDay, short beginMonth, short endDay, short endMonth, int year) {
        // TODO implement here
        return 0;
    }

    /**
     * @param beginDay 
     * @param beginMonth 
     * @param endDay 
     * @param endMonth
     * @param year 
     * @return
     */
    public int monthsBetweenMonths(short beginDay, short beginMonth, short endDay, short endMonth, int year) {
        // TODO implement here
        return 0;
    }

    /**
     * @param args 
     * @return
     */
    public static void main(String[] args) {
        // TODO implement here
        return;
    }

}