import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TEst {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<Integer>();

        for (int l = 0; l < 34; l++)
            list1.add(l, l);

        list1.set(1, 1);
        list1.set(2, 1);
        list1.set(3, 1);
        list1.set(32, 1);

        System.out.println(list1);

        Iterator<Integer> iterator = list1.iterator();
        //Iterator<Integer> iterator1 = list1.iterator();

        while (iterator.hasNext()) {
            System.out.println(list1);
            int i = iterator.next();
            while (iterator.hasNext()) {
                if (i == list1.get(i + 1)) list1.remove(i + 1);
                i++;
            }
                i++;
        }
        System.out.println(list1);
    }
}