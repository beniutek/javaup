import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {
    private String filename;
    private double badDouble;

    public Reader(String filename, double badDouble) {
        this.filename = filename;
        this.badDouble = badDouble;
    }

    public void readFile() {

        try (Scanner scanner = new Scanner(new FileInputStream(filename))) {


        while(scanner.hasNextLine()) {
            if (scanner.hasNextDouble()) {
                Double d = scanner.nextDouble();
                System.out.println("GOT DD DOUBLE: " + d);
                if (d.equals(badDouble)) {
                    throw new ZnalezionoLiczbe3("Bad double found: " + badDouble);
                } else {
                    System.out.println("DOUBLE: " + d);
                }
            }
            System.out.println("this is next line: " +scanner.nextLine());

        }

        } catch (FileNotFoundException | ZnalezionoLiczbe3 e) {
            e.printStackTrace();
            return;
        }
    }
}
