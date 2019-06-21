public class Miasto {
    private String nazwaMiasta;
    private Prezydent prezydentMiasta;

    public Miasto(String nazwaMiasta, Prezydent prezydentMiasta) {
        this.nazwaMiasta = nazwaMiasta;
        this.prezydentMiasta = prezydentMiasta;
    }

    public Miasto() {
      this("Randomowa Nazwa", new Prezydent("Randomowe imie", "Randomowe nazwisko"));
    }

    @Override
    public String toString() {
        return "Miasto{" +
                "nazwaMiasta='" + nazwaMiasta + '\'' +
                ", prezydentMiasta=" + prezydentMiasta +
                '}';
    }
}
