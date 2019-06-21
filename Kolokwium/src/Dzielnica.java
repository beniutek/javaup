import java.util.List;

public class Dzielnica extends Miasto {
    private int nrDzielnicy;
    private List<String> tablicaUlic;
    private static int obecnyNrDzielnicy = 1;

    public Dzielnica() {
        przydzielNrDzielnicy();
    }

    public Dzielnica(String nazwaMiasta, Prezydent prezydentMiasta, List<String> tablicaUlic) {
        super(nazwaMiasta, prezydentMiasta);
        przydzielNrDzielnicy();
        this.tablicaUlic = tablicaUlic;
    }

    public Dzielnica(String nazwaMiasta, Prezydent prezydentMiasta) {
        super(nazwaMiasta, prezydentMiasta);
        przydzielNrDzielnicy();
    }

    private void przydzielNrDzielnicy() {
        this.nrDzielnicy = Dzielnica.obecnyNrDzielnicy;
        Dzielnica.obecnyNrDzielnicy++;
    }

    public int getNrDzielnicy() {
        return nrDzielnicy;
    }

    @Override
    public String toString() {
        return "Dzielnica{" +
                "nrDzielnicy=" + nrDzielnicy +
                ", tablicaUlic=" + tablicaUlic +
                "} ";// + super.toString();
    }
}
