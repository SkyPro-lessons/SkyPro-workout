package site.telion.skyproworkout.tasks.task5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Task5use {
    private static final Logger logger = LoggerFactory.getLogger(Task5use.class);

    public static void main(String[] args) {
        logger.debug("For ONE - position: " + getMyPosition(Task5.ONE));
        logger.debug("For NINE - position: " + getMyPosition(Task5.NINE));
        logger.debug("For THREE - position: " + getMyPosition(Task5.THREE));
        logger.debug("For TWO - position: " + getMyPosition(Task5.TWO));
        logger.debug("For FIVE - position: " + getMyPosition(Task5.FIVE));

    }

    private static String getMyPosition(Task5 currentPosition) {
        return switch (currentPosition) {
            case ONE -> "first";
            case TWO -> "second";
            case THREE -> "third";
            default -> "not a prize";
        };
    }
}
