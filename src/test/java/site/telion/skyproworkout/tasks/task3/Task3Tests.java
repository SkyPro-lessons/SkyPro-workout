package site.telion.skyproworkout.tasks.task3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task3Tests {

    @Test
    public void shouldReturnTrueIfTextIsPalindrome() {
        Assertions.assertThat(Task3.isPalindrome("agga"))
                .isTrue();
        Assertions.assertThat(Task3.isPalindrome("aga"))
                .isTrue();
        Assertions.assertThat(Task3.isPalindrome("aa"))
                .isTrue();
        Assertions.assertThat(Task3.isPalindrome("a"))
                .isTrue();
        Assertions.assertThat(Task3.isPalindrome(""))
                .isTrue();
    }

    @Test
    public void shouldReturnFalseIfTextIsNotPalindrome() {
        Assertions.assertThat(Task3.isPalindrome("agat"))
                .isFalse();
        Assertions.assertThat(Task3.isPalindrome("-."))
                .isFalse();
        Assertions.assertThat(Task3.isPalindrome(" g"))
                .isFalse();
        Assertions.assertThat(Task3.isPalindrome("azzzcza"))
                .isFalse();
        Assertions.assertThat(Task3.isPalindrome("azca"))
                .isFalse();
        Assertions.assertThat(Task3.isPalindrome(null))
                .isFalse();
    }
}
