public class class_06_strings {
    public static void main(String[] args){
        //Different methods of making strings in java
        String name=new String("Aadarsh");
        String age="twenty";
        System.out.println("Name is: "+name);
        System.out.println("Class is: "+age);

        //Using printf like in c
        int a=10;
        float b=2.34f;
        System.out.printf("The value of a is %d and b is %.2f",a,b);

        //Different methods that is used in strings in java
        // 1) length method
        int length_name=name.length();
        System.out.println();
        System.out.println("Length of name is: "+length_name);

        // 2) toLowerCase method
        String lower_case_name=name.toLowerCase();
        System.out.println("Name in lower case is: "+lower_case_name);

        // 3) toUpperCase method
        String upper_case_name=name.toUpperCase();
        System.out.println("Name in upper case is: "+upper_case_name);

        // 4) trim method removes the spaces
        String new_word="      New Word      ";
        String new_word_no_space=new_word.trim();
        System.out.println("This is trim method: "+new_word_no_space);

        // 5) substring() means start with the index and go to last
        System.out.println("Substring: "+name.substring(2));
        //substring(n) -> Starting from index n till last
        //substring(i,j) -> Starting from index i till j-1
        System.out.println("Substring 02: "+name.substring(2,4));

        // 6) replace (a,b) a is replaced with b
        System.out.println("Replaced word: "+name.replace('a','-'));

        // 7) startsWith(), endsWith()
        System.out.println("Starts with A: "+name.startsWith("A"));
        System.out.println("Ends with s: "+name.endsWith("s"));

        // 8) charAt() returns the string at that index
        System.out.println("Character at index 2 is: "+name.charAt(2));

        //9) indexOf() returns the index
        System.out.println("Index of d is: "+name.indexOf('d'));
        //idnexOf("a", 4) will search a from idnex 4
        //If match is not found it will return -1
        System.out.println("Search a from index 2: "+name.indexOf("a",3));

        //10) lastIndexOf("a",4) returns last index of the given string or character starting from index 4
        System.out.println("Last Index of - is "+name.lastIndexOf('a',1));

        //11) equals() compares exact string
        System.out.println("Equals to Aadarsh: "+name.equals("Aadarsh"));

        //12 equalsIgnoreCase("String") compares the string ignoring the case
        System.out.println("Equals ignoring cases with Aadarsh: "+name.equalsIgnoreCase("aadarsh"));

        //13) escapesequence characters can be searched on internet
        System.out.println("This is \" doubel quotation and line changed \n after this \' inveted comma is pritned.");

    }
}
