package site.telion.skyproworkout.tasks.task3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task3Tests {

    @Test
    public void shouldReturnTrueIfTextIsPalindromeVar1() {
        Assertions.assertThat(Task3.isPalindromeVar1("agga"))
                .isTrue();
        Assertions.assertThat(Task3.isPalindromeVar1("aga"))
                .isTrue();
        Assertions.assertThat(Task3.isPalindromeVar1("aa"))
                .isTrue();
        Assertions.assertThat(Task3.isPalindromeVar1("a"))
                .isTrue();
        Assertions.assertThat(Task3.isPalindromeVar1(""))
                .isTrue();
    }

    @Test
    public void shouldReturnFalseIfTextIsNotPalindromeVar1() {
        Assertions.assertThat(Task3.isPalindromeVar1("agat"))
                .isFalse();
        Assertions.assertThat(Task3.isPalindromeVar1("-."))
                .isFalse();
        Assertions.assertThat(Task3.isPalindromeVar1(" g"))
                .isFalse();
        Assertions.assertThat(Task3.isPalindromeVar1("azzzcza"))
                .isFalse();
        Assertions.assertThat(Task3.isPalindromeVar1("azca"))
                .isFalse();
        Assertions.assertThat(Task3.isPalindromeVar1(null))
                .isFalse();
    }

    @Test
    public void shouldReturnTrueIfTextIsPalindromeVar2() {
        Assertions.assertThat(Task3.isPalindromeVar2("agga"))
                .isTrue();
        Assertions.assertThat(Task3.isPalindromeVar2("aga"))
                .isTrue();
        Assertions.assertThat(Task3.isPalindromeVar2("aa"))
                .isTrue();
        Assertions.assertThat(Task3.isPalindromeVar2("a"))
                .isTrue();
        Assertions.assertThat(Task3.isPalindromeVar2(""))
                .isTrue();
    }

    @Test
    public void shouldReturnFalseIfTextIsNotPalindromeVar2() {
        Assertions.assertThat(Task3.isPalindromeVar2("agat"))
                .isFalse();
        Assertions.assertThat(Task3.isPalindromeVar2("-."))
                .isFalse();
        Assertions.assertThat(Task3.isPalindromeVar2(" g"))
                .isFalse();
        Assertions.assertThat(Task3.isPalindromeVar2("azzzcza"))
                .isFalse();
        Assertions.assertThat(Task3.isPalindromeVar2("azca"))
                .isFalse();
        Assertions.assertThat(Task3.isPalindromeVar2(null))
                .isFalse();
    }

    @Test
    public void shouldReturnTrueIfTextIsPalindromeVar3() {
        Assertions.assertThat(Task3.isPalindromeVar3("agga"))
                .isTrue();
        Assertions.assertThat(Task3.isPalindromeVar3("aga"))
                .isTrue();
        Assertions.assertThat(Task3.isPalindromeVar3("aa"))
                .isTrue();
        Assertions.assertThat(Task3.isPalindromeVar3("a"))
                .isTrue();
        Assertions.assertThat(Task3.isPalindromeVar3(""))
                .isTrue();
    }

    @Test
    public void shouldReturnFalseIfTextIsNotPalindromeVar3() {
        Assertions.assertThat(Task3.isPalindromeVar3("agat"))
                .isFalse();
        Assertions.assertThat(Task3.isPalindromeVar3("-."))
                .isFalse();
        Assertions.assertThat(Task3.isPalindromeVar3(" g"))
                .isFalse();
        Assertions.assertThat(Task3.isPalindromeVar3("azzzcza"))
                .isFalse();
        Assertions.assertThat(Task3.isPalindromeVar3("azca"))
                .isFalse();
        Assertions.assertThat(Task3.isPalindromeVar3(null))
                .isFalse();
    }
}
