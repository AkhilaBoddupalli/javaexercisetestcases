package com.stackroute.junitdemo;

import java.util.Scanner;
public class CharacterInput
{

    public String characterCheck(char ch)
    {
        //checks for the entered input based on the range and prints accordingly
        if((ch>=65)&&(ch<=90)) {
            return "The entered input is a capital letter";

        }
        else if((ch>=97)&& (ch<=122)) {
            return "The entered input is a small letter";

        }
        else if((ch>=48)&&(ch<=57))
        {
            return "The entered input is a digits";
        }
        else
            {

            return "The entered input is a special character";
        }

    }
}


