package site.telion.skyproworkout.tasks.task7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Напишите пример перехвата и обработки исключения в блоке try-catch метода.
 */
public class Task7 {
    public final Logger logger = LoggerFactory.getLogger(Task7.class);

    public int catchArithmeticException(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            return a / 1;
        }
    }
}
