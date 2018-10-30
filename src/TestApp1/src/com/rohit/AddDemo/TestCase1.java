package com.rohit.AddDemo;

import org.junit.*;
import static org.junit.Assert.*;



public class TestCase1 {

    @Test
    public void  testEquals1(){
        // test Equals
        assertEquals(12,13);

    }
    @Test
    public void  testEquals2(){
        assertEquals(13,13);
    }

    @Test
    public void  testEquals3(){
        assertEquals(12.20,12.30, 0.11);
    }
}
