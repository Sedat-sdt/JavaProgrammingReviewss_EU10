package week16_12_24_2022.exceptions;

public class CompileTimeExceptions {
    public static void main(String[] args) {

    /*
    final: keyword, and it is unchangeable applicable for variables methods and classes
        finally: Block it is an optional block of try catch it always gets executed regardless of the exception
                 is being handled or not handled. we can only stop being executed finally block by applying explicitly
                 system.exit(0)
        finalize: it is a method inherited to every single object. Every single object must have a finalize method.
                  This method is automatically called by Garbage Collector as soon your target object is unreferenced
                  This method helps Garbage collector to clear hip memory from the unreferenced objects
     */
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }catch (Exception e){

        }

        try {

            System.out.println(9/0);
            Integer.parseInt("123.");
        }catch (ArithmeticException e){
            System.out.println("You got the Arithmetic excepiton");
        }catch (NumberFormatException e){
            System.out.println("you have a problem with your number");
        }catch (Exception e){
            System.out.println("I don't know your exception");
        }




    }
}





