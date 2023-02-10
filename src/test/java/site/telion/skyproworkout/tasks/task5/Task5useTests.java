package site.telion.skyproworkout.tasks.task5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task5useTests {

    @Test
    public void shouldReturnMyPositionByNumber() {
        Assertions.assertThat(Task5use.getMyPosition(Task5.ONE))
                .isEqualTo("first");
        Assertions.assertThat(Task5use.getMyPosition(Task5.TWO))
                .isEqualTo("second");
        Assertions.assertThat(Task5use.getMyPosition(Task5.THREE))
                .isEqualTo("third");
        Assertions.assertThat(Task5use.getMyPosition(Task5.FOUR))
                .isEqualTo("not a prize");
        Assertions.assertThat(Task5use.getMyPosition(Task5.TEN))
                .isEqualTo("not a prize");

    }
}
