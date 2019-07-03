package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterrepeatTest {
    Characterrepeat obj;

    @Before
    public void setUp() {
        System.out.println("Before");
        obj = new Characterrepeat();
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
    public void givenCharacterShouldReturnLastThreeCharacterRepetition() {
        //Act

        String result = obj.charRepeatInTheString("bhanu",3);
        //Assert
        assertEquals("testcase passed", "bhanuanuanuanu", result);

    }

    public void givenCharacterShouldReturnNull()
        {
        //Act

        String result = obj.charRepeatInTheString("",4);
        //Assert
        assertEquals("Index out of bound exception", "null", result);

    }
    public void givenCharacterShouldReturnEmptyStringAsNoInputGiven()
    {
        //Act

        String result = obj.charRepeatInTheString("",0);
        //Assert
        assertEquals("No input given", "null", result);

    }


}