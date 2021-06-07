package com.ranul.oop;

import java.io.IOException;

public interface LeagueManager {
    void addClub();
    void deleteClub();
    void  viewStats();
    void viewTable();
    void addPlayedMatch();
    void save();
    void load() throws IOException;
}
