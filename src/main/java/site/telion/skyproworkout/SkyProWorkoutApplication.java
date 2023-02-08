package site.telion.skyproworkout;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SkyProWorkoutApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkyProWorkoutApplication.class, args);
        Logger logger = LoggerFactory.getLogger(SkyProWorkoutApplication.class);
        logger.info("Приложение запущено");
    }

}
