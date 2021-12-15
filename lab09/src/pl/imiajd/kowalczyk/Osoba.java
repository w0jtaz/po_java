package pl.imiajd.kowalczyk;

import java.time.LocalDate;
import java.util.Objects;

public class Osoba implements Cloneable, Comparable<Osoba> {
    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba(String nazwisko, int yearUrodzenia, int monthUrodzenia, int dayUrodzenia)
    {
        this.nazwisko = nazwisko;
        dataUrodzenia = LocalDate.of(yearUrodzenia, monthUrodzenia, dayUrodzenia);
    }

    @Override
    public int compareTo(Osoba o) {
        this.nazwisko.equals(o.nazwisko);
        this.dataUrodzenia.equals(o.dataUrodzenia);
        this.nazwisko.compareTo(o.nazwisko);
        return 0;
    }

    @Override
    public String toString() {
        return "Osoba "+"["+nazwisko+"] "+dataUrodzenia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        Osoba other = (Osoba) o;
        if (nazwisko == null) {
            if (other.nazwisko != null)
                return false;
        } else if (!nazwisko.equals(other.nazwisko))
            return false;
        if (dataUrodzenia != other.dataUrodzenia)
            return false;
        return true;
    }
}
