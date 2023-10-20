package com.example.registrationlogindemo.entity.characters;

//create instances of all playable pokemon here

//

public class Pokemon {
    private Pokemon pikachu;

    public Pokemon(){
        this.pikachu = new Pikachu();
    }

    public Pokemon getPikachu() {
        return pikachu;
    }

    public void setPikachu(Pikachu pikachu) {
        this.pikachu = pikachu;
    }


}
