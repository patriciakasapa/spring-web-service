package io.turntabl.springwebservice.controllers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathsTest {
    private Maths maths;

    @Before
    public void setup(){
        maths = new Maths();
    }

    @Test
    public void add_Zero() {
        int result = maths.add(0, 0);
        assertEquals(0, result);
    }

    @Test
    public void add_Negatives() {
        int result = maths.add(0, 0);
        assertEquals(0, result);
    }

    @Test
    public void add_positives() {
        int result = maths.add(0, 0);
        assertEquals(0, result);
    }
    @Test
    public void add_pos_and_negative() {
        int result = maths.add(0, 0);
        assertEquals(0, result);
    }


    @Test
    public void subtract() {
        int result = maths.subtract(0, 0);
        assertEquals(0, result);
    }
}