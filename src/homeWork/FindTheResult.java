package homeWork;

public class FindTheResult {

    public static void main(String[] args) {

       int a = 25;

       if(a%3 == 0){
           a+= 20;
       } else if (a%5 ==0) {
           a+= 25;
       } else if (a%15 ==0) {
           a+= 50;
       } else {
           System.out.println("Not divisible by 3,5,15");
       }
        System.out.println("a = " + a);

        /*
        Create a class which is "FindTheResult" create a variable
    int a=15;
         if a is divisable by 3 add 20
         if a is divisable by 5 add 25
         if a is divisable by 15 add 50
         */
    }
}
