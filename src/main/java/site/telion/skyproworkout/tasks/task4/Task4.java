package site.telion.skyproworkout.tasks.task4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    private static final Logger logger = LoggerFactory.getLogger(Task4.class);

    public static void main(String[] args) {
        logger.debug("Делю строку 'Привет': " + splitString("Привет"));
        logger.debug("Делю строку '': " + splitString(""));
        logger.debug("Делю строку 'a': " + splitString("a"));
        logger.debug("Делю строку 'bb': " + splitString("bb"));
        logger.debug("Делю строку 'дафыоадл3оадло4д3кд3кад4код4а': " + splitString("дафыоадл3оадло4д3кд3кад4код4а"));
    }

    public static List<String> splitString(String text) {
        List<String> result = new ArrayList<>();
        int length = text.length();
        int middle = length / 2;

        if (length < 2) return null;

        result.add(text.substring(0, middle));
        result.add(text.substring(middle));

        return result;
    }


}
