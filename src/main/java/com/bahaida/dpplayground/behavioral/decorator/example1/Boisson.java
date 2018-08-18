package com.bahaida.dpplayground.behavioral.decorator.example1;

public abstract class Boisson {
    private String description;
    public abstract float cout();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
