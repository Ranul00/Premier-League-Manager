package com.ranul.oop;


import java.io.Serializable;

public class Dates implements Serializable {
    private static final long serialVersionUID = 1L;

    private int date;
    private int month;
    private int year;

    public Dates (){

    }

    public Dates(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public int getDate() {
        return date;
    }


    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


}
