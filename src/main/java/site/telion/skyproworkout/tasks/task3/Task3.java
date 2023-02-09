package site.telion.skyproworkout.tasks.task3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Task3 {
    private static final Logger logger = LoggerFactory.getLogger(Task3.class);

    public static void main(String[] args) {
        logger.debug("'aga' is palindrome: " + isPalindrome("aga"));
        logger.debug("'agata' is palindrome: " + isPalindrome("agata"));
        logger.debug("'agga' is palindrome: " + isPalindrome("agga"));
        logger.debug("'' is palindrome: " + isPalindrome(""));
        logger.debug("'a' is palindrome: " + isPalindrome("a"));
    }

    public static boolean isPalindrome(String text) {
        if (text == null) return false;
        char[] textArray = text.toCharArray();
        int textSize = textArray.length;
        for (int i = 0; i < textSize/2; i++) {
            if (textArray[i] != textArray[textSize - 1 - i]) return false;
        }
        return true;
    }
}
