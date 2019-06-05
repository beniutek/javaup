import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class FileReaderWriter {
    private String filename;
    private List<String> data = new ArrayList<>();
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());


    public void readFile() {
        LOGGER.entering(this.getClass().getName(),"readFile");

        try {
            Scanner scanner = new Scanner(new FileInputStream(filename));
            String line;
            while(scanner.hasNextLine()) {
                line = scanner.nextLine();
                System.out.println(line);
                data.add(line);
            }

        } catch (FileNotFoundException ex) {
            LOGGER.throwing(this.getClass().getName(), "readFile", ex);
        }
        LOGGER.exiting(this.getClass().getName(), "readFile");
    }

    public void writeToFile(String filename) {
        LOGGER.entering(this.getClass().getName(),"writeToFile", filename);
        if (data.size() == 0) {
            try {
                throw new CustomException("no data to write to file " + filename);
            } catch (CustomException e) {
                LOGGER.throwing(this.getClass().getName(), "writeToFile", e);
            }
        }

        try (PrintWriter pw = new PrintWriter(filename)) {
            LOGGER.info("writing data to file: " + filename);
            data.forEach(val -> pw.write(val + "\n"));
            pw.flush();
        } catch (FileNotFoundException ex) {
            LOGGER.throwing(this.getClass().getName(), "writeToFile", ex);
        }
        LOGGER.exiting(this.getClass().getName(), "writeToFile");
    }

    public void readFilenameFromInput() {
        LOGGER.entering(this.getClass().getName(),"readFilenameFromInput");
        String input;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("enter full filename: ");
            input = scanner.nextLine();
        }

        this.filename = input;

        LOGGER.exiting(this.getClass().getName(),"readFilenameFromInput");
    }
}
