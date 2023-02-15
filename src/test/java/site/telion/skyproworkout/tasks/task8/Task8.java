package site.telion.skyproworkout.tasks.task8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

public class Task8 {
    private static final Logger logger = LoggerFactory.getLogger(Task8.class);

    public static void main(String[] args) {
        try {
            iHaveException();
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
    }

    public static void iHaveException() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.close();
    }

}
