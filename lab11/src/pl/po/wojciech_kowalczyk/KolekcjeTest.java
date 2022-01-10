package pl.po.wojciech_kowalczyk;

import pl.po.wojciech_kowalczyk.Kolekcje;

import java.util.*;

public class KolekcjeTest {
    public static void main(String[] args) {
        LinkedList<String> pracownicy = new LinkedList<>();
        pracownicy.add("Wojtek");
        pracownicy.add("Marek");
        pracownicy.add("Waldek");
        pracownicy.add("Tomek");
        pracownicy.add("Paweł");
        pracownicy.add("Kamil");
        pracownicy.add("Adam");
        pracownicy.add("Darek");
        System.out.println(pracownicy);
        Kolekcje.redukuj(pracownicy, 2);
        System.out.println(pracownicy);

        //generyczna metoda redukuj
        Kolekcje.redukuj2(pracownicy, 2);
        System.out.println(pracownicy);

        LinkedList<String> lista = new LinkedList<>();
        lista.add("Jeden");
        lista.add("Dwa");
        lista.add("Trzy");
        lista.add("Cztery");
        System.out.println(lista);
        Kolekcje.odwroc(lista);
        System.out.println(lista);

        //generyczna metoda odwroc
        Kolekcje.odwroc2(lista);
        System.out.println(lista);
    }
}
