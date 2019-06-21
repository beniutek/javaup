import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Kolokwium {
    public static void zapiszDoPliku(String filename, Dzielnica[] dzielnice) {
        try (PrintWriter pw = new PrintWriter(filename)) {
            for (int i = 0; i < dzielnice.length; i++) {
                pw.write(dzielnice[i].toString());
                pw.write(System.lineSeparator());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("NIe znaleziono pliku");
        }
    }

    public static boolean duzeLiteryCyfry(String napis) {
        String pattern = "^([0-9]*[A-Z]*[0-9]*[A-Z]*)$";
        return napis.matches(pattern);
    }

    public static void main(String[] args) {
        Dzielnica[] dzielnice = new Dzielnica[4];
        dzielnice[0] = new Dzielnica();
        dzielnice[2] = new Dzielnica();
        dzielnice[1] = new Dzielnica();
        dzielnice[3] = new Dzielnica();

        System.out.println(Arrays.toString(dzielnice));
        Arrays.sort(dzielnice, (Dzielnica b, Dzielnica a) -> Integer.compare(a.getNrDzielnicy(), b.getNrDzielnicy()));
        System.out.println("=======");
        System.out.println(Arrays.toString(dzielnice));

        Kolokwium.zapiszDoPliku("foo.txt", dzielnice);

        System.out.println(Kolokwium.duzeLiteryCyfry("22323EWREWRWE"));
        System.out.println(Kolokwium.duzeLiteryCyfry("22323EerewrEWRWE"));
    }
}

