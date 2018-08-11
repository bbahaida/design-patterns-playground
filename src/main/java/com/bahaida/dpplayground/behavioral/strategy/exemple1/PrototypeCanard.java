package com.bahaida.dpplayground.behavioral.strategy.exemple1;

public class PrototypeCanard extends Canard {
    public PrototypeCanard() {
        comportementCancan = new Cancan();
        comportementVol = new NePasVoler();
    }

    @Override
    public String afficher() {
        return null;
    }
}
