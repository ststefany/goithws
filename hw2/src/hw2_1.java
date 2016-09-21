import java.util.Random;

/*ЗАДАНИЕ 1
 Input: array with size = 10 can be of one of two data types: int and double. Calculate:

 sum
 min/max
 max positive
 multiplication
 modulus of first and last element
 second largest element


 As a result you should have methods with following names :

 sum(int array[]), sum(double[])
 min(int array[]), min(double[])
 max(int array[]), max(double[])
 maxPositive(int array[]), maxPositive(double array[]),
 multiplication  (int array[]), multiplication (double[])
 modulus(int array[]), modulus(double[])
 secondLargest(int array[]), secondLargest(double[])

 */
public class hw2_1 {

    public static void main(String[] args) {
        int[] array = new int[15];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }

        System.out.println("");

        System.out.println("Modulus - " + ArrayUtils.modulus(array));
        System.out.println("Cумма всех чисел: " + ArrayUtils.sum(array));
        System.out.println("Минимальное число - " + ArrayUtils.min(array) + ". Максимальное число - " + ArrayUtils.max(array) + ". Второе по величине число - " + ArrayUtils.secondLargest(array));
        ArrayUtils.maxPositive(array);
    }
}
