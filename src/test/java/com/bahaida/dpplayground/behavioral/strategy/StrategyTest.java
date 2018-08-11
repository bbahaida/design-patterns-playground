package com.bahaida.dpplayground.behavioral.strategy;

import com.bahaida.dpplayground.behavioral.strategy.exemple1.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class StrategyTest {

    @Test
    public void assertThatColvertVolAndCancan(){
        // arrange
        Canard colvert = new Colvert();
        String volExpected = "Je vole !!";
        String cancanExpected = "CanCan";
        // act
        String volActual = colvert.effectuerVol();
        String cancanActual = colvert.effectuerCancan();
        // assert
        assertEquals(volExpected,volActual);
        assertEquals(cancanExpected,cancanActual);

    }

    @Test
    public void assertThatPrototypeCanard(){
        // arrange
        Canard prototype = new PrototypeCanard();
        String volExpected = "Je ne sais pas voler";
        String cancanExpected = "CanCan";
        // act
        String volActual = prototype.effectuerVol();
        String cancanActual = prototype.effectuerCancan();
        // assert
        assertEquals(volExpected,volActual);
        assertEquals(cancanExpected,cancanActual);

    }

    @Test
    public void assertThatPrototypeCanardVol(){
        // arrange
        Canard prototype = new PrototypeCanard();
        prototype.setComportementVol(new PropulsionAReaction());
        prototype.setComportementCancan(new Coincoin());
        String volExpected = "Je vole avec un reacteur!";
        String cancanExpected = "Coincoin";
        // act
        String volActual = prototype.effectuerVol();
        String cancanActual = prototype.effectuerCancan();
        // assert
        assertEquals(volExpected,volActual);
        assertEquals(cancanExpected,cancanActual);

    }

}