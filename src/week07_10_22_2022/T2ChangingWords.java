package week07_10_22_2022;

public class T2ChangingWords {
    public static void main(String[] args) {
        String message = "I love cats! I have a cat named Coco. My cat's very smart!";
    String searched ="cat";
    String changed="dog";
    String result="";
   // String result1= message.replace(searched,changed);  kolay yol

    int indexOfFirstCat=message.indexOf(searched);
    int endOfWord= indexOfFirstCat+searched.length();

    message= message.substring(0,indexOfFirstCat)+changed+message.substring(endOfWord);


    while(message.contains(searched)){
        indexOfFirstCat=message.indexOf(searched);
        endOfWord= indexOfFirstCat+searched.length();
        message= message.substring(0,indexOfFirstCat)+changed+message.substring(endOfWord);
    }
        System.out.println(message);




   // String substring =message.substring(indexOfFirstCat,indexOfFirstCat+searched.length());







   // result =message.substring(0,message.indexOf("cat"))+changed;
     //   System.out.println(result);






    //we need to check the message contains ca t or not
        //if we have it ı will chang ethe cat with dog
        //while(message.contains(searched)){















        /*
        Task 2:  Write a programt that replaces every occurrence of "cat" in the message
        with "dog", using indexOf and substring.

  input:

  String message = "I love cats! I have a cat named Coco. My cat's very smart!";

  output:

 "I love dogs! I have a dog named Coco. My dog's very smart!";
         */
    }
}
