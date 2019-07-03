package com.stackroute.junitdemo;

public class Characterrepeat {

    public String charRepeatInTheString (String str,int n) {
        int i;

        String str1 = str.substring(str.length() - n);//finds the substring that must be repeated n number of times

        for (i = 0; i < n; i++)
        {
            str += str1;
        }
        return str;


    }
}
