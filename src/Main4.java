import java.util.Scanner;

public class Main4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe 0-10");
        int liczba = scan.nextInt();
        if (liczba %2 == 0){
            System.out.println("Twoja liczba jest parzysta");
        }
        else {
            System.out.println("Twoja liczba jest nieparzysta");
        }
    }
}
