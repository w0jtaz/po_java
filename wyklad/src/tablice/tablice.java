package tablice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class tablice {

    // funkcja generujaca pseudolosowe liczby
    public static void generuj (long tab[], int max) {
        Random r = new Random();
        for(int i=0; i<tab.length; ++i){
            tab[i]=r.nextInt(max);

        }
    }
    // funkcja wypisujaca elementy naszej tablicy
    public static void wypisz (long tab[]){
        for(int j=0; j<tab.length; j++) {  // NALEZY ZAMIENIC ZWYKLEGO FORA NA ENHANCED FORA -- SZYBSZY ZAPIS
            System.out.println(tab[j] + " ");
        }
    }

    public static void main(String[] args) {

        long t1[] = new long[16];

        System.out.println("t1 : ");
        wypisz(t1);

        generuj(t1, 50);

        System.out.println("t1 po wylosowaniu elementow: ");
        wypisz(t1);

        t1 = new long[10];

        generuj(t1, 1700);

        System.out.println("t1 po zmniejszeniu tablicy i wylosowaniu nowych elementow: ");
        wypisz(t1);

        System.out.println("elementy tablicy mozna wypisac takze przy pomocy gotowej funkcji z klasy Arrays : ");
        System.out.println(Arrays.toString(t1));

        // KOPIOWANIE TABLIC
        // przykladowo long t2[] = t1 nie zadziała prawidłowo - tj. tylko w t2 odwolamy sie do tej samej tablicy
        // dlatego aby utworzyc totalnie nową tablice bazujaca na innej - trzeba wykorzystac metode

        long t2[] = new long[2 * t1.length];
        System.arraycopy(t1, 0, t2, 0, t1.length);

        System.out.println("t2:  ");
        wypisz(t2);

        // SORTOWANIE
        Arrays.sort(t2);
        System.out.println("t2 po posortowaniu:  ");
        wypisz(t2);

    }
}
