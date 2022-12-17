package week05_10_08_2022;

public class EncrypWithPassword {
    public static void main(String[] args) {


        String password= "Cydeo";
        char encryptWith='x';
        String encryptedpassword="";

        for (int i = 0; i < password.length(); i++) {
            encryptedpassword+=""+password.charAt(i)+encryptWith;

        }
        System.out.println(encryptedpassword);


        /*

        Task 9: Given a string password.
        Encrypt with "x" a given password
        and print.

    Hint: do with for loop

     * password: cydeo
     * encrypt with char :x
     * output:cxyxdxexox
         */
    }
}
