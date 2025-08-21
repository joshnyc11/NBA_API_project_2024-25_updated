package com.nbaprojectJN.NBA.API.project.Player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/players")
public class PlayerStatsController {


private final PlayerPerGameService playerPerGameService;

   @Autowired
    public PlayerStatsController(PlayerPerGameService playerPerGameService) {
        this.playerPerGameService = playerPerGameService;
    }
//gets all players and returns paginated list
    @GetMapping
    public Page<PlayerStats> getAllPlayers(
            @PageableDefault(size = 10) Pageable pageable
    ) {
        return playerPerGameService.getAll(pageable);
    }
//this is new, and is functional as of writing this
    //gets players by id
    @GetMapping("/{id}")
    public ResponseEntity<PlayerStats> getPlayerById(@PathVariable Integer id) {
        PlayerStats player = playerPerGameService.getPlayerById(id);
        return ResponseEntity.ok(player);
    }

    //this works, but redo this for player and season
    @GetMapping("/pRef/{playerReference}")
    public ResponseEntity<?> getPlayer(@PathVariable String playerReference) {
        List<PlayerStats> stats = playerPerGameService.getStatsByPlayerReference(playerReference);
        if (stats.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(stats);
    }


}
