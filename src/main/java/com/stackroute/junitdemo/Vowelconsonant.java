package com.stackroute.junitdemo;

public class Vowelconsonant
{
    public String checkVowelorConsonant(String letter)
    {
        int i;

        String str="";

        for(i=0;i<letter.length();i++)
        {
            char c= letter.charAt(i);
            if(c=='a' || c=='e'||c=='i' ||c=='o'||c=='u' ||
                    c=='A' || c=='E' || c=='I' || c=='O' || c=='U') //checks if vowels are present
            {
                 str= str+"vowel"+" ";

            }
            else
            {
                str=str+"consonant"+" ";

            }


        }
       return str.trim();
    }


}
