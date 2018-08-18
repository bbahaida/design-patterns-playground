package com.bahaida.dpplayground.behavioral.decorator.example1;

public class Chantilly extends DecorateurIngredient {

    public Chantilly(Boisson boisson) {
        setBoisson(boisson);
    }

    @Override
    public String getDescription() {
        return getBoisson().getDescription()+", Chantilly";
    }

    @Override
    public float cout() {
        return 0.10f + getBoisson().cout();
    }
}
