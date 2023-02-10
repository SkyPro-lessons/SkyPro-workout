package site.telion.skyproworkout.tasks.task6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Напишите методы Equals and HashCode для класса Student, который состоит из полей String name и int age.
 */
public class Task6 {
    private static final Logger logger = LoggerFactory.getLogger(Task6.class);
    private String name;
    private int age;

    public static void main(String[] args) {
        String text1 = new String("text");
        String text2 = new String("text");
        //logger.debug("Проверка работы equals, ожидается true: " + );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (null == o || getClass() != o.getClass()) return false;

        Task6 task6 = (Task6) o;

        if (name != null ? !name.equals(task6.name) : task6.name != null) return false;
        return age == task6.age;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        return 31 * result + age;
    }
}