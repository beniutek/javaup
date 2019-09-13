import java.util.Arrays;

// zad 1
// zad 2 -> final
public final class Klasa2 extends Klasa1 {
    private double[][] tabDouble;
    private int calkowita;
    private double rzeczywita;

    public Klasa2() {
        this.calkowita = 0;
        this.rzeczywita = 0.0;
        this.tabDouble = new double[1][1];
    }

    public Klasa2(double[][] tabDouble, int calkowita, double rzeczywita) {
        this.tabDouble = tabDouble;
        this.calkowita = calkowita;
        this.rzeczywita = rzeczywita;
    }

    @Override
    public String toString() {
        return "Klasa2{" +
                "tabDouble=" + Arrays.toString(tabDouble) +
                ", calkowita=" + calkowita +
                ", rzeczywita=" + rzeczywita +
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

    public double getRzeczywita() {
        return rzeczywita;
    }

    public void setRzeczywita(double rzeczywita) {
        this.rzeczywita = rzeczywita;
    }
}
