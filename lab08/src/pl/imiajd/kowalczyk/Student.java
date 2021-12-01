package pl.imiajd.kowalczyk;

import java.time.LocalDate;

class Student extends Osoba {
    private String kierunek;
    private double sredniaOcen;
    private LocalDate dataUrodzenia;

    public Student(String nazwisko, String imiona, String kierunek, int yearUrodzenia, int monthUrodzenia, int dayUrodzenia, boolean plec, double sredniaOcen)
    {
        super(nazwisko,imiona, yearUrodzenia, monthUrodzenia, dayUrodzenia,plec);
        this.kierunek = kierunek;
        this.sredniaOcen = sredniaOcen;
        dataUrodzenia = LocalDate.of(yearUrodzenia, monthUrodzenia, dayUrodzenia);
    }

    public String getOpis()
    {
        return "kierunek studiów: " + kierunek;
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }
}
