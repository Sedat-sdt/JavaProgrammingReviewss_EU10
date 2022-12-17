package homeWork;

import java.util.Scanner;

public class StringPractice4 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("Enter your User name: ");
        String userName=scan.nextLine();

        System.out.println("Enter your Password: ");
        String passWord = scan.nextLine();

        if(userName.equals("Cydeo") && passWord.equals("WoodenSpoon")){
            System.out.println("Logged in");
        }else{
            System.err.println("Incorrect username or password");
        }
        scan.close();
        /*Scanner scan =new Scanner(System.in);

        String userName ="Cydeo";
        String passWord ="WoodenSpoon";

        System.out.println("Enter your credentials\n"+"User name: ");
        String userName1=scan.nextLine();

        System.out.println("Password: ");
        String passWord1 = scan.nextLine();

        if(userName1.equals(userName) && passWord1.equals(passWord)){
            System.out.println("Logged in");
        }else{
            System.err.println("Incorrect username or password");
        }
        scan.close();*/




        /*
        Enter your credentials
        User name:
        cyde
        Password:
        WoodenSpoon
        Incorrect username or password
         */

   /*

   You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials. If credentials are matched, your program should print "Logged in."
        otherwise print "Incorrect username or password" as error message

    	Hints: 	In order to login, both username and password MUST be correct
    			you will need to use equals() method


    */
    }
}
