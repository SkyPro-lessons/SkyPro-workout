package site.telion.skyproworkout.tasks.task1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Task1Tests {

    @Test
    public void shouldReturnFormattedNames() {
        Assertions.assertThat(Task1.getFormattedNames(List.of("Никита", "Вася", "Оля", "Катя", "Ира")))
                .containsExactly("ася", "атя", "икита", "ля", "ра");
    }

}
