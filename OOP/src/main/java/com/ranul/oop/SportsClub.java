package com.ranul.oop;

import java.io.Serializable;

public class SportsClub implements Serializable {
    private static final long serialVersionUID = 1L;

    private String clubName;
    private String clubLocation;

    public  SportsClub(){

    }


    public SportsClub(String clubName, String clubLocation) {
        this.clubName = clubName;
        this.clubLocation = clubLocation;

    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getClubLocation() {
        return clubLocation;
    }

    public void setClubLocation(String clubLocation) {
        this.clubLocation = clubLocation;
    }




    @Override
    public String toString() {
        return "club name : " + clubName +
                "\t|\tclub location : " + clubLocation ;
    }
}
