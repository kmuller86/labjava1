import java.util.Scanner;

public class Main3 {
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);


            //ćwiczenie 3 - interfejs wpisywania imienia, nazwiska, nr indeksu i wieku
            System.out.println("Podaj imie: ");
            String imie = scan.next();
            System.out.println("Podaj nazwisko: ");
            String nazwisko = scan.next();
            System.out.println("Podaj wiek: ");
            int wiek = scan.nextInt();
            System.out.println("Podaj numer indeksu: ");
            int nrindeks = scan.nextInt();
            System.out.println("Witaj " + imie + " " + nazwisko + ". Widzę że masz " + wiek + " i " + nrindeks + " to Twój nr indeksu.");

        }
    }


