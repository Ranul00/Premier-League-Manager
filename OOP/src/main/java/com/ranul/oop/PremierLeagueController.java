package com.ranul.oop;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin 

public class PremierLeagueController {

    PremierLeagueManager p1 = new PremierLeagueManager();

    @GetMapping("/pointSort")
    public List<FootballClub> pointSort(){
        return p1.pointSort();
    }

    @GetMapping("/goalsDecending")
    public List<FootballClub> goalDecending(){
        return p1.goalDecending();
    }

    @GetMapping("/winsDecending")
    public  List<FootballClub> winsDecending(){
        return p1.winsDecending();
    }

    @GetMapping("/dateSort")
    public List<Match> dateSort(){
        return p1.dateSort();
    }

    @GetMapping("/randomMatch")
    public List<FootballClub> randomMatch(){
        return p1.randomMatch();
    }
}
