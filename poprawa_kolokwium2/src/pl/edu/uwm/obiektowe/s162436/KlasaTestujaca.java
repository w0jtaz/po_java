package pl.edu.uwm.obiektowe.s162436;

import java.util.Stack;

public class KlasaTestujaca {
    public static void main(String[] args) {
        Osobowy Fabia = new Osobowy("Fabia",Producent.SKODA);
        Fabia.jedzDoPrzodu();
        Fabia.cofaj();
        Fabia.uzyjKlaksonu();
        System.out.println(Fabia);

        Stack<Liczba<? extends Number>> stack= new Stack<>();
        stack.push(new Liczba<>(15));
        stack.push(new Liczba<>((double)0.7f));
        stack.push(new Liczba<>((float)1.8));
        stack.push(new Liczba<>((long)900));
        stack.push(new Liczba<>((short)1200));

        Zbior zbior = new Zbior();

        do {
            zbior.dodajLiczbe(stack.pop());
        } while(!stack.empty());

        for (Liczba l: zbior.getLiczby()) {
            System.out.println(l.getValue());
        }

    }
}
