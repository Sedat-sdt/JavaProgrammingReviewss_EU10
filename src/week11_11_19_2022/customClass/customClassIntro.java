package week11_11_19_2022.customClass;

public class customClassIntro {
    public static void main(String[] args) {

        //how to create class
        //class name reference= new keyword constructor
        SecondClass secondClass=new SecondClass();
        FirstClass firstObject= new FirstClass(4,"Adam",secondClass);

        //how to get attributes

        System.out.println(firstObject.a);
        System.out.println(firstObject.b);





    }
}
