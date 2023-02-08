package site.telion.skyproworkout.tasks.task2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task2 {
    public static final Logger logger = LoggerFactory.getLogger(Task2.class);

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 4, 6, 8, 3, 0));
        logger.info("startedList = " + list);

        List<Integer> reverseListWithCollections = getReverseListWithCollections(list);
        logger.info("reverseListWithCollections = " + reverseListWithCollections);

        List<Integer> reverseListWithFor = getReverseListWithFor(list);
        logger.info("reverseListWithFor = " + reverseListWithFor);
    }

    private static List<Integer> getReverseListWithFor(List<Integer> list) {
        logger.debug("Выполняется метод listReverseWithFor()");
        List<Integer> result = new ArrayList<>(list);
        for (int i = 0; i < list.size() / 2; i++) {
            result = swap(list, i, list.size() - i - 1);
        }
        return result;
    }

    private static List<Integer> swap(List<Integer> list, int elem1, int elem2) {
        int temp = list.get(elem1);
        list.set(elem1, list.get(elem2));
        list.set(elem2, temp);
        return list;
    }

    private static List<Integer> getReverseListWithCollections(List<Integer> list) {
        logger.debug("Выполняется метод listReverseWithCollections()");
        List<Integer> result = new ArrayList<>(list);
        Collections.reverse(result);
        return result;
    }
}
