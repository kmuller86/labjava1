import java.util.Scanner;
//cwiczenie 4
public class Main4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe 0-10");
        String text = "A podzielona przez 7 to: ";
        int liczba = scan.nextInt();
        int x;
        if (liczba %2 == 0){
            System.out.println("Twoja liczba jest parzysta");
            x= liczba/7;
            System.out.println(text + x);
        }
        else {
            System.out.println("Twoja liczba jest nieparzysta");
            x = liczba/7;
            System.out.println(text + x);
        }
    }
}
