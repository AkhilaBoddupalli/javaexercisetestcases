package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TotalofinputTest {
    Totalofinput obj;

    @Before
    public void setUp() {
        System.out.println("Before");
        obj = new Totalofinput();
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
    public void givenNumberShouldReturnSumofNumbers()
    {
        //Act

        int result = obj.calculateInputSum(new int[]{1,2,3,4,6});
        //Assert
        assertEquals("", 16, result);


    }


}