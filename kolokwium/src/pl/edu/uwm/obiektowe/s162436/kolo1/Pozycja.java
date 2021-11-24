package pl.edu.uwm.obiektowe.s162436.kolo1;

public class Pozycja {
    String nazwa;
    double cenaJednostkowa;
    float stawkaVat;
    float ilosc;
    double wartosc;


    public Pozycja(String nazwa, double cenaJednostkowa, float stawkaVat, float ilosc) {
        this.nazwa = nazwa;
        this.cenaJednostkowa = cenaJednostkowa;
        this.stawkaVat = stawkaVat;
        this.ilosc = ilosc;
    }

    public double getWartosc() {
        this.wartosc = this.ilosc*this.cenaJednostkowa*this.stawkaVat;
        return wartosc;
    }

}
