package dziedziczenie_abstrakcja_interfejs;

import java.time.LocalDate;

public class Skrzypce extends Instrument {


    public Skrzypce(String producent, LocalDate rokProdukcji, String kosztSkrzypiec) {
        super(producent, rokProdukcji);
    }

    @Override
    public void dzwiek() {

    }

    @Override
    public String toString() {
        return "Skrzypce, " + super.toString();
    }
}
