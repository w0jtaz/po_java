package pl.edu.uwm.obiektowe.s162436.lab6;

public class RachunekBankowy {
    static double rocznaStopaProcentowa;
    private double saldo;

    public RachunekBankowy(double saldo) {
        this.saldo = saldo;
    }

    public void obliczMiesieczneOdsetki() {
        double odsetki = (saldo * rocznaStopaProcentowa) / 12;
        saldo = saldo + odsetki;
    }

    public static void setRocznaStopaProcentowa(double rocznaStopaProcentowa) {
        RachunekBankowy.rocznaStopaProcentowa = rocznaStopaProcentowa;
    }

    public double getSaldo() {
        return saldo;
    }
}
