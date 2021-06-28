package com.company;

import java.security.spec.RSAOtherPrimeInfo;

public class class_29_regex_pattern_matching {
    public static void main(String[] args){
        //I have to extract companies name from this data.
        String data="Apple Microsoft IMB Facebook";
        String[] company=data.split(" "); //This will split data into list where space is there.
        for (String str: company){
            System.out.println(str);
        }

        //Suppose we have multiple spaces in the middle
        String data2="Apple   Microsoft        IMB          Facebook";
        String[] company2=data.split("\\s+"); // + means that there can be multiple spaces
        for (String str: company2){
            System.out.println(str);
        }

        //Suppose we have . in the data
        String data3="Apple.Microsoft.IMB.Facebook";
        String[] company3=data.split("\\."); //This will split data into list where space is there.
        //if we keep data.split("\\.+") there could be multiple dots (...)
        for (String str: company3){
            System.out.println(str);
        }

        //Extract only numbers from data
        String data4="Apple123Microsoft456Facebook789";
        System.out.println(data4.replaceAll("[a-zA-Z]+", "")); //data.replace is used to repalace only one
        System.out.println(data4.replaceAll("[^0-9]+", "")); // ^ represents not and + represents that there can be multiple

        //Extract all the alphabets from string
        String data5="Apple123Microsoft456Facebook789";
        System.out.println(data5.replaceAll("[0-9]+", "")); //data.replace is used to repalace only one
        System.out.println(data5.replaceAll("[^a-zA-Z]+", ""));

        //Check if the string has only numbers
        String data6="12345";
        String regex="[0-9]+";
        //System.out.println(data6.matches("[0-9]+"));
        System.out.println(data6.matches(regex));

        //Check if the string has only alphabets
        String data7="adfbsdf";
        String regex2="[a-zA-Z]+";
        System.out.println(data7.matches(regex2));
        System.out.println(data7.matches("[a-zA-Z]+"));

        //Check if the strings has alphabets and numbers only not symbols
        String data8="adfbsdf32234";
        String regex3="[a-zA-Z0-9]+";
        System.out.println(data8.matches(regex3));
        System.out.println(data8.matches("[a-zA-Z0-9]+"));


    }
}
