import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>(10);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //for (int i = 0; i < 10; i++) - было, не работало
        list.add(Integer.valueOf(reader.readLine()));
        list.add(Integer.valueOf(reader.readLine()));
        reader.close();


        Integer co = 0;
        int count = 1;
        int max = 1;

        //эту часть можно игнорировать, меня волнует первая беда
        while (co < list.size() - 1)
            if (list.get(co).equals(list.get(co + 1))) count++;
            else {
                if (max > count) max = count;
                count = 1;
            }

        System.out.println(max);
    }
}