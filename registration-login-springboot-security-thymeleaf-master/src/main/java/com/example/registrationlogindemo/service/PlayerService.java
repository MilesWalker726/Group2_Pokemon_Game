package com.example.registrationlogindemo.service;
import com.example.registrationlogindemo.entity.Player;
import com.example.registrationlogindemo.entity.characters.Pokemon;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    //create new player
    public Player createPlayer(String username, Pokemon pokemon){
        Player player = new Player(username, pokemon);
        return player;
    }

    //check player current level
    public int getPlayerLevel(Player player) {
        return player.getLevel();
    }

    //update player level
    public void updateLevel (Player player) {
        player.setLevel(player.level + 1);
    }

    //get players HP
    public int getPlayerHP(Player player) {
        return player.getHP();
    }

    //get players choosen pokemon

    //lower players HP

}
