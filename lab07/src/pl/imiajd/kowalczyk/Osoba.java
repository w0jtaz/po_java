package pl.imiajd.kowalczyk;

public class Osoba {
    private String nazwisko;
    private int rok_urodzenia;

    public Osoba(String nazwisko, int rok_urodzenia) {
        this.nazwisko = nazwisko;
        this.rok_urodzenia = rok_urodzenia;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getRok_urodzenia() {
        return rok_urodzenia;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "nazwisko='" + nazwisko + '\'' +
                ", rok_urodzenia=" + rok_urodzenia +
                '}';
    }
}
