
package com.ranul.oop;

import com.ranul.CwokApplication;
import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;

import java.io.IOException;
import java.util.Scanner;

public class Main extends Application {
    private static LeagueManager manager = new PremierLeagueManager();

   public static void main(String[]args) throws IOException {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        //SpringApplication.run(CwokApplication.class);
        manager.load();

        menu:
        while(true) {
            System.out.println("Enter \"A\" to create a football club");
            System.out.println("Enter \"D\" to delete a football club");
            System.out.println("Enter \"C\" to display club stats");
            System.out.println("Enter \"T\" to display league table");
            System.out.println("Enter \"P\" to add played match");
            System.out.println("Enter \"G\" to open GUI");
            System.out.println("Enter \"S\" to save");
            System.out.println("Enter \"Q\" to quit");
            Scanner sc = new Scanner(System.in);
            String option = sc.next().toLowerCase();;
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
                case "g":
                    //manager.gui(s1 , s2);
                    break;
                case "q":
                    break menu;
            }
        }
    }



}
