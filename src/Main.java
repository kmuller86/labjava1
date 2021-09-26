import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */
        System.out.println("Podaj imie: ");
        String imie = scan.next();
        System.out.println("Podaj nazwisko: ");
        String nazwisko = scan.next();
        System.out.println("Podaj wiek: ");
        int wiek = scan.nextInt();
        System.out.println("Podaj numer indeksu: ");
        int nrindeks = scan.nextInt();
        System.out.println("Witaj " + imie + " " + nazwisko + ". Widzę że masz " + wiek + " i " + nrindeks + " to Twój nr indeksu.");

        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */

        int x = 5;
        int y = 7;
        int wynikdod = x+y;
        int wynikode = x - y;
        int wynikmno = x*y;
        int wynikdzi = x/y;
        System.out.println("Wyniki to: Dodawanie: " + wynikdod + " Odejmowanie: " + wynikode + " Mnozenie: " + wynikmno + " Dzielenie: " + wynikdzi);

    }
}
