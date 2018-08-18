package com.bahaida.dpplayground.behavioral.decorator.example1;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecoratorTest {

    @Test
    public void testBoissonCout(){
        // arrange
        Boisson boisson = new Chantilly(new Chocolat(new Sumatra()));
        float expected = 1.29f;
        // act
        float actual = boisson.cout();
        // assert

        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testBoissonDesc(){
        // arrange
        Boisson boisson = new Chantilly(new Chocolat(new Sumatra()));
        String expected = "Sumatra, Chocolat, Chantilly";
        // act
        String actual = boisson.getDescription();
        // assert

        assertEquals(expected, actual);
    }



}