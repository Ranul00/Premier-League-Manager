package com.ranul.oop;

import java.io.Serializable;

public class Match implements Serializable,Comparable<Match> {
    private static final long serialVersionUID = 1L;

    private  String team1;
    private String team2;
    private int goalsRecieved;
    private int goalsScored;
    private int date;
    private int month;
    private int year;
    private int dmy;


    public  Match(){
    }

    @Override
    public int compareTo(Match compareMatch) {
        int compareDmy = ((Match)compareMatch).getDmy();
            return compareDmy - this.dmy;
    }


    public Match(int date, int month, int year, String team1, String team2, int goalsScored, int goalsRecieved) {
        this.date = date;
        this.month = month;
        this.year = year;
        this.team1 = team1;
        this.team2 = team2;
        this.goalsScored = goalsScored;
        this.goalsRecieved = goalsRecieved;
        this.dmy = year*30*12 + month * 30 + date;
    }

    public int getDmy() {
        return dmy;
    }


    public int getYear() {
        return year;
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

    public void setYear(int year) {
        this.year = year;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public int getGoalsRecieved() {
        return goalsRecieved;
    }

    public void setGoalsRecieved(int goalsRecieved) {
        this.goalsRecieved = goalsRecieved;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }
    @Override
    public String toString() {
        return  "team1 : " + team1 +
                "\t|\t team2 : " + team2 +
                "\t|\t goalsRecieved : " + goalsRecieved +
                "\t|\t goalsScored : " + goalsScored +
                "\t|\t date : " + date +
                "\t|\t month : " + month +
                "\t|\t year : " + year +
                "\t|\t yyyy/mm/dd : " + year + "/" + month + "/" + date;
    }
}
