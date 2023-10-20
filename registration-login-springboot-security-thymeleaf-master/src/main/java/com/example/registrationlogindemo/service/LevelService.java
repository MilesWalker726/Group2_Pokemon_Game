package com.example.registrationlogindemo.service;

import com.example.registrationlogindemo.entity.Player;
import com.example.registrationlogindemo.entity.characters.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LevelService {
    //create new player with username and chosen character
    @Autowired
    private PlayerService ps = new PlayerService();

    public Player startGame(String username, Pokemon pokemon) {
        return ps.createPlayer(username, pokemon);
    }

    public boolean checkOpponentHP () {
        return true;
    }



}
