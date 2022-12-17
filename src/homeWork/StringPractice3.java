package homeWork;

import java.util.Scanner;

public class StringPractice3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter first word");
        String firstword =scan.nextLine();

        System.out.println("Enter second word");
        String secondword =scan.nextLine();

        System.out.println("Enter third word");
        String thirdword =scan.nextLine();

            String result="";

        if(firstword.length()==secondword.length() && firstword.length()==thirdword.length()){

            result= "All words are same length";

        } else if (firstword.length()==secondword.length()) {

            result= "Not Same nor Different lengths";

        } else if (firstword.length()==thirdword.length()) {

            result= "Not Same nor Different lengths";

        }else if (secondword.length()==thirdword.length()) {

            result= "Not Same nor Different lengths";

        }else {
            result = "All different length";
        }
        System.out.println(result);
/*
        int length1=firstword.length(),
            length2=secondword.length(),
            length3=thirdword.length();

        boolean same=length1==length2 &&length1==length3;
        boolean notSame=(length1==length2 && length1!=length3)
                     || (length1!=length2 && length1==length3)
                     || (length2==length3 && length2!=length1);
        boolean allDifferent = length1!=length2 && length1!=length3;

        if(same){
            System.out.println("All words are same length");
        }if(notSame){
            System.out.println("Not Same nor Different lengths");
        }if(allDifferent){
            System.out.println("All different length");
        }*/


 /*

  Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
  */
    }
}
