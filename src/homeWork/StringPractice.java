package homeWork;

import java.util.Scanner;

public class StringPractice {

    public static void main(String[] args) {

  Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string");
        String str= scan.nextLine();
scan.close();
        if(str.length()==0){
            System.out.println("String is empty");
        }else if(str.length()>0 && str.length()<=3 ) {
            System.out.println(str);
        }else{
            System.out.println(""+(str.charAt(str.length()-3))
                                 +(str.charAt(str.length()-2))
                                 +(str.charAt(str.length()-1)));


           /* System.out.print(str.charAt(str.length()-3));
            System.out.print(str.charAt(str.length()-2));
            System.out.print(str.charAt(str.length()-1));*/
        }






//--------------------------------------------
/*
Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
 */
        /*Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word");
        String first= scan.nextLine();

        System.out.println("Enter second word");
        String second= scan.nextLine();

        first=first.toUpperCase();
        System.out.println();

        second= second.toUpperCase();
        System.out.println(first.charAt(0)+"."+second.charAt(0));*/




/*
write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output
 */




//----------------------------------------------------------
/*
Scanner scan =new Scanner(System.in);
        System.out.println("Enter a string");
        String str=scan.nextLine();
        if(str.charAt(0)==(str.charAt(str.length()-1)));
        System.out.println("first and last char are same");
*/



        /*
        write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
         */

        //System.out.println("--------------------------------------------");
        /*

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first string");
        String first = scan.nextLine();
        System.out.println("Enter second string");
        String second = scan.nextLine();
        if(first.length()>second.length()){
            System.out.println(first);
        }else{
            System.out.println(second);
        }*/





        /*
        write a program that asks user to enter two strings, and print out the longest string
         */

        //-------------------------------------------------------------
      /*
        System.out.println("Enter a sentence");
        String sentence = scan.nextLine();
        char firstchar = sentence.charAt(0);
        char lastchar = sentence.charAt(sentence.length()-1);
        System.out.println("firstchar = " + firstchar);
        System.out.println("lastchar = " + lastchar);*/
  /*
  write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence

   */

    }
}
