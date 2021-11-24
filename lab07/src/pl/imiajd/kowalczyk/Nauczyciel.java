package pl.imiajd.kowalczyk;

public class Nauczyciel extends Osoba{
    private double pensja;

    public Nauczyciel(String nazwisko, int rok_urodzenia, double pensja) {
        super(nazwisko, rok_urodzenia);
        this.pensja = pensja;
    }

    public double getPensja() {
        return pensja;
    }

    @Override
    public String toString() {
        return super.toString()+ "Nauczyciel{" +
                "pensja=" + pensja +
                '}';
    }
}
