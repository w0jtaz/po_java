import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Start {
    public static int ileNieparzystych(int [] tab){
        int licznik =0;
        for (int i = 0; i < tab.length; i++) {
            if(tab[i]%2!=0){
                licznik++;
            }
        }
        return licznik;

    }



    public static void generuj (int[] tab, int n, int min, int max) {
        Random rd = new Random();
        int[] tablica = new int[n];
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = rd.nextInt(max-min+1) + min;
            Arrays.sort(tablica);
            System.out.print(tablica[i] +" ");
        }
    }

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbę n: ");
        Integer n = scan.nextInt();
        Integer x = 0;
        if (n>=1 && n<=100) {
            x = n;
        }
        else {
            System.out.println("Podaj liczbę n z zakresu 1 <= n <= 100 !!!");
        }
       int[] tablica = new int[x];
        System.out.println(tablica);


        generuj (tablica, n, -999, 999);
        System.out.println(ileNieparzystych(tablica));




    }

    }


