package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelconsonantTest
{
    Vowelconsonant obj;

    @Before
    public void setUp() {
        System.out.println("Before");
        obj = new Vowelconsonant();
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
    public void givenStringShouldReturnVowelsandConsonants()
    {
        //Act

        String result = obj.checkVowelorConsonant("sruthi");
        //Assert
        assertEquals("", "consonant consonant vowel consonant consonant vowel", result);


    }
    public void givenStringShouldReturnZeroNumberofVowelsandConsonants() {
        //Act

        String result = obj.checkVowelorConsonant("");
        //Assert
        assertEquals("No input given", "", result);
    }
    public void givenLetterShouldReturnVowel() {
        //Act

        String result = obj.checkVowelorConsonant("a");
        //Assert
        assertEquals("", "vowel", result);
    }
    public void givenLetterShouldReturnConsonant() {
        //Act

        String result = obj.checkVowelorConsonant("b");
        //Assert
        assertEquals("", "consonant", result);
    }




}