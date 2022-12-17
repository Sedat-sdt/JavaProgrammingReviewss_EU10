package week10_11_12_2022;

public class WrapperIntro {

    public static void main(String[] args) {

        int a= 2;
        Integer b=122;
        Integer c=new Integer(12);

        String number1="100";
        String number2= "200";
        String result = number1+number2;//100200 string
        System.out.println("result = " + result);
        //converting string to int
        int result1=Integer.parseInt(number1);//100 number
        int result2=Integer.parseInt(number2);//200 number
        System.out.println(result1 + result2);
        //what is the difference between parsInt()and valueOf()
        //valueOf returns an object(Wrapper Class)
        //parsInt() returns primitive data type

        int i=Integer.parseInt("123");
        //short cut of creating variable
        //alt enter
        Integer integer=Integer.valueOf("123");

        //what is the difference between autoboxing and unboxing
        //autoboxing primitive----> object(wrapper class)
        //unboxing object(wrapper ----> primitive

        int i1= 12;
        Integer integer1=i1;//autoboxing primitive

        Integer integer2=12;
        int i2=integer2;//unboxing object








    }
}
