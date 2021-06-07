package com.ranul;

import com.ranul.oop.LeagueManager;
import com.ranul.oop.PremierLeagueManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.util.Scanner;

@SpringBootApplication
@RestController
public class  CwokApplication {
    private static LeagueManager manager = new PremierLeagueManager();

    public static void main(String[] args) throws IOException {

        SpringApplication.run(CwokApplication.class);
        manager.load();

        menu:
        while(true) {
            System.out.println("Enter \"A\" to create a football club");
            System.out.println("Enter \"D\" to delete a football club");
            System.out.println("Enter \"C\" to display club stats");
            System.out.println("Enter \"T\" to display league table");
            System.out.println("Enter \"P\" to add played match");
            System.out.println("Enter \"S\" to save");
            System.out.println("Enter \"Q\" to quit");
            Scanner sc = new Scanner(System.in);
            String option = sc.next().toLowerCase();
            switch (option) {
                case "a":
                    manager.addClub();
                    break;
                case "d":
                    manager.deleteClub();
                    break;
                case "c":
                    manager.viewStats();
                    break;
                case "t":
                    manager.viewTable();
                    break;
                case "p":
                    manager.addPlayedMatch();
                    break;
                case "s":
                    manager.save();
                    break;
                case "q":
                    break menu;
                default:
                    System.out.println("invalid input! re enter");
            }
        }
    }
}
