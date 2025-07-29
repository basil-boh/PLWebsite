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
    @Column(name = "name", unique = true) // Tells SpringBoot where to find in postgres DB
    private String name;

    private String nation;

    private String pos;

    private Integer age;

    // Matches Played
    private Integer mp;

    // Number of matches the player was in the starting lineup
    private Integer starts;

    // Total minutes played
    private Double min;

    private Double gls;

    private Double asts;

    private Double pk;

    // Total yellow cards
    private Double crdy;

    // Total red cards
    private Double crdr;

    // Expected Goals
    private Double xg;

    // Expected Assists
    private Double xag;

    private String team;

    // Default Constructor
    public Player() {
    }

    // Parameterized Constructor
    public Player(String name, String nation, String pos, Integer age, Integer mp, Integer starts, Double min, Double gls, Double asts, Double pk, Double crdy, Double crdr, Double xg, Double xag, String team) {
        this.name = name;
        this.nation = nation;
        this.pos = pos;
        this.age = age;
        this.mp = mp;
        this.starts = starts;
        this.min = min;
        this.gls = gls;
        this.asts = asts;
        this.pk = pk;
        this.crdy = crdy;
        this.crdr = crdr;
        this.xg = xg;
        this.xag = xag;
        this.team = team;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getNation() {
        return nation;
    }

    public String getPos() {
        return pos;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getMp() {
        return mp;
    }

    public Integer getStarts() {
        return starts;
    }

    public Double getMin() {
        return min;
    }

    public Double getGls() {
        return gls;
    }

    public Double getAsts() {
        return asts;
    }

    public Double getPk() {
        return pk;
    }

    public Double getCrdy() {
        return crdy;
    }

    public Double getCrdr() {
        return crdr;
    }

    public Double getXg() {
        return xg;
    }

    public Double getXag() {
        return xag;
    }

    public String getTeam() {
        return team;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setMp(Integer mp) {
        this.mp = mp;
    }

    public void setStarts(Integer starts) {
        this.starts = starts;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public void setGls(Double gls) {
        this.gls = gls;
    }

    public void setAsts(Double asts) {
        this.asts = asts;
    }

    public void setPk(Double pk) {
        this.pk = pk;
    }

    public void setCrdy(Double crdy) {
        this.crdy = crdy;
    }

    public void setCrdr(Double crdr) {
        this.crdr = crdr;
    }

    public void setXg(Double xg) {
        this.xg = xg;
    }

    public void setXag(Double xag) {
        this.xag = xag;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
