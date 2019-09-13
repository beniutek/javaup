import java.util.Arrays;

// zad1
public class Klasa1 {
    private double[][] tabDouble;
    private int calkowita;

    public Klasa1() {
        this.calkowita = 0;
        this.tabDouble = new double[1][1];
    }

    public Klasa1(double[][] tabDouble, int calkowita) {
        this.tabDouble = tabDouble;
        this.calkowita = calkowita;
    }

    @Override
    public String toString() {
        return "Klasa1{" +
                "tabDouble=" + Arrays.toString(tabDouble) +
                ", calkowita=" + calkowita +
                '}';
    }

    public double[][] getTabDouble() {
        return tabDouble;
    }

    public void setTabDouble(double[][] tabDouble) {
        this.tabDouble = tabDouble;
    }

    public int getCalkowita() {
        return calkowita;
    }

    public void setCalkowita(int calkowita) {
        this.calkowita = calkowita;
    }
}
