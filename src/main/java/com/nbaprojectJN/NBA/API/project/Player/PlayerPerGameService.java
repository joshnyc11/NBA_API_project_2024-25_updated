package com.nbaprojectJN.NBA.API.project.Player;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerPerGameService {

    private final PlayerRepository playerRepository;


    public PlayerPerGameService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }


    public PlayerStats getPlayerById(Integer id){

        return playerRepository.findById(id).orElseThrow(() -> new RuntimeException("Player not found with id: " + id));
    }

    //8/17 new
    public List<PlayerStats> getStatsByPlayerReference(String playerReference){
      return playerRepository.findAllByplayerReference(playerReference);
    }


    //returns all players
    public Page<PlayerStats> getAll(Pageable pageable){
        return playerRepository.findAll(pageable);
    }


}
