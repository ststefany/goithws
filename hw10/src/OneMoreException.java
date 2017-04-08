/*ЗАДАНИЕ 3

Define an object reference and initialize it to null. Try to call a method through this reference.
Now wrap the code in a try-catch clause to catch the exception.
*/

public class OneMoreException {

    public static void main(String[] args) {
        int[] array = null;
        try {array.toString();}
        catch (NullPointerException e) {
            System.out.println("We have a problem: " + e);
        }

    }

}
