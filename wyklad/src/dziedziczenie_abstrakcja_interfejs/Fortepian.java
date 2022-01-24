package dziedziczenie_abstrakcja_interfejs;

import java.time.LocalDate;

public class Fortepian extends Instrument{

    public Fortepian(String producent, LocalDate rokProdukcji, String kosztFortepianu) {
        super(producent, rokProdukcji);
    }

    @Override
    public void dzwiek() {

    }

    @Override
    public String toString() {
        return "Fortepian, " + super.toString();
    }
}
