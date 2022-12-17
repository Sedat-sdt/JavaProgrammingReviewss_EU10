package week05_10_08_2022;

import java.util.Scanner;

public class StringMethods {

    public static void main(String[] args) {

        //if we want to get specific ch. we need to use charAt method
                    //0123
        String str = "Adam";
        //give me the first ch
        System.out.println(str.charAt(0));// first char
        System.out.println(str.charAt(3));//fourth char

        // if we want to get the length of String length()
        System.out.println(str.length());
        //get the last ch
        int lengthOfStr=str.length();
        int indexOfLastCh = lengthOfStr-1;
        System.out.println(str.charAt(indexOfLastCh));

        //in order to make letters lower cwse to Lower Case

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());


        //in order to remove spaces before and after your string trim()
        String str1="    Adam   ";
        System.out.println(str.trim());

        System.out.println(str1);



        //if you want to get index of char or string we need dyo use index() mmethod


        String number = "0123456";
        //to get the index of 3
        System.out.println(number.indexOf('3'));

        //get the index of 34
        System.out.println(number.indexOf("34"));

        String sentence = "Java is a programming language";
        System.out.println(sentence.indexOf("programming"));//10
        System.out.println(sentence.indexOf("programming1"));//-1

        String sentence1= "Java is Java";
        System.out.println(sentence1.indexOf("Java"));//0
        System.out.println(sentence1.lastIndexOf("Java"));//

        //if we want to replace some part of the string we need to use replace or replaceFist

        String sentence3= "Java is a hard prog language";

        System.out.println(sentence3.replace("hard",
                "easy"));
        String sentence4 ="java is not same with java";
        System.out.println(sentence4.replaceFirst("java","c#"));


        //İf we want to get some part of the string we need to use Substring() method

        String subs= "Cydeo";

        System.out.println(subs.substring(1,4));//yde

        //if we want to  multiply(repeat) one word
        // we need to use repeat()

        String str4="Adam";
        System.out.println(str4.repeat(4));

        //if we want to check our string is empty or not
        //we need to use isEmpty() method
        String emptyWord=" ";//false because there is a blank
        System.out.println(emptyWord.isEmpty());

        String blankWord="   ";//true
        System.out.println(blankWord.isBlank());

        //if we want to compare two values with exact matching
        // (lower case or upper case)we can use equals() method
        //equalIgnoreCase()

        String str6="Word";
        String str7="word";

        System.out.println(str6.equals(str7));//false
        System.out.println(str6.equalsIgnoreCase(str7));//true

        //starts with method is using for checking the string is
        //starting with given char sequence or not


        //ends with method is using for checking the string is
        //ending with givenchar sequence or not

        String sentence5= "Java is a good language";
        System.out.println(sentence5.startsWith("Java"));
        System.out.println(sentence5.endsWith("language"));

        //contains method is using for checking the given
        // char sequence is in string or not

        String sentence6="Java is Java";






    }
}
