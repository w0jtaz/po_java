package pl.imiajd.kowalczyk;

public class Adres {
    private String ulica;
    private int numer_domu;
    private int numer_mieszkania;
    private String miasto;
    private String kod_pocztowy;

    public Adres(String ulica, int numer_domu, int numer_mieszkania, String miasto, String kod_pocztowy) {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = numer_mieszkania;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public Adres(String ulica, int numer_domu, String miasto, String kod_pocztowy) {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public void pokaz(){
        System.out.print(kod_pocztowy+" "+miasto);
        System.out.print("\n");
        System.out.print(ulica+" "+numer_domu+" "+numer_mieszkania+" "+miasto);
        System.out.print("\n");
    }

    public boolean przed(String kod_pocztowy1, String kod_pocztowy2){
        String kod1New = kod_pocztowy1.replace("-", "");
        String kod2New = kod_pocztowy2.replace("-", "");

        int kod1 = Integer.valueOf(kod1New);
        int kod2 = Integer.valueOf(kod2New);

        if(kod1>kod2) {
            return true;
        }
        else {
            return false;
        }
    }

}
