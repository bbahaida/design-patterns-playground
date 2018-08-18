package com.bahaida.dpplayground.behavioral.decorator.example1;

public class Espresso extends Boisson {
    public Espresso() {
        setDescription("Sumatra");
    }

    @Override
    public float cout() {
        return 1.99f;
    }
}
