package com.stackroute.junitdemo;

public class CheckInputNumber {
    public String checkInput(int number)
    {
        if((number>=20 )&& (number<=30)) //checks the inpt range and prints the result
        {
            if(number%2==0)
            {
                return "Jerry";
            }
            else
            {
                return "Tom";
            }
        }
        else
        {
            return "error";
        }
    }
}
