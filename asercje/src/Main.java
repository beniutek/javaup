import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Podaj liczbę mniejszą niż 10: ");
        Scanner sc = new Scanner(System.in);
        int liczba = 0;
        if(sc.hasNextInt())
        {
            liczba = sc.nextInt();
        }
        assert liczba < 10: "i >= 10";
        System.out.printf("i = %d\n", liczba);
    }
}
