package week05_10_08_2022;

public class LoopIntro {
    public static void main(String[] args) {

        // if we repeat one action more than one we can use loop in here we will learn for loop
        String str = "0123456";
        str.charAt(0);
        str.charAt(1);
        //index<=str.length()-1
        int index;
        for (index = 0; index < str.length(); index++) ;
        System.out.println(str.charAt(index));

        //write the numbers from 1 to 100
        for(int i=0; i<=100;i++) {

            System.out.println(i);
        }
        //even number 1---100

        for(int i=0; i<=100;i+=2){
            System.out.println(i);
        }

        //write the numbers from 100 to 0

        for (int i = 100; i >=0 ; i--) {
            System.out.print(i);

        }

    }
}
