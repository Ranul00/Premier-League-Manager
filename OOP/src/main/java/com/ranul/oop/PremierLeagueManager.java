package com.ranul.oop;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class PremierLeagueManager implements LeagueManager {

    static ArrayList<FootballClub> clubs = new ArrayList<>();
    static ArrayList<Match> matches = new ArrayList<>();

    @Override
    public void addClub() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter club Name : ");                                                     //getting club details
        String name = sc.next();
        name.toLowerCase();
        while (true) {
            int count = 0;
            for (FootballClub club : clubs) {
                if (name.equals(club.getClubName())) {
                    System.out.println("Already another club is using this club name");
                    System.out.print("Enter club Name : ");                                         //getting club details if the previose input is already in the list
                    name = sc.next();
                    count++;
                }
            }
            if (count == 0) {
                break;
            }
        }
        System.out.print("Enter club location : ");                                                 //getting club details
        String location = sc.next();
        location.toLowerCase();
        FootballClub f1 = new FootballClub(name, location);
        clubs.add(f1);
    }

    @Override
    public void deleteClub() {
        if (clubs.isEmpty()) {                                                                      // checks whether clubs array list is empty
            System.out.println("No clubs registered! ");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the club name : ");
            String clubname = sc.next();
            int count = 0;
            for (FootballClub f1 : clubs) {
                if (f1.getClubName().equals(clubname)) {                               // checks entered club name equals to clubname of the obj in the arraylist
                    clubs.remove(f1);                                                  // remove the club from the array list
                    System.out.println(f1.getClubName() + " removed!");
                    count++;
                    break;
                }
            }
            if (count == 0) {                                                               //if the entered name isnt equals to the clubname of the obj print the msg
                System.out.println("No clubs for this name! ");
            }
        }
    }

    @Override
    public void viewStats() {
        if (clubs.isEmpty()) {                                                          // checks whether clubs array list is empty
            System.out.println("No clubs registered!");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the club name : ");
            String clubname = sc.next();
            int count = 0;
            for (FootballClub f1 : clubs) {
                if (f1.getClubName().equals(clubname)) {                               // checks entered club name equals to clubname of the obj in the arraylist
                    System.out.println(f1);                                            //print the object with all the attributes
                    count++;
                    break;
                }
            }
            if (count == 0) {                                                               //if the entered name isnt equals to the clubname of the obj print the msg
                System.out.println("No clubs for this name! ");
            }
        }
    }

    @Override
    public void viewTable() {
        Collections.sort(clubs);                                                              //this is a method in java that sorts anything for an order overridden in FootballClub to change compareTo method in sort
        for (FootballClub f1 : clubs) {                                                      //getting the objects in clubs array list
            System.out.println(f1.getClubName() + "  |  points : " + f1.getPoints() + "  |  goal differance : " + f1.getGoalDifferance() + "     | number of matches : " + f1.getNumOfMatches() + "  |  goal scored : " + f1.getGoalScored() + "  |  goal recieved : " + f1.getGoalRecieved());           //print the stats table

        }
    }

    @Override
    public void addPlayedMatch() {
        if (clubs.size() > 1) {                                                              //checks whether clubs arraylist has more than a one club
            Scanner sc = new Scanner(System.in);

            int date = 0;
            int month = 0;
            int year = 0;

            setDate(date,month,year);
            Dates d1 = new Dates(date, month, year);

            int firstClub = indexClub("First Club name : ");
            int secondClub = 0;
            while (true) {
                secondClub = indexClub("Second Club name : ");
                if (firstClub == secondClub) {
                    System.out.println(clubs.get(firstClub).getClubName() + " already entered the name");

                } else {
                    break;
                }
            }
            int goalScored = input("1st team : scored goals :");
            int goalsRecieved = input("1st team : goals recieved : ");
            if (goalScored == goalsRecieved) {
                clubs.get(firstClub).setDraws(goalScored);
                clubs.get(secondClub).setDraws(goalsRecieved);
                System.out.println("Draw");

            } else if (goalScored > goalsRecieved) {
                clubs.get(firstClub).setWins(goalScored, goalsRecieved);
                clubs.get(secondClub).setDefeats(goalsRecieved, goalScored);
                System.out.println(clubs.get(firstClub).getClubName() + " Wins by " + clubs.get(firstClub).getGoalDifferance());
            } else {
                clubs.get(firstClub).setDefeats(goalScored, goalsRecieved);
                clubs.get(secondClub).setWins(goalsRecieved, goalScored);
                System.out.println(clubs.get(secondClub).getClubName() + " Wins by " + clubs.get(secondClub).getGoalDifferance());
            }
            Match m1 = new Match(d1.getDate(), d1.getMonth(), d1.getYear(), clubs.get(firstClub).getClubName(), clubs.get(secondClub).getClubName(), goalScored, goalsRecieved);
            matches.add(m1);
        } else if (clubs.isEmpty()) {
            System.out.println("no clubs registered");
        } else {
            System.out.println("theres only one club registered!");
        }

    }

    public void setDate(int date,int month,int year){

        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter day : ");
                date = sc.nextInt();
                break ;
            } catch (Exception e) {
                System.out.println("Invalid input !");
                sc.next();
            }
        }
        while (true) {
            try {
                System.out.print("Enter month : ");
                month = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input !");
                sc.next();
            }
        }
        while (true) {
            try {
                System.out.print("Enter year : ");
                year = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input !");
                sc.next();
            }
        }
    }

    public int indexClub(String msg) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int index = 0;
        while (true) {
            System.out.println(msg);
            String club = sc.next();
            for (FootballClub prmClubs : clubs) {
                if (prmClubs.getClubName().equals(club)) {
                    index = clubs.indexOf(prmClubs);
                    count++;
                }
            }
            if (count != 0) {
                break;
            } else {
                System.out.println(club + " not found! ");
            }
        }
        return index;
    }

    public int input(String msg) {
        Scanner sc = new Scanner(System.in);
        String input;
        while (true) {
            System.out.println(msg);
            input = sc.next();
            try {
                Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("please enter an interger value : ");
            }
        }
        return Integer.parseInt(input);
    }

    @Override
    public void save() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("matchDetails.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            FileOutputStream fileOutputStream2 = new FileOutputStream("matchDetails-matchClass.txt");
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(fileOutputStream2);
            for (FootballClub club : clubs) {
                objectOutputStream.writeObject(club);
            }
            for (Match match : matches) {
                objectOutputStream2.writeObject(match);
            }
            System.out.println("save success!");
            objectOutputStream.close();
            objectOutputStream2.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void load() throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream("matchDetails.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            FileInputStream fileInputStream2 = new FileInputStream("matchDetails-matchClass.txt");
            ObjectInputStream objectInputStream2 = new ObjectInputStream(fileInputStream2);
            for (; ; ) {
                try {
                    clubs.add((FootballClub) objectInputStream.readObject());
                    matches.add((Match) objectInputStream2.readObject());
                    System.out.println("load success !");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println();
        } catch (EOFException e) {
            System.out.println();
        }
    }

    public List<FootballClub> pointSort() {
        Collections.sort(clubs, Comparator.comparingInt(FootballClub::getPoints).reversed());
        return clubs;
    }

    public List<FootballClub> goalDecending() {
        Collections.sort(clubs, Comparator.comparingInt(FootballClub::getGoalScored).reversed());
        return clubs;
    }

    public List<FootballClub> winsDecending() {
        Collections.sort(clubs, Comparator.comparingInt(FootballClub::getWins).reversed());
        return clubs;
    }

    public List<Match> dateSort() {
        Collections.sort(matches, Comparator.comparingInt(Match::getYear));
        return matches;

    }

    public List<FootballClub> randomMatch() {

        LocalDate date = LocalDate.now();
        Dates d1 = new Dates(date.getDayOfMonth(), date.getMonthValue(), date.getYear());

        int team1;
        int team2;

            team1 = (int) (Math.random() * (clubs.size() ));
            team2 = (int) (Math.random() * (clubs.size() ));             //get the index of a random club
            while (true) {
                if (team1 == team2) {
                    team2 = (int) (Math.random() * (clubs.size() ));
                } else {
                    break;
                }
            }

        int goalScored = (int) (Math.random() * 20);
        int goalsReceived = (int) (Math.random() * 20);
        if (goalScored == goalsReceived) {
            clubs.get(team1).setDraws(goalScored);
            clubs.get(team2).setDraws(goalsReceived);

        } else if (goalScored > goalsReceived) {
            clubs.get(team1).setWins(goalScored, goalsReceived);
            clubs.get(team2).setDefeats(goalsReceived, goalScored);
        } else {
            clubs.get(team1).setDefeats(goalScored, goalsReceived);
            clubs.get(team2).setWins(goalsReceived, goalScored);
        }
        Match m1 = new Match(d1.getDate(), d1.getMonth(), d1.getYear(), clubs.get(team1).getClubName(), clubs.get(team2).getClubName(), goalScored, goalsReceived);
        matches.add(m1);
        return clubs;
    }
}