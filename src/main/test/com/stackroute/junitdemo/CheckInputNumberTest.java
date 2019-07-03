package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckInputNumberTest {

    CheckInputNumber obj;

    @Before
    public void setUp() {
        System.out.println("Before");
        obj = new CheckInputNumber();
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
    public void givenNumberShouldReturnTom() {
        //Act

        String result = obj.checkInput(23);
        //Assert
        assertEquals("", "Tom", result);


    }
    @Test
    public void givenNumberShouldReturnJerry() {
        //Act
        CheckInputNumber tomobj = new CheckInputNumber();
        String result = obj.checkInput(22);
        //Assert
        assertEquals("", "Jerry", result);

    }
    @Test
    public void givenNumberShouldReturnErrror() {
        //Act
        CheckInputNumber tomobj = new CheckInputNumber();
        String result = tomobj.checkInput(32);
        //Assert
        assertEquals("", "error", result);


    }
    @Test
    public void givenNegativeNumberShouldReturnErrror() {
        //Act
        CheckInputNumber tomobj = new CheckInputNumber();
        String result = tomobj.checkInput(-32);
        //Assert
        assertEquals("", "error", result);


    }

}