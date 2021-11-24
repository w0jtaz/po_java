package pl.imiajd.kowalczyk;

public class TestKlasImetod {
    public static void main(String[] args)
    {
        //test klas osoba, student, nauczyciel
        Osoba osoba = new Osoba("kowalczyk",2000);
        System.out.println(osoba);

        Student student = new Student("kowalczyk", 2000, "ISI");
        System.out.println(student);

        Nauczyciel nauczyciel = new Nauczyciel("Doliwa", 1965, 8000);
        System.out.println(nauczyciel);

        //test klasy adres
        Adres adres1 = new Adres("Leśna", 6, "Susz", "14-240");
        adres1.pokaz();

        Adres adres2 = new Adres("Leśna", 6, 2, "Susz", "14-240");
        adres2.pokaz();

        System.out.println(adres1.przed("14-248","14-241"));
        System.out.println(adres1.przed("14-240","14-241"));
    }
}
