package com.basics.algorithm.archana.leetcodesolutions.StringsEasy;


public class StringNotes {

    public void Notes(String s) {


        /*character Array*/
        char[] charArray = s.toCharArray();
        //index in string or character array
        int index = 0;


        /*------Replace a character at a specific index in a string?---------*/

        /*String are immutable in Java. You can't change them.
        You need to create a new string with the character replaced.*/
        String myName = "domanokz";
        String newName = myName.substring(0, 4) + 'x' + myName.substring(5);

        /*Or you can use a StringBuilder:*/
        StringBuilder sb = new StringBuilder("domanokz");
        sb.setCharAt(4, 'x');
        System.out.println(myName);



        /*------What is the best way to tell if a character is a letter or number in Java without using regexes?----*/

        Character.isDigit(s.charAt(index));// (JavaDoc) will return true if it's a digit
        Character.isLetter(s.charAt(index));// (JavaDoc) will return true if it's a letter


    }

     /*------Swapping Characters of a String in Java----------*/
        /*Method 1 (Using toCharArray)*/
        static void swap(String s,int i,int j){
            char ch[] = s.toCharArray();
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }
        /*Method 3 (Using StringBuilder or StringBuffer)*/
        static void swapUsingStringBuilder(String s, int i , int j){
            StringBuilder builder = new StringBuilder(s);
            builder.setCharAt(i,s.charAt(j));
            builder.setCharAt(j,s.charAt(i));
        }
}
