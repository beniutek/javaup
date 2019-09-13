import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // zad5
    public static boolean maleLiteryCyfry(String napis) {
        String pattern = "^([0-9]*[a-z]*[0-9]*[a-z]*)$";
        return napis.matches(pattern);
    }
    // zad 5 end

    public static void main(String[] args) {
        double[][] x = new double[1][1];

        // zad 3
        Klasa1 a = new Klasa1(x, 10);
        Klasa1 b = new Klasa1(x, 100);
        Klasa1 c = new Klasa1(x, 1);
        Klasa1 d = new Klasa1(x, -100);

        Klasa1[] arr = { a, b, c, d };

        Arrays.sort(arr, new KlasaComparator());
        // zad 3 end

        // zad 4

        File file = new File("test.txt");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String napis = scanner.nextLine();
                // zad 5
                if (Main.maleLiteryCyfry(napis)) {
                    System.out.println(napis);
                }
                // zad5 end
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found in current directory\n"+"current dir: " + System.getProperty("user.dir"));
        }
        // zad4 end
    }
}
