import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj slowo: ");
        String tekst = scan.next();

        System.out.println("Podaj liczbę: ");
        int liczba = scan.nextInt();
        System.out.println(tekst);
        System.out.println(liczba);
    }
}
