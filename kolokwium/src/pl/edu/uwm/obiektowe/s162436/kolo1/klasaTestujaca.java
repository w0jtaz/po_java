package pl.edu.uwm.obiektowe.s162436.kolo1;

import java.util.ArrayList;

public class klasaTestujaca {
    public static void main(String[] args) {
        Faktura faktura1 = new Faktura("1111", 2021, 11, 1, 12);
        Faktura faktura2 = new Faktura("2222", 2021, 10, 20, 30);
        Pozycja pozycja1 = new Pozycja("masło",3.5,23/100,10);
        Pozycja pozycja2 = new Pozycja("chleb",2.5,23/100,10);
        Pozycja pozycja3 = new Pozycja("woda",2,23/100,10);
        Pozycja pozycja4 = new Pozycja("banany",4,23/100,10);
        Pozycja pozycja5 = new Pozycja("cola",3.6,23/100,10);

        System.out.println(faktura1);
        faktura1.wyswietlTerminPlatnosci();
        System.out.println(faktura1);

        System.out.println(faktura2);
        faktura2.wyswietlTerminPlatnosci();
        System.out.println(faktura2);

        faktura1.dodajPozycje(pozycja1);
        faktura1.dodajPozycje(pozycja2);
        faktura1.dodajPozycje(pozycja3);
        faktura1.dodajPozycje(pozycja4);
    }
}
