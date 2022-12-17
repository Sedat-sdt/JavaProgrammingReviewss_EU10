package week06_10_15_2022;

public class T1_CountSpecificWord {
    public static void main(String[] args) {
    /*
     Task 1: Given a sentence which is string find word
     how many times repeats in it.

Hint: use substring with for loop

input:
*               String str="Java is java in everywhere is Java";
*                                String word="Java";
output:3
     */

/*String str="Java is java in everywhere is Java";

String word="Java";

int counter=0;
for (int i = 0; i <= str.length()-word.length(); i++) {
                               //-3
    String each= str.substring(i,i+word.length()) ;
         if(each.equalsIgnoreCase(word)) {
             counter++;
         }
         }
        System.out.println(counter);*/


/*
Task 2: Given a sentence which is string and count the words in it.

input:

  String str="Java is java in everywhere is Java";

  output:7
 */
        String str = "Java is java in everywhere is Java";
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                counter++;
            }
        }

        System.out.println(counter + 1);
    }}









