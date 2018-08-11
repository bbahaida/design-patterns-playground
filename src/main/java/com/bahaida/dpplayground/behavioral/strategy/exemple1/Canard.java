package com.bahaida.dpplayground.behavioral.strategy.exemple1;

public abstract class Canard {
    protected ComportementVol comportementVol;
    protected ComportementCancan comportementCancan;

    public abstract String afficher();

    public String effectuerVol(){
        return comportementVol.voler();
    }

    public String effectuerCancan(){
        return comportementCancan.cancaner();
    }

    public String nager(){
        return "Tous les canards flottent, meme les leurres";
    }

    public void setComportementCancan(ComportementCancan comportementCancan) {
        this.comportementCancan = comportementCancan;
    }

    public void setComportementVol(ComportementVol comportementVol) {
        this.comportementVol = comportementVol;
    }
}
