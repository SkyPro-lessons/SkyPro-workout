package site.telion.skyproworkout.tasks.task7;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Task7Tests {

    @Test
    @Disabled
    public void shouldGetException() {
        Task7 task7 = new Task7();
        Assertions.assertThat(task7.catchArithmeticException(120, 0))
                .isEqualTo(120);
        Assertions.assertThat(task7.catchArithmeticException(210, 10))
                .isEqualTo(21);
    }
}
