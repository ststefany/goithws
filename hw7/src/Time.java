
/*Generate Integer and String ArrayList and LinkedList with 1000 and 10000 elements. Measure time of execution of the following methods and print it to console:
        - add
        - set
        - get
        - remove*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Time {

    public static void main(String[] args) {

        List<String> stringarray = new ArrayList<>();
        List<Integer> intarray = new ArrayList<>();

        List<String> stringlin = new LinkedList<>();
        List<Integer> intlin = new ArrayList<>();

        int n = 1000;

        //adding
        long timeout = System.nanoTime();
        for (int i = 0; i < n; i++)
            stringarray.add(" ");
        System.out.println("ArrayList added "+ n +" strings for " + (System.nanoTime() - timeout) + " nanoseconds");

        timeout = System.nanoTime();
        for (int i = 0; i < n; i++)
            stringlin.add(" ");
        System.out.println("LinkedList added "+ n +" strings for " + (System.nanoTime() - timeout) + " nanoseconds");

        timeout = System.nanoTime();
        for (int i = 0; i < n; i++)
            intarray.add(12);
        System.out.println("ArrayList added "+ n +" integers for " + (System.nanoTime() - timeout) + " nanoseconds");

        timeout = System.nanoTime();
        for (int i = 0; i < n; i++)
            intlin.add(12);
        System.out.println("LinkedList added " + n +" integers for " + (System.nanoTime() - timeout) + " nanoseconds");

        //setting
        timeout = System.nanoTime();
        for (int i = 0; i < stringarray.size(); i++)
            stringarray.set(i, " ");
        System.out.println("ArrayList set " + n +" strings for " + (System.nanoTime() - timeout) + " nanoseconds");

        timeout = System.nanoTime();
        for (int i = 0; i < stringlin.size(); i++)
            stringlin.set(i, " ");
        System.out.println("LinkedList set " + n +" strings for " + (System.nanoTime() - timeout) + " nanoseconds");

        timeout = System.nanoTime();
        for (int i = 0; i < intarray.size(); i++)
            intarray.set(i, 12);
        System.out.println("ArrayList set " + n +" integers for " + (System.nanoTime() - timeout) + " nanoseconds");

        timeout = System.nanoTime();
        for (int i = 0; i < intlin.size(); i++)
            intlin.set(i, 23);
        System.out.println("LinkedList set " + n +" integers for " + (System.nanoTime() - timeout) + " nanoseconds");

        //getting

        timeout = System.nanoTime();
        for (int i = 0; i < intarray.size(); i++)
            intarray.get(i);
        System.out.println("ArrayList got " + n +" integers for " + (System.nanoTime() - timeout) + " nanoseconds");

        timeout = System.nanoTime();
        for (int i = 0; i < intlin.size(); i++)
            intlin.get(i);
        System.out.println("LinkedList got " + n +" integers for " + (System.nanoTime() - timeout) + " nanoseconds");

        timeout = System.nanoTime();
        for (int i = 0; i < stringarray.size(); i++)
            stringarray.get(i);
        System.out.println("ArrayList got " + n +" strings for " + (System.nanoTime() - timeout) + " nanoseconds");

        timeout = System.nanoTime();
        for (int i = 0; i < stringlin.size(); i++)
            stringlin.get(i);
        System.out.println("LinkedList got " + n +" strings for " + (System.nanoTime() - timeout) + " nanoseconds");


        //removing
        Iterator intarrayiterator = intarray.iterator();
        Iterator stringarrayiterator = stringarray.iterator();
        Iterator intliniterator = intlin.iterator();
        Iterator stringliniterator = stringlin.iterator();

        timeout = System.nanoTime();
        while (intarrayiterator.hasNext())
            intarrayiterator.next();
        intarrayiterator.remove();
        System.out.println("ArrayList removed 1000 integers for " + (System.nanoTime() - timeout) + " nanoseconds");

        timeout = System.nanoTime();
        while (intliniterator.hasNext())
            intliniterator.next();
        intliniterator.remove();
        System.out.println("LinkedList removed 1000 integers for " + (System.nanoTime() - timeout) + " nanoseconds");

        timeout = System.nanoTime();
        while (stringarrayiterator.hasNext())
            stringarrayiterator.next();
        stringarrayiterator.remove();
        System.out.println("ArrayList removed 1000 strings for " + (System.nanoTime() - timeout) + " nanoseconds");

        timeout = System.nanoTime();
        while (stringliniterator.hasNext())
            stringliniterator.next();
        stringliniterator.remove();
        System.out.println("LinkedList removed 1000 strings for " + (System.nanoTime() - timeout) + " nanoseconds");


    }
}
