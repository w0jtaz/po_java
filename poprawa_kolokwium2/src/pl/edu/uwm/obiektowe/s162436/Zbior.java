package pl.edu.uwm.obiektowe.s162436;

import java.util.ArrayList;

public class Zbior {
    private ArrayList<Liczba<? extends Number>> liczby;

    public Zbior() {
        this.liczby = new ArrayList<>();
    }

    public final boolean dodajLiczbe(Liczba l){
        for (Liczba _l: this.liczby) {
            if(_l.getValue() == l.getValue()) {
                return false;
            }
        }
        liczby.add(l);
        return true;
    }

    public ArrayList<Liczba<? extends Number>> getLiczby() {
        return liczby;
    }


}
