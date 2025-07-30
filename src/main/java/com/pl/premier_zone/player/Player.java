package com.pl.premier_zone.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Entity represents the data model in the application
// Maps directly to database tables -> player_statistic table
@Entity
@Table(name="player_statistic")
public class Player {

    // Primary key is name -> Disclaimer this specific case works because
    // there are no duplicate names in csv file
    @Id
    @Column(name = "player_name", unique = true) // Tells SpringBoot where to find in postgres DB
    private String name;

    private String nation;

    private String position;

    private Integer age;

    // Matches Played
    private Integer matches_played;

    // Number of matches the player was in the starting lineup
    private Integer starts;

    // Total minutes played
    private Double minutes_played;

    private Double goals;

    private Double assists;

    private Double penalties_scored;

    // Total yellow cards
    private Double yellow_cards;

    // Total red cards
    private Double red_cards;

    // Expected Goals
    private Double expected_goals;

    // Expected Assists
    private Double expected_assists;

    private String team_name;

    // Default Constructor
    public Player() {
    }

    // Parameterized Constructor
    public Player(String name, String nation, String position, Integer age, Integer matches_played, Integer starts, Double minutes_played, Double goals, Double assists, Double penalties_scored, Double yellow_cards, Double red_cards, Double expected_goals, Double expected_assists, String team_name) {
        this.name = name;
        this.nation = nation;
        this.position = position;
        this.age = age;
        this.matches_played = matches_played;
        this.starts = starts;
        this.minutes_played = minutes_played;
        this.goals = goals;
        this.assists = assists;
        this.penalties_scored = penalties_scored;
        this.yellow_cards = yellow_cards;
        this.red_cards = red_cards;
        this.expected_goals = expected_goals;
        this.expected_assists = expected_assists;
        this.team_name = team_name;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getNation() {
        return nation;
    }

    public String getPosition() {
        return position;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getMatches_played() {
        return matches_played;
    }

    public Integer getStarts() {
        return starts;
    }

    public Double getMinutes_played() {
        return minutes_played;
    }

    public Double getGoals() {
        return goals;
    }

    public Double getAssists() {
        return assists;
    }

    public Double getPenalties_scored() {
        return penalties_scored;
    }

    public Double getYellow_cards() {
        return yellow_cards;
    }

    public Double getRed_cards() {
        return red_cards;
    }

    public Double getExpected_goals() {
        return expected_goals;
    }

    public Double getExpected_assists() {
        return expected_assists;
    }

    public String getTeam_name() {
        return team_name;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setMatches_played(Integer mp) {
        this.matches_played = mp;
    }

    public void setStarts(Integer starts) {
        this.starts = starts;
    }

    public void setMinutes_played(Double min) {
        this.minutes_played = min;
    }

    public void setGoals(Double goals) {
        this.goals = goals;
    }

    public void setAssists(Double asts) {
        this.assists = asts;
    }

    public void setPenalties_scored(Double pk) {
        this.penalties_scored = pk;
    }

    public void setYellow_cards(Double yellow_cards) {
        this.yellow_cards = yellow_cards;
    }

    public void setRed_cards(Double red_cards) {
        this.red_cards = red_cards;
    }

    public void setExpected_goals(Double expected_goals) {
        this.expected_goals = expected_goals;
    }

    public void setExpected_assists(Double expected_assists) {
        this.expected_assists = expected_assists;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }
}
