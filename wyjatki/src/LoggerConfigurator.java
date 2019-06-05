import java.io.IOException;
import java.util.logging.*;

public class LoggerConfigurator {
    private Logger logger;

    public LoggerConfigurator(Logger logger) {
        this.logger = logger;
    }

    public void configure(Level level, String filename) {
        logger.setLevel(Level.ALL);
        try {
            Handler fileHandler = new FileHandler(filename);
            fileHandler.setLevel(Level.FINER);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Handler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.INFO);
        logger.addHandler(consoleHandler);
    }
}
