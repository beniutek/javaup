import java.util.Arrays;

// zad 1
// zad 2 -> final
public final class Klasa2 extends Klasa1 {
    private double rzeczywita;

    public Klasa2() {
        super();
        this.rzeczywita = 0.0;
    }

    public Klasa2(double[][] tabDouble, int calkowita, double rzeczywita) {
        super(tabDouble, calkowita);
        this.rzeczywita = rzeczywita;
    }

    @Override
    public String toString() {
        return "Klasa2{" +
                "rzeczywita=" + rzeczywita +
                "} " + super.toString();
    }

    public double getRzeczywita() {
        return rzeczywita;
    }

    public void setRzeczywita(double rzeczywita) {
        this.rzeczywita = rzeczywita;
    }
}
