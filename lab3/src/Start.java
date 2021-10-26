import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Start {

    public static void generuj(int[] tab, int n, int min, int max) {
        Random rd = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = rd.nextInt(max - min + 1) + min;
            Arrays.sort(tab);
        }
    }

    public static void wypisz(int[] tab) {
        for (int i = 0; i <= tab.length - 1; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println("\n");
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbę n: ");
        Integer n = scan.nextInt();
        Integer x = 0;
        if (n >= 1 && n <= 100) {
            x = n;
        } else {
            System.out.println("Podaj liczbę n z zakresu 1 <= n <= 100 !!!");
        }

        int[] tablica = new int[x];

        generuj(tablica, n, -999, 999);
        wypisz(tablica);
        System.out.println("Ilość liczb nieparzystych:  " + ileNieparzystych(tablica));
        System.out.println("Ilość liczb parzystych: " + ileParzystych(tablica));
        System.out.println("Ilość liczb dodatnich: " + ileDodatnich(tablica));
        System.out.println("Ilość liczb ujemnych:  " + ileUjemnych(tablica));
        System.out.println("Ilość liczb zerowych: " + ileZerowych(tablica));
        System.out.println("maksymalna = " + Maksymalne(tablica));
        System.out.println("ilosc maksymalnych = " + ileMaksymalnych(tablica));
        System.out.println("Suma liczb dodatnich: " + sumaDodatnich(tablica));
        System.out.println("Suma liczb ujemnych: " + sumaUjemnych(tablica));
        System.out.println("Długość maksymalna ciągu dodatnich: " + dlugoscMaksymalnegoCiaguDodatnich(tablica));
        odwrocFragment(tablica, 2,3 );
        wypisz(tablica);
        signum(tablica);
        wypisz(tablica);

    }

    public static int ileNieparzystych(int tab[]) {
        int licznik = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 != 0) {
                licznik++;
            }
        }
        return licznik;
    }

    public static int ileParzystych(int tab[]) {
        int licznik = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {
                licznik++;
            }
        }
        return licznik;
    }

    public static int ileDodatnich(int tab[]) {
        int licznik = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0) {
                licznik++;
            }
        }
        return licznik;
    }

    public static int ileUjemnych(int tab[]) {
        int licznik = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0) {
                licznik++;
            }
        }
        return licznik;
    }

    public static int ileZerowych(int tab[]) {
        int licznik = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == 0) {
                licznik++;
            }
        }
        return licznik;
    }

    public static int Maksymalne(int tab[]) {
        int max = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        return max;
    }

    public static int ileMaksymalnych(int tab[]) {
        int licznik = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == Maksymalne(tab)) {
                licznik++;
            }
        }
        return licznik;
    }

    public static int sumaDodatnich(int tab[]) {
        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0) {
                suma += tab[i];
            }
        }
        return suma;
    }

    public static int sumaUjemnych(int tab[]) {
        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0) {
                suma += tab[i];
            }
        }
        return suma;
    }

    public static int dlugoscMaksymalnegoCiaguDodatnich(int tab[]) {
        int licznik = 0;
        int maks = tab.length;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0) {
                licznik += 1;
            } else if (licznik > maks) {
                maks = licznik;
                licznik = 0;
            } else {
                licznik = 0;
            }

        }
        return licznik;
    }

    public static void signum(int tab[]) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0)
                tab[i] = -1;
            else if (tab[i] > 0)
                tab[i] = 1;
            else if (tab[i] == 0)
                tab[i] = 0;
        }
    }

    public static void odwrocFragment(int[] tab, int lewy, int prawy) {
        if ((lewy > 0) || (lewy < tab.length - 1) || (prawy > 0) || (prawy < tab.length - 1)) {
            int tab2[] = new int[prawy - lewy + 1];
            if (prawy + 1 - lewy >= 0)
                System.arraycopy(tab, lewy, tab2, 0, prawy - lewy + 1);
            for (int x = lewy; x < prawy + 1; x++) {
                tab[x] = tab2[prawy - x];
            }
        } else {
            System.out.println("Błędne parametry!\n");
        }
    }
}

