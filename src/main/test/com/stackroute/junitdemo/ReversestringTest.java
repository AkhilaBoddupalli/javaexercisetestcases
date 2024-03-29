package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReversestringTest {
    Reversestring obj;
    @Before
    public void setUp() {
        System.out.println("Before");
        obj = new Reversestring();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        obj = null;
    }

    @Before
    public void setUpBeforeClass() {
        System.out.println("BeforeClass");

    }

    @After
    public void tearDownAfterClass() {
        System.out.println("AfterClass");

    }
    @Test
    public void givenStringShouldReturnReverseofAString()
    {

        String result = obj.reverseOfAString("akhila");
        //Assert
        assertEquals("","alihka",result);


    }
    @Test
    public void givenStringShouldReturnStringWithExtraSpace()
    {
        //Act
        Reversestring reverseobj=new Reversestring();
        String result =obj.reverseOfAString("bhanu");
        //Assert
        assertEquals("Test failed due to extra space","unahb ",result);


    }
    @Test
    public void givenStringShouldReturnStringWhichIsIncorrect()
    {
        //Act

        String result = obj.reverseOfAString("bhanu");
        //Assert
        assertEquals("Test failed due to improper reverse","unah",result);


    }


}