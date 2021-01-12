package com.company;

public class class_06_strings {
    public static void main (String[] args){
        //Declear a string
        String name="Aadarsh";
        System.out.println(name);
        //Find the length of existing string
        /*
        * string.length()
        * string.toUpperCase()
        * string.toLowerCase()
        * string.trim() --> Removes spaces the string
        * string.substring(n) --> returns the character from nth place till end
        * string.substring(start_index, end_index) --> includes start_index but excludes end_index
        * string.replace('a','b') --> will replace a with p and return a new string
        * string.replace("aad","hello") --> will replace aad with hello
        * string.startsWith("Aad") --> will return true if string starts with aad
        * string.endsWith("sh") --> will return true if string ends with sh
        * string.charAt(3) --> Returns character at index 3
        * string.indexOf('A') --> Returns first index of 'A' -- And will return -1 if substring is not present
        * string.indexOf("rsh") --> Returns the index of rsh -- And will return -1 if substring is not present
        * string.lastIndexOf("rsh") --> Will start searching from last -- will return -1 if string is not present
        * string.lastIndexOf("rsh", 4) --> Will search in front from index 4..... if get confused watch this video: https://www.youtube.com/watch?v=1SJK4Y4axXs&list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q&index=14 from 28:00
        * string.IndexOf("rsh", 3) --> Will search in last from index 3
        * string.equals("Aadarsh") --> will return true if string is equal to "Aadarsh"
        * string.equalsIgnoreCase("Aadarsh") --> This will ignore case and then compare
        * \ is escapre sequence character
        * Character.getNumericValue('s') --> get nueric value of char as int eg. '5' as 5
        * Integer.parseInt("string") --> will convert string to integer if it is convertable
        * Double.parseDouble("String")
        * Float.parseFloat("string")
        *
        * */
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        String nonTrimString="    aadarsh         ";
        String trimString=nonTrimString.trim();
        System.out.println(trimString);

        System.out.println(name.substring(3));
        System.out.println(name.substring(2,4));
        System.out.println(name.replace('a', '-'));
        System.out.println(name.replace("aad","hello"));
        System.out.println(name.startsWith("Aad"));
        System.out.println(name.endsWith("sh"));
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf('a'));

    }
}
