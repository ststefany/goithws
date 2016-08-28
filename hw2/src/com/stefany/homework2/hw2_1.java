
package com.stefany.homework2;

import java.math.BigDecimal;
import java.util.Arrays;
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

        System.out.println("Modulus - " + modulus(array));
        System.out.println("Cумма всех чисел: " + sum(array));
        System.out.println("Минимальное число - " + min(array) + ". Максимальное число - " + max(array) + ". Второе по величине число - " + secondLargest(array));
        maxPositive(array);
    }

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
        for (int i = 1; i < array.length; i++){
            if (min > array[i])
                min = array[i];
        }
        return min;
    }


    static int max(int array[]) {
        int max = array[0];
        for (int i = 1; i < array.length; i++){
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
}


