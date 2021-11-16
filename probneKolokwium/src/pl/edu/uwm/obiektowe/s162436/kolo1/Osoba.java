package pl.edu.uwm.obiektowe.s162436.kolo1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.time.LocalDate;



public class Osoba {
    private String imie;
    private String nazwisko;
    private LocalDate dataUrodzenia;
    private int wiek;

    public Osoba(String imie, String nazwisko, int year, int month, int day){
        this.imie= imie;
        this.nazwisko = nazwisko;
        dataUrodzenia = LocalDate.of(year, month, day);
    }
    private int obliczwiek(){
        LocalDate data = LocalDate.now();
        this.wiek = Period.between(this.dataUrodzenia, data).getYears();
        return wiek;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public int getWiek() {
        LocalDate data = LocalDate.now();
        this.wiek = Period.between(this.dataUrodzenia, data).getYears();
        return wiek;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setDataUrodzenia(int year, int month, int day) {
        boolean dni = LocalDate.of(year, month, day).isAfter(LocalDate.now());
        if(dni == false){
            dataUrodzenia = LocalDate.of(year, month, day);
        }
        else {
            System.out.println("WRONG DATE!");
        }

    }

    public void setWiek(int wiek, LocalDate dataUrodzenia) {
        this.wiek = wiek;
        LocalDate data = LocalDate.now();
        this.dataUrodzenia = dataUrodzenia;
        this.wiek = Period.between(this.dataUrodzenia, data).getYears();
    }
    @Override
    public String toString()
    {
        return "Osoba "+imie+" "+nazwisko+" urodzona "+dataUrodzenia+" wiek "+wiek;
    }

    public static void main(String[] args){

    }

}
