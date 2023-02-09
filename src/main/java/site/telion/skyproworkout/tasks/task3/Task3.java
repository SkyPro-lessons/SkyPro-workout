package site.telion.skyproworkout.tasks.task3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Task3 {
    private static final Logger logger = LoggerFactory.getLogger(Task3.class);

    public static void main(String[] args) {
        logger.debug("'aga' is palindrome: " + isPalindromeVar3("aga"));
        logger.debug("'agata' is palindrome: " + isPalindromeVar3("agata"));
        logger.debug("'agga' is palindrome: " + isPalindromeVar3("agga"));
        logger.debug("'' is palindrome: " + isPalindromeVar3(""));
        logger.debug("'a' is palindrome: " + isPalindromeVar3("a"));
    }

    public static boolean isPalindromeVar1(String text) {
        if (text == null) return false;
        char[] textArray = text.toCharArray();
        int textSize = textArray.length;
        for (int i = 0; i < textSize/2; i++) {
            if (textArray[i] != textArray[textSize - 1 - i]) return false;
        }
        return true;
    }

    public static boolean isPalindromeVar2(String text) {
        if (text == null) return false;
        int length = text.length();
        for (int i = 0; i < length / 2; i++) {
            if (text.charAt(i) != text.charAt(length - 1 - i)) return false;
        }
        return true;
    }

    public static boolean isPalindromeVar3(String text) {
        if (text == null) return false;

        StringBuilder textBuilder = new StringBuilder(text);
        textBuilder.reverse();
        return textBuilder.toString().equals(text);
    }
}
