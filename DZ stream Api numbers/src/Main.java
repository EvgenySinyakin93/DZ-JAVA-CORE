import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Locale.filter;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        ArrayList<Integer> array = new ArrayList(); //лист для положительных четных чисел
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) > 0 && intList.get(i) % 2 == 0) {
                array.add(intList.get(i)); //если условие выполнено добавляем эл-т в лист
            }
        }
        Collections.sort(array);//cортируем полученные числа
        for (Integer arrays : array) {
            System.out.print(arrays + " ");
        }
    }
}

class StreamMain {
    public static void main() {
        //        Получить ArrayList из чисел можно следующим образом:
        List<Integer> intList2 = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
//        Для получения потока из массива целых чисел используйте:
        Stream<Integer> stream = intList2.stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder());
        System.out.println(intList2);
    }
}


