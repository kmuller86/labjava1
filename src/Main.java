import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();
        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */
        double[] tablica= new double[5];
        for (int i = 0; i<=4; i++){
            tablica[i] = rnd.nextDouble();

        }
        for (int i = 0; i<=4; i++){
            System.out.println(tablica[i]);
        }

    }
}
