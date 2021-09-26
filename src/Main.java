import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int liczba = scan.nextInt();
        System.out.println("Podaj druga liczbę: ");
        int liczba2 = scan.nextInt();
        if (liczba%2 == 0){
            System.out.println("Twoja liczba jest parzysta.");
        }
        else {
            System.out.println("Twoja liczba jest nieparzysta.");
        }
        if (liczba%10 == 0){
            System.out.println("Twoja liczba jest podzielna przez dziesięć.");
        }
        int wynikdod = liczba + liczba2;
        int wynikode = liczba - liczba2;
        int wynikmno = liczba * liczba2;
        int wynikdzi = liczba/liczba2;
        System.out.println("Twoje wyniki działań na liczbach to: Dodawanie: " + wynikdod + " Odejmowania: " +wynikode + " Mnozenia: " + wynikmno + " Dzielenia: " + wynikdzi);


    }
}
