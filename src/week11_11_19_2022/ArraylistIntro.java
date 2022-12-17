package week11_11_19_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistIntro {

    public static void main(String[] args) {

        ArrayList<String> cities=new ArrayList<>();

        //add element

        cities.add("London");//returns boolean
        cities.add("Paris");
        cities.add("Istanbul");
        cities.add("Rome");


        System.out.println(cities);//[London, Paris, Istanbul, Rome]

        //for arrays arrays.tostring we must use

        //how to add one element at  the beginning
        cities.add(0,"Ankara");


        //how to get element
        System.out.println(cities.get(0));//ankara

        //how to update your element

        cities.set(2,"Sinop");

        System.out.println("cities = " + cities);//cities = [Ankara, London, Sinop, Istanbul, Rome]

       // how to learn position of the element  or index of element

        System.out.println(cities.indexOf("Sinop"));//  2
        System.out.println(cities.indexOf("İzmir"));// -1

        //lastIndexOf()

        System.out.println(cities.lastIndexOf("London"));//1
        System.out.println(cities.indexOf("London"));//1

        System.out.println("cities = " + cities);
//cities = [Ankara, London, Sinop, Istanbul, Rome]

        cities.add("London");
        System.out.println("cities = " + cities);
//cities = [Ankara, London, Sinop, Istanbul, Rome, London]

        System.out.println(cities.lastIndexOf("London"));//5
        System.out.println(cities.indexOf("London"));//1


        //how to remove one element

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(1);
        numbers.add(1);

        System.out.println(numbers);//[1, 1, 1, 2, 3, 4, 5, 1, 1]

        System.out.println(numbers.indexOf(1));//0
        System.out.println(numbers.lastIndexOf(1));//7

        //how to remove element

        ArrayList<Integer> numbers1= new ArrayList<>();

        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(4);
        numbers1.add(5);
        numbers1.add(1);

        System.out.println(numbers1);//[2, 3, 4, 5, 1]

        numbers1.remove(1);

        System.out.println(numbers1);//[2, 4, 5, 1]

        Integer b=4;
        numbers1.remove(b);//remove element 4
        System.out.println(numbers1);//[2, 4, 5, 1]
        //Integer a=new Integer(5);
        numbers1.remove(new Integer(5));
        System.out.println(numbers1);


        //bulk operation

        //addAll

        ArrayList<String> names =new ArrayList<>();

        names.addAll(Arrays.asList("Sedat","Sude","Şule"));


        //removeAll

        //retainAll

        //removeIf()

        System.out.println(numbers1);

        for (Integer number : numbers) {
            if(number<3)
                numbers.remove(number);//we are not able to use like this because for each iterations the indexes are changing
        }
        //each
        numbers.removeIf(p-> p<3);
        System.out.println(numbers);








    }
}
