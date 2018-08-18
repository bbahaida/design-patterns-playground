package com.bahaida.dpplayground.behavioral.decorator.example1;

public abstract class DecorateurIngredient extends Boisson {
    private Boisson boisson;

    public Boisson getBoisson() {
        return boisson;
    }

    public void setBoisson(Boisson boisson) {
        this.boisson = boisson;
    }

    @Override
    public abstract String getDescription();

}
