package com.ranul.oop;

public class FootballClub extends SportsClub implements Comparable<FootballClub> {
    private static final long serialVersionUID = 1L;

    private int wins = 0;
    private int draws = 0;
    private int defeats = 0;
    private int goalRecieved = 0;
    private int goalScored = 0;
    private int points = 0;
    private int numOfMatches = 0;
    private int goalDifferance = 0;

    public FootballClub(){
    }

    public FootballClub(String clubName, String clubLocation) {
        super(clubName, clubLocation);
    }

    @Override
    public int compareTo(FootballClub compare) {                                        //changing sorting method to decending order according to points
        int comparePoints = ((FootballClub) compare).getPoints();
        if(comparePoints-this.points == 0){
            int compareGoalDifference = ((FootballClub)compare).getGoalDifferance();
            return compareGoalDifference - this.getGoalDifferance();
        }
        else {
            return comparePoints - this.points;
        }
    }

    public void setWins(int goalScored , int goalRecieved) {
        numOfMatches ++;
        wins ++;
        points += 3;
        this.goalScored += goalScored;
        this.goalRecieved += goalRecieved;
        goalDifferance = this.goalScored - this.goalRecieved;
    }

    public void setDraws(int goals) {
        numOfMatches ++;
        draws ++;
        points ++;
        this.goalScored += goals;
        this.goalRecieved += goals;

    }

    public void setDefeats(int goalScored , int goalRecieved) {
        numOfMatches ++;
        defeats ++;
        this.goalScored += goalScored;
        this.goalRecieved += goalRecieved;
        goalDifferance = this.goalScored -this.goalRecieved ;

    }

    public void setGoalRecieved(int goalRecieved) {
        this.goalRecieved = goalRecieved;
    }

    public void setGoalScored(int goalScored) {
        this.goalScored = goalScored;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setNumOfMatches(int numOfMatches) {
        this.numOfMatches = numOfMatches;
    }

    public void setGoalDifferance(int goalDifferance) {
        this.goalDifferance = goalDifferance;
    }

    public int getWins() {
        return wins;
    }


    public int getDraws() {
        return draws;
    }


    public int getDefeats() {
        return defeats;
    }


    public int getGoalRecieved() {
        return goalRecieved;
    }


    public int getGoalScored() {
        return goalScored;
    }


    public int getPoints() {
        return points;
    }


    public int getNumOfMatches() {
        return numOfMatches;
    }

    public int getGoalDifferance(){
        return goalDifferance;
    }

    @Override
    public String toString() {
        return super.toString() + "\nwins : " + wins +
                "\t|\tdraws : " + draws +
                "\t|\tdefeats : " + defeats +
                "\t|\tgoals recieved : " + goalRecieved +
                "\t|\tgoals scored : " + goalScored +
                "\t|\tpoints : " + points +
                "\t|\tnumber of matches played : " + numOfMatches +
                "\t|\t goal differance : " + goalDifferance;
    }
}
