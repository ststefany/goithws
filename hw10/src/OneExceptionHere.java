/*ЗАДАНИЕ 1

Create a class with a main( ) that throws an object of class Exception inside a try block.
Give the constructor for Exception a String argument. Catch the exception inside a catch clause
and print the String argument. Add a finally clause and print a message to prove you were there.

*/

public class OneExceptionHere {

    public static void main(String[] args) {
        try {
            throw new Exception("exception");
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("We were here too");
        }
    }

}
