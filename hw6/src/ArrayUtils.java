/*ЗАДАНИЕ 1

Create ArraysUtils with following methods

sum(int array[])
min(int array[])
max(int array[])
maxPositive(int array[])
multiplication  (int array[])
modulus(int array[])
secondLargest(int array[])

these should be just copied from your HW2.

In addition add new methods

int[] reverse(int[] array)
int[] findEvenElements(int[] array)
*/


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public final class ArrayUtils {
    static int modulus(int array[]) {
        return array[0] % array[array.length - 1];
    }

    static int sum(int array[]) {
        int sum = 0;
        for (int x = 0; x < array.length; x++) {
            sum = sum + array[x];
        }
        ;
        return sum;
    }

    static int min(int array[]) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i])
                min = array[i];
        }
        return min;
    }


    static int max(int array[]) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        return max;
    }


    static void maxPositive(int array[]) {
        int maxpos = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
                if (array[i] > maxpos)
                    maxpos = array[i];
        }
        if (maxpos == 0)
            System.out.println("Нет положительных чисел");
        else System.out.println("Максимальное положительное число: " + maxpos);
    }


    static void multiplication(int array[]) {
        BigDecimal multi = BigDecimal.ONE;
        for (int i = 0; i < array.length; i++) {
            multi = multi.multiply(BigDecimal.valueOf(array[i]));
        }
        System.out.println("Числа, перемноженные между собой: " + multi);
    }


    static int secondLargest(int array[]) {
        Arrays.sort(array);
        return array[array.length - 2];
    }

    static int[] reverse(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            temp = array[i];
            array[i] = array[array.length - i];
            array[array.length] = temp;
        }
        return array;
    }

    static ArrayList<Integer> findEvenElements(int[] array) {
        ArrayList<Integer> evenlist = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenlist.add(array[i]);
            }
        }
        return evenlist;
    }


}
