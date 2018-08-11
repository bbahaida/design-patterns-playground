package com.bahaida.dpplayground.behavioral.strategy;

public class Context {
    protected Strategy strategy;

    public void executeStrategy(){
        strategy.operationStrategy();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
