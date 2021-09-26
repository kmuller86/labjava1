import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */
        int wiek = 27;
        if (wiek%3 == 0 ){
            System.out.println("Twoj wiek jest podzielny przez 3");
        }
        else {
            System.out.println("Twoj wiek nie jest podzielny przez 3");
        }

        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */

        String tekst = wiek/2 ==0 ? "Wiek jest podzielny przez 2" : "Wiek nie jest podzielny przez 2";
        System.out.println(tekst);
        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */

        System.out.println("Podaj liczbe zmiennoprzecinkową");
        double liczba = scan.nextDouble();
        if (liczba > 5){
            int wynik1 = (int)(liczba/liczba);
            double wynik2 = liczba - (double)wynik1;
            System.out.println("Liczba jest wieksza od 5 i po przecinku jest: " +wynik2);
        }
        else{
            System.out.println("Liczba jest mniejsza od 5");
        }
    }
}
