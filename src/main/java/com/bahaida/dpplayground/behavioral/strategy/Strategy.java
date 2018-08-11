package com.bahaida.dpplayground.behavioral.strategy;

public interface Strategy {
    default void operationStrategy(){
        System.out.println("default strategy");
    }
}
