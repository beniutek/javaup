import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        LoggerConfigurator configurator = new LoggerConfigurator(logger);
        configurator.configure(Level.ALL, "log.txt");

        FileReaderWriter rw = new FileReaderWriter();
        rw.readFilenameFromInput();
        rw.readFile();
        rw.writeToFile("newFile.txt");
    }
}
