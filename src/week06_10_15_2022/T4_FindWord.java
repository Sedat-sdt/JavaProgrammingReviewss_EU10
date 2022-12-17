package week06_10_15_2022;

import java.util.Locale;

public class T4_FindWord {
    public static void main(String[] args) {
        /*
        Task 4: Given a sentence which is string find word how many times repeats in it.

Hint: use replaceFirst() with while loop

input:
*                                String str="Java is java in everywhere is Java";
*                                String word="Java";
output:3
         */
    String str= "Java is java in everywhere is Java";
    String word="Java";
    int count=0;
    str=str.toLowerCase();
    word=word.toLowerCase();
    while (str.contains(word)){
        count++;
        str= str.replaceFirst(word," ");


    }

        System.out.println(count);






    }


}
