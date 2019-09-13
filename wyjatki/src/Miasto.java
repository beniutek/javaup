public class Miasto {
    private String nazwaMiasta;
    private String prezydentMiasta;

    public Miasto() {
      this.Miasto("Krakow", "Chujowy");
    }

    public Miasto(String nazwaMiasta, String prezydentMiasta) {
        this.nazwaMiasta = nazwaMiasta;
        this.prezydentMiasta = prezydentMiasta;
    }

    @Override
    public String toString() {
        return "Miasto {" +
                "nazwaMiasta='" + nazwaMiasta + '\'' +
                ", prezydentMiasta='" + prezydentMiasta + '\'' +
                " }";
    }
}
