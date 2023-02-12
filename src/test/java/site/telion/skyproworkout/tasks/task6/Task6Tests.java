package site.telion.skyproworkout.tasks.task6;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task6Tests {
    private final Task6 variable1 = new Task6("Вася", 21);
    private final Task6 variable2 = new Task6("Петя", 12);
    private final Task6 variable3 = new Task6("Вася", 21);
    private final Task6 variable4 = new Task6("Петя", 19);
    private final Task6 variable5 = new Task6("Оля", 19);
    private final Task6 variable6 = new Task6("Оля", 19);

    @Test
    public void shouldReturnTrueIfObjectsIsEquals() {
        Assertions.assertThat(variable1.equals(variable3))
                .isTrue();
        Assertions.assertThat(variable5.equals(variable6))
                .isTrue();
    }

    @Test
    public void shouldReturnFalseIfObjectsIsNotEquals() {
        Assertions.assertThat(variable1.equals(variable2))
                .isFalse();
        Assertions.assertThat(variable2.equals(variable3))
                .isFalse();
        Assertions.assertThat(variable2.equals(variable4))
                .isFalse();
        Assertions.assertThat(variable4.equals(variable5))
                .isFalse();
        Assertions.assertThat(variable6.equals(variable1))
                .isFalse();
    }

    @Test
    public void shouldReturnValidHashCode() {
        Assertions.assertThat(variable1.hashCode())
                .isEqualTo(995325577);
        Assertions.assertThat(variable2.hashCode())
                .isEqualTo(1007481257);
        Assertions.assertThat(variable3.hashCode())
                .isEqualTo(995325577);
        Assertions.assertThat(variable4.hashCode())
                .isEqualTo(1007481264);
        Assertions.assertThat(variable5.hashCode())
                .isEqualTo(32474689);
        Assertions.assertThat(variable6.hashCode())
                .isEqualTo(32474689);

    }
}
