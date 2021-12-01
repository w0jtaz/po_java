package pl.imiajd.kowalczyk;

import java.time.LocalDate;

class Pracownik extends Osoba {
    private double pobory;
    private LocalDate dataZatrudnienia;
    private LocalDate dataUrodzenia;

    public Pracownik(String nazwisko, String imiona, int yearUrodzenia, int monthUrodzenia, int dayUrodzenia, boolean plec, int yearZatrudnienia, int monthZatrudnienia, int dayZatrudnienia, double pobory)
    {
        super(nazwisko,imiona, yearUrodzenia, monthUrodzenia, dayUrodzenia, plec);
        this.pobory = pobory;
        dataZatrudnienia = LocalDate.of(yearZatrudnienia, monthZatrudnienia, dayZatrudnienia);
        dataUrodzenia = LocalDate.of(yearUrodzenia, monthUrodzenia, dayUrodzenia);
    }

    public double getPobory()
    {
        return pobory;
    }

    public String getOpis()
    {
        return String.format("pracownik z pensją %.2f zł", pobory);
    }

    public LocalDate getDataZatrudnienia() {
        return dataZatrudnienia;
    }
}