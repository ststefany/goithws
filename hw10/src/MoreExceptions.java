/*
ЗАДАНИЕ 5

Create three new types of exceptions. Write a class with a method that throws all three.
In main( ), call the method but only use a single catch clause that will catch all three types of exceptions.
*/

public class MoreExceptions  {

    private static void throwingExceptions() throws Exception1, Exception0, StringException {
        throw new StringException("wow");
    }

    public static void main(String[] args) {
        try {throwingExceptions();}
        catch (Exception e) {
            System.out.println("We've done it! ");
        }
    }

}
