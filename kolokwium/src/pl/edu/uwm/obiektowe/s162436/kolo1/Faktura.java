package pl.edu.uwm.obiektowe.s162436.kolo1;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDate;




public class Faktura{
    private String numer;
    private LocalDate dataWystawienia;
    private int terminPlatnosciDni;
    LocalDate dataTerminuPlatnosci;
    ArrayList<Pozycja> Pozycje = new ArrayList<>();



    public Faktura(String numer, int year, int month, int day, int terminPlatnosciDni) {
        this.numer = numer;
        dataWystawienia = LocalDate.of(year, month, day);
        this.terminPlatnosciDni = terminPlatnosciDni;
    }

    public String getNumer() {
        return numer;
    }

    public LocalDate getDataWystawienia() {
        return dataWystawienia;
    }

    public void setDataWystawienia(LocalDate dataWystawienia) {
        this.dataWystawienia = dataWystawienia;
    }

    public int getTerminPlatnosciDni() {
        return terminPlatnosciDni;
    }

    public void setTerminPlatnosciDni(int terminPlatnosciDni) {
        this.terminPlatnosciDni = terminPlatnosciDni;
    }

    public LocalDate wyswietlTerminPlatnosci(){
        this.dataTerminuPlatnosci = dataWystawienia.plusDays(getTerminPlatnosciDni());
        return dataTerminuPlatnosci;

    }

    @Override
    public String toString(){
        return "Faktura o numerze "+numer+" wystawiona dnia: "+dataWystawienia+", data terminu płatności: "+dataTerminuPlatnosci;
    }
    public void dodajPozycje(Pozycja p){
        Pozycje.add(p);
    }

    public void usunPozycje(int numer){
        Pozycje.remove(numer);
    }

    public void usunPozycje(Pozycja p){
        Pozycje.remove(p);
    }

    public double getWartosc(){
        return 0; //problem z odwołaniem do pól klasy pozycja
    }

    public void wypiszFakture(){
        System.out.println(Pozycje);
    }


}
