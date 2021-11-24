package pl.imiajd.kowalczyk;

public class Student extends Osoba{
    private String kierunek;

    public Student(String nazwisko, int rok_urodzenia, String kierunek) {
        super(nazwisko, rok_urodzenia);
        this.kierunek = kierunek;
    }

    public String getKierunek() {
        return kierunek;
    }

    @Override
    public String toString() {
        return super.toString()+ "Student{" +
                "kierunek='" + kierunek + '\'' +
                '}';
    }
}
