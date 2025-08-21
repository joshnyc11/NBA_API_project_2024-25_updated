package com.nbaprojectJN.NBA.API.project.Player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<PlayerStats,Integer> {

    //find player stats by their BasketballReference.com player ID, not NBA.com player ID.
    List<PlayerStats> findAllByplayerReference(String playerReference);

}
