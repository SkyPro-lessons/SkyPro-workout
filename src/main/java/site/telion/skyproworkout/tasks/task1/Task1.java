package site.telion.skyproworkout.tasks.task1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static final Logger logger = LoggerFactory.getLogger(Task1.class);

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Никита", "Вася", "Оля", "Катя", "Ира"));
        List<String> result = getFormattedNames(names);
    }

    public static List<String> getFormattedNames(List<String> names) {
        logger.debug("Выполняется метод getFormattedNames()");
        logger.debug("names = " + names);
        List<String> formattedList = names.stream()
                .map(name -> name.substring(1))
                .sorted()
                .collect(Collectors.toList());
        logger.debug("formattedList = " + formattedList);
        return formattedList;
    }
}
