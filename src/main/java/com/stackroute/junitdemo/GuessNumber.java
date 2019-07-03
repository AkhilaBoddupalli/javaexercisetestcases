package com.stackroute.junitdemo;

public class GuessNumber {
    public String guessInputnumberWithTarget(int n)

    {
        int target=25; //guess the target number
        if(n<target)
        {
            return "Number guessed is less than the original number";
        }
        else if(n>target)
        {
            return "Number guessed is more than the target";
        }
        else if(n<0)
        {
            return "Entered number is negative";
        }
        else {
            return "entered number matches the target number";
        }

    }
}

