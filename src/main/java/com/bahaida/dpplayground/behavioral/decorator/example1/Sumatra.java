package com.bahaida.dpplayground.behavioral.decorator.example1;

public class Sumatra extends Boisson {
    public Sumatra() {
        setDescription("Sumatra");
    }

    @Override
    public float cout() {
        return 0.99f;
    }
}
