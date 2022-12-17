package week04_10_01_2022;

public class CodilityTest {

    public static void main(String[] args) {
//we will get a number from user
        int number =6;
//create a variable in order to put our result in it
        String result ="";
//we will check the number is pos or neg
        if(number>0){
         // I can go on with other steps

//if the num is pos we will check the number divisible by 2.
// we will append the codility inside variable

    if(number%2==0){
        result= "Codility";
    }
//if the num is pos we will check the number divisible by 3.
// we will append the Test inside variable
            if(number%3==0) {
                result = result + "Test";
                result+= "Test";
            }
//if the num is pos we will check the number divisible by 5.
// we will append the Coders inside variable
            if(number%5==0){
                result =result + "Coders";
                result+= "Coders";

            }
            if(!((number%5==0)&&(number%3==0)&&(number%2==0))){

            }

            /*else{
                System.out.println(" is not divisible by 2,3,5");

            }*/

            }  else{
            System.err.println("your number is smaller than 0");
        }
        System.out.println("result = " + result);
      /*
        Write a function:
  that, given a positive integer N  However, any number divisible
  by 2, 3 or 5 should be replaced by the word

                                Codility -- 2
                                Test     -- 3
                                Coders   -- 5

   - If a number is divisible by more than one of the
   numbers:2,3 or 5, it should be replaced by a concatenation
  of the respective words Codility, Test and Coders in this
   given order.

                                EXPECTED

  numbers divisible by both 2 and 3 should be replacée


   by CodilityTest
  INPUT : 6    OUTPUT :  CodilityTest

      numbers divisible by allthree numbers: 2,3 and 5,
            should be replaced by CodilityTestCoders.
                INPUT : 30    OUTPUT :  CodilityTestCoders
       */

    }
}
