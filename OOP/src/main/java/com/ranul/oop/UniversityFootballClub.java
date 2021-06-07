package com.ranul.oop;

public class UniversityFootballClub extends FootballClub{
    private String uniName;


    public UniversityFootballClub(){

    }

    public UniversityFootballClub(String clubName, String clubLocation) {
        super(clubName, clubLocation);
        this.uniName = uniName;
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }



    @Override
    public String toString() {
        return  super.toString() +
                "\nuniversity name : " + uniName;
    }
}
