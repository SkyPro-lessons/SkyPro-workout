package site.telion.skyproworkout.tasks.task4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4Tests {

    @Test
    public void shouldSplitText() {
        Assertions.assertThat(Task4.splitString("Hello"))
                .containsExactly("He", "llo");
        Assertions.assertThat(Task4.splitString("hi"))
                .containsExactly("h", "i");
        Assertions.assertThat(Task4.splitString("alkjfldf,cvmlk45u385yxcm, fgsdfg sd"))
                .containsExactly("alkjfldf,cvmlk45u", "385yxcm, fgsdfg sd");
        Assertions.assertThat(Task4.splitString("d"))
                .isNull();
        Assertions.assertThat(Task4.splitString(""))
                .isNull();
    }
}
