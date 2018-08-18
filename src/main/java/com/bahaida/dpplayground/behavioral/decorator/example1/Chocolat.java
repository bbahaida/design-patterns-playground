package com.bahaida.dpplayground.behavioral.decorator.example1;

public class Chocolat extends DecorateurIngredient {
    public Chocolat(Boisson boisson) {
        setBoisson(boisson);
    }

    @Override
    public String getDescription() {
        return getBoisson().getDescription()+", Chocolat";
    }

    @Override
    public float cout() {
        return 0.20f + getBoisson().cout();
    }
}
