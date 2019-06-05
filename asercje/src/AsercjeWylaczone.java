import java.util.Scanner;

class AsercjeWylaczone {
    private boolean czyDodatnie(int liczba) {
        //ktoś uznał, że zero też jest liczbą dodatnią
        return liczba >= 0;
    }

    public void dzielenieCalkowite() {
        int dzielna = 1, dzielnik = 1;
        Scanner skan = new Scanner(System.in);
        if (skan.hasNextInt())
            dzielna = skan.nextInt();
        if (skan.hasNextInt()) {
            dzielnik = skan.nextInt();
            if (czyDodatnie(dzielnik)) {
                assert dzielnik > 0 : "Dzielnik wynosi: " + dzielnik;
                System.out.println(dzielna/dzielnik);
            }
        }
    }
}