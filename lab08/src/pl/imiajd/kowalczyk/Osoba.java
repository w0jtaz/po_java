package pl.imiajd.kowalczyk;

import java.time.LocalDate;

abstract class Osoba
{
    private String nazwisko;
    private String imiona;
    private LocalDate dataUrodzenia;
    private boolean plec;

    public Osoba(String nazwisko, String imiona, int yearUrodzenia, int monthUrodzenia, int dayUrodzenia, boolean plec)
    {
        this.nazwisko = nazwisko;
        this.imiona = imiona;
        dataUrodzenia = LocalDate.of(yearUrodzenia, monthUrodzenia, dayUrodzenia);
        this.plec = plec;
    }

    public abstract String getOpis();

    public String getNazwisko()
    {
        return nazwisko;
    }

    public String getImiona() {
        return imiona;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public boolean isPlec() {
        return plec;
    }
}
