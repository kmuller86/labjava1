import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */
            int liczba = 6;
            float floa1 = 5.67f;
            char litera = 'D';
            boolean mojBool = true;
            long mojLong = 1908354123L;
            String tekst = "Dzień dobry, moje dane to: ";
            String przeci = ", ";
        System.out.println(tekst + liczba +przeci+ floa1 + przeci+ litera +przeci+  mojBool +przeci+ mojLong);
        /*
        *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        *  */
        int liczbaA = 5;
        int liczbaB = 6;
        double liczbaX = 3.232;
        double liczbaY = 4.231;

        int wynikdod = liczbaA + liczbaB;
        double wynikdoda = liczbaX + liczbaY;

        int wynikode = liczbaA - liczbaB;
        double wynikodej = liczbaX - liczbaY;
        int wynikmno = liczbaA * liczbaB;
        double wynikmnoz = liczbaX * liczbaY;
        int wynikdzi = liczbaA / liczbaB;
        double wynikdzie = liczbaX / liczbaY;

        String wynik = "Twoje wyniki to: ";
        System.out.println("Twoje liczby to: " + liczbaA + przeci + liczbaB + przeci + liczbaX + przeci + liczbaY);
        System.out.println(wynik + "Dodawanie: " + wynikdod + przeci + wynikdoda + przeci + "Odejmowanie: " + wynikode + przeci + wynikodej + przeci +"Mnozenie: " + przeci + wynikmno + przeci + wynikmnoz + przeci + "Dzielenie: " +przeci+wynikdzi+ przeci+wynikdzie);




    }

}
