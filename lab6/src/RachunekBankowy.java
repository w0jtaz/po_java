public class RachunekBankowy{
    private double Saldo;


    public void setRocznaStopaProcentowa(double rocznaStopaProcentowa) {
        this.rocznaStopaProcentowa = rocznaStopaProcentowa;
    }

    double rocznaStopaProcentowa;

    double ObliczMiesieczneOdsetki(double Saldo, double rocznaStopaProcentowa){
        return (Saldo*rocznaStopaProcentowa)/12;
    }
    public static void main(String[] args) {
        RachunekBankowy saver1 = new RachunekBankowy();
        saver1.Saldo=2000;
        RachunekBankowy saver2 = new RachunekBankowy();
        saver2.Saldo=3000;

        System.out.println(saver1.Saldo);
        saver1.setRocznaStopaProcentowa(0.04);
        saver1.Saldo += saver1.ObliczMiesieczneOdsetki(saver1.Saldo, saver1.rocznaStopaProcentowa);
        System.out.println(saver1.Saldo);

        System.out.print('\n');

        System.out.println(saver2.Saldo);
        saver2.setRocznaStopaProcentowa(0.04);
        saver2.Saldo += saver2.ObliczMiesieczneOdsetki(saver2.Saldo, saver2.rocznaStopaProcentowa);
        System.out.println(saver2.Saldo);

    }

}
