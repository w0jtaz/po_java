package obiektowe2;
import java.time.Month;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.time.LocalDate;

public class Osoba {

    private String imie;
    private String nazwisko;
    private LocalDate dataUrodzenia;
    private int wiek;


    public Osoba(String imie, String nazwisko, int year, int month, int day){
        this.imie = imie;
        this.nazwisko = nazwisko;
        dataUrodzenia = LocalDate.of(year, month, day);
    }

    private int oblicz_wiek(){
        LocalDate aktualnaData = LocalDate.now();
        this.wiek = Period.between(this.dataUrodzenia, aktualnaData).getYears();
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
        return oblicz_wiek();
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setWiek() {
        LocalDate aktualnaData = LocalDate.now();
        this.wiek = Period.between(this.dataUrodzenia, aktualnaData).getYears();
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

    @Override
    public String toString() {
        return "Osoba " +
                imie + " " +
                nazwisko + " " +
                "urodzona " + dataUrodzenia +
                ", wiek " + wiek;
    }
}

class Pracownik extends Osoba{

    private String stanowisko;
    private double pensja;

    public Pracownik(String imie, String nazwisko, int year, int month, int day, String stanowisko, double pensja) {
        super(imie, nazwisko, year, month, day);
        this.stanowisko = stanowisko;
        this.pensja = pensja;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    @Override
    public String toString() {
        return "Osoba " +
                getImie() + " " +
                getNazwisko() + " " +
                "urodzona " + getDataUrodzenia() +
                ", wiek " + getWiek() +
                " jest pracownikiem na stanowisku " + stanowisko +
                " z pensją " + String.format("%.2f", pensja) + "zł ";
    }



}
