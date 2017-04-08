/*ЗАДАНИЕ 4

Create a class with two methods, f( ) and g( ). In g( ), throw an exception of a new type that you define.
In f( ), call g( ), catch its exception and, in the catch clause, throw a different exception
(of a second type that you define). Test your code in main( ).
*/


public class gAndfClass {

    private static void g() throws StringException {
        throw new StringException("hohoho!");
    }
    private static void f() throws Exception {
        try {g();}
        catch (StringException e) {throw new Exception("a new one in g");}
    }

    public static void main(String[] args) throws Exception {
        f();
    }


}
