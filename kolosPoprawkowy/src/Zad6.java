// zad 6
public interface Zad6 {
    static void wypisz2D(double[][] tab) {
        for (double[] i: tab) {
          for(double j: i) {
              System.out.println(j);
          }
        }
    }
}
