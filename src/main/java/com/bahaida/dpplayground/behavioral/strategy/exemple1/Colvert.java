package com.bahaida.dpplayground.behavioral.strategy.exemple1;

public class Colvert extends Canard {

    public Colvert() {
        comportementVol = new VolerAvecDesAiles();
        comportementCancan = new Cancan();
    }

    @Override
    public String afficher() {
        return "Je suis un vrai colvert";
    }


}
