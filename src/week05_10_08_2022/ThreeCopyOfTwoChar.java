package week05_10_08_2022;

public class ThreeCopyOfTwoChar {
    public static void main(String[] args) {

String word = "Hello";
int indexOfLastChar = word.length()-1;
int indexOfSecondFromLastChar = word.length()-2;
char last = word.charAt(indexOfLastChar);
char beforeLast = word.charAt(indexOfSecondFromLastChar);
String lastTwo=""+beforeLast+last;
        System.out.println(lastTwo+lastTwo+lastTwo);






        /*
        Task 2: Create a logic print a new string
        made of 3 copies of the last 2 chars of the
        original string.

      Hint: The string length will be at least 2.

         */
    }
}
