package pl.edu.uwm.obiektowe.s162436.kolo1;

public class Pracownik extends Osoba{
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
    public String toString()
    {
        return "Osoba "+getImie()+" "+getNazwisko()+" urodzona "+getDataUrodzenia()+" wiek "+getWiek()+" jest pracownikiem na stanowisku "+stanowisko+" z pensją "+String.format("%.2f", pensja)+" zł";
    }

}

