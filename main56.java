import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        if (czyParzysta(liczba)) {
            System.out.println("Liczba jest parzysta.");
        } else {
            System.out.println("Liczba nie jest parzysta.");
        }
    }

    public static boolean czyParzysta(int liczba) {
        return liczba % 2 == 0;
    }
}
