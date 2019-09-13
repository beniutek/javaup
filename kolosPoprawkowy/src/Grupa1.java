import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Grupa1 {
    // zad5
    public static boolean maleLiteryCyfry(String napis) {
        String pattern = "^([0-9]*[a-z]*[0-9]*[a-z]*)$";
        return napis.matches(pattern);
    }
    // zad 5 end

    public static void main(String[] args) {
        double[][] x = {
                { 1.1, 2.2, 3.3 },
                { 4.4, 5.5, 6.6 },
                { 7.7, 8.8, 9.9 }
        };

        // zad 3
        Klasa1 a = new Klasa1(x, 10);
        Klasa1 b = new Klasa1(x, 100);
        Klasa1 c = new Klasa1(x, 1);
        Klasa1 d = new Klasa1(x, -100);

        Klasa1[] arr = { a, b, c, d };

        Arrays.sort(arr, new KlasaComparator());

        for (int i = 0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
        // zad 3 end

        // zad 4

        File file = new File("test.txt");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String napis = scanner.nextLine();
                // zad 5
                if (Grupa1.maleLiteryCyfry(napis)) {
                    System.out.println(napis);
                }
                // zad5 end
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found in current directory\n"+"current dir: " + System.getProperty("user.dir"));
        }
        // zad4 end

        // zad 6

        Zad6.wypisz2D(x);
    }
}
