package week07_10_22_2022;

import java.util.Random;
import java.util.Scanner;

public class HiddenNumber {
    public static void main(String[] args) {
        Random random=new Random();

        int hiddenNumber = random.nextInt(10) + 1;
        Scanner scan = new Scanner(System.in);
       boolean flag =true;

        do {
            System.out.println("Enter a number: ");
            int searchedNumber = scan.nextInt();
            if (searchedNumber == hiddenNumber) {
                System.out.println("congrats");
                flag = false;
            } else {
                System.out.println("try again");
            }
        }while (flag);




        /*
         Find the number that given a hidden number between 1 and 100 randomly created.

 Hint:
         */
    }
}
