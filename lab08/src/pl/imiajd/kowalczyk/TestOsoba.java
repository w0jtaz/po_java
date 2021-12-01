package pl.imiajd.kowalczyk;

public class TestOsoba
{
    public static void main(String[] args)
    {
        Osoba[] ludzie = new Osoba[2];

        ludzie[0] = new Pracownik("Kowalski", "Jan", 1974, 10, 12, true, 2009,10,12, 4000);
        ludzie[1] = new Student("Nowak", "Małgorzata", "informatyka",1997, 5, 14, false, 4.0);
//        ludzie[2] = new Osoba("Kowalczyk", "Wojciech", 2000,10,31, true) {
//
//            @Override
//            public String getOpis() {
//                return null;
//            }
//        };

        for (Osoba p : ludzie) {
            System.out.println(p.getNazwisko() + ": " + p.getOpis());
        }
    }
}