package site.telion.skyproworkout.tasks.task2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Task2Tests {
    private final List<Integer> actual = new ArrayList<>(List.of(1, 7, 4, 99, 12, -1, 99780));

    @Test
    public void shouldReturnReverseArrayWithCollectionsClass() {
        Assertions.assertThat(Task2.getReverseListWithCollections(actual))
                .containsExactly(99780, -1, 12, 99, 4, 7, 1);
    }

    @Test
    public void shouldReturnReverseArrayWithFor() {
        Assertions.assertThat(Task2.getReverseListWithFor(actual))
                .containsExactly(99780, -1, 12, 99, 4, 7, 1);
    }


}
