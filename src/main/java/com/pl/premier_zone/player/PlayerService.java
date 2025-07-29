package com.pl.premier_zone.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
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

    public List<Player> getPlayersByPos(String searchText) {
        return playerRepository.findAll()
            .stream()
            .filter(p -> p.getPos().toLowerCase().contains(searchText.toLowerCase()))
            .collect(Collectors.toList());
    }

    public List<Player> getPlayersByNation(String searchText) {
        return playerRepository.findAll()
            .stream()
            .filter(p -> p.getNation().toLowerCase().contains(searchText.toLowerCase()))
            .collect(Collectors.toList());
    }

    public List<Player> getPlayersByTeamAndPosition(String team, String position) {
        return playerRepository.findAll()
            .stream()
            .filter(p -> team.equals(p.getTeam()) && position.equals(p.getPos()))
            .collect(Collectors.toList());
    }

    public Player addPlayer(Player player) {
        playerRepository.save(player);
        return player;
    }

    public Player updatePlayer(Player player) {
        Optional<Player> existingPlayer = playerRepository.findByName(player.getName());
        if (existingPlayer.isPresent()) {
            Player playerToUpdate = existingPlayer.get();
            playerToUpdate.setName(player.getName());
            playerToUpdate.setNation(player.getNation());
            playerToUpdate.setPos(player.getPos());
            playerToUpdate.setTeam(player.getTeam());

            playerRepository.save(playerToUpdate);
            return playerToUpdate;
        }
        return null;
    }

    @Transactional // Maintains data consistency
    public void deletePlayer(String playerName) {
        playerRepository.deleteByName(playerName);
    }
}
