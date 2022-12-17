package week05_10_08_2022;

import java.util.Scanner;

public class GetFirst2UpperCase {

    public static void main(String[] args) {


        System.out.println("enter your String");
        Scanner scan = new Scanner (System.in);
        //String word= "Hello";
        String word = scan.next();
        String result=""+word.charAt(0)+word.charAt(1);
        // we must double qoute left side to become result to String.It is important.
        String result2=word.charAt(0)+""+word.charAt(1);//also it can be like this
        System.out.println(result.toUpperCase());
        System.out.println(result2.toUpperCase());
        //String result=word.charAt(0)+word.charAt(1)+"";It can NOT be like this


 /* Task 1: Given a string,
       print the string made of its first two chars,
       so the String "Hello" yields “HE".*/






    }
}
