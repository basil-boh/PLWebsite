package com.pl.premier_zone.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component // Marks a Java class as a component
public class PlayerService {
    private final PlayerRepository playerRepository;

    @Autowired // Handles dependency injection
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getPlayers() {
        return playerRepository.findAll();
    }

    public List<Player> getPlayersFromTeam(String teamName) {
        return playerRepository.findAll()
            .stream()
            .filter(p -> p.getTeam().equals(teamName))
            .collect(Collectors.toList());
    }

    public List<Player> getPlayersByName(String searchText) {
        return playerRepository.findAll()
            .stream()
            .filter(p -> p.getName().toLowerCase().contains(searchText.toLowerCase()))
            .collect(Collectors.toList());
    }
}
