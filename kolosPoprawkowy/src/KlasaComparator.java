import java.util.Comparator;

public class KlasaComparator implements Comparator<Klasa1> {
        @Override
        public int compare(Klasa1 k1, Klasa1 k2) {
            return k1.getCalkowita() - k2.getCalkowita();
        }
}
