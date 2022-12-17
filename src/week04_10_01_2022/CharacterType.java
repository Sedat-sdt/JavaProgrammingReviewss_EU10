package week04_10_01_2022;

public class CharacterType {

    /*
        Given a character, the task is to check whether
        the given character is in upper case, lower case,
        or non-alphabetic         character

                            Input: ch = 'A'
                            Output: A is an UpperCase character

                            Input: ch = 'a'
                            Output: a is an LowerCase character

                            Input: ch = '0'
                            Output: 0 is not an aplhabetic characte
        */
    public static void main(String[] args) {

    //get the character
    char ch ='A';
    boolean isUpperCase= ch>='A' && ch<='Z';
    boolean isLowerCase= ch>='a' && ch<='z';
    boolean isNotAlphabetic= !(isUpperCase||isLowerCase);
//!isLowerCase&&!isUpperCase

/*if(isUpperCase) {
    System.out.println("is an Upper Case ch");
}else if(isLowerCase){
    System.out.println("is lowercase");
}else {
    System.out.println("is not an alphabetic");
}*/

        if(isUpperCase) {
            System.out.println("is an Upper Case ch");
        }if(isLowerCase) {
            System.out.println("is lowercase");
        }if(isNotAlphabetic) {
            System.out.println("is not an alphabetic");
        }





    }
}
