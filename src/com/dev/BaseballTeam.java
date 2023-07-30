package com.dev;

import java.util.ArrayList;
import java.util.List;

public class BaseballTeam {
    private String teamName;
    private List<Main.BaseballPlayer> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;

    public BaseballTeam(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMember(Main.BaseballPlayer player) {
        if (!teamMembers.contains(player)) {
            teamMembers.add(player);
        }

    }

    public void listTeamMembers() {
        System.out.println(teamName + " Roster");
        System.out.println(teamMembers);
    }

    public int ranking() {
        return (totalLosses * 2) + totalTies + 1;
    }

    public String setScore (int ourScore, int theirScore) {
        String message = "lost to ";
        if(ourScore>theirScore) {
            totalWins++;
            message= "beat";
        }
        return message;
    }
}
