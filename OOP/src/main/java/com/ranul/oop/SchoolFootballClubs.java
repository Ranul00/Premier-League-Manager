package com.ranul.oop;

public class SchoolFootballClubs extends FootballClub{
    private String schoolName;


    public SchoolFootballClubs() {

    }
    public SchoolFootballClubs(String clubName, String clubLocation) {
        super(clubName, clubLocation);


    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }





    @Override
    public String toString() {
        return  super.toString() +
                "\nschoolName : " + schoolName;
    }
}
