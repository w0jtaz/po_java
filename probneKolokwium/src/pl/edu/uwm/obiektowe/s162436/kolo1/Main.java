package pl.edu.uwm.obiektowe.s162436.kolo1;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Osoba osoba1 = new Osoba("Wojtek", "Kowalczyk", 2000, 10, 31);
        System.out.println(osoba1);
        osoba1.getWiek();
        System.out.println(osoba1);

        ArrayList<Osoba> listaOsob = new ArrayList<>();
        ArrayList<Osoba> listaPracownikow = new ArrayList<>();

        Osoba osoba2 = new Osoba("Andrzej", "Grabowski", 1956, 11, 21);
        osoba2.getWiek();
        Osoba osoba3 = new Osoba("Marta", "Traczyk", 1998, 7, 19);
        osoba3.getWiek();

        Pracownik pracownik1 = new Pracownik("Sławek", "Zaremba", 1968, 5, 23, "kierownik", 3700);
        Pracownik pracownik2 = new Pracownik("Arek", "Nowak", 1989, 4, 27, "kierowca", 2980);
        Pracownik pracownik3 = new Pracownik("Tomek", "Koper", 1995, 5, 23, "informatyk", 4100);

        listaOsob.add(osoba1);
        listaOsob.add(osoba2);
        listaOsob.add(osoba3);
        listaOsob.add(pracownik1);
        listaOsob.add(pracownik2);
        listaOsob.add(pracownik3);

        listaPracownikow.add(pracownik1);
        listaPracownikow.add(pracownik2);
        listaPracownikow.add(pracownik3);

        System.out.println("\nLista obiektów : ");
        for (Osoba i : listaOsob)
            System.out.println(i.toString());


    }
}
