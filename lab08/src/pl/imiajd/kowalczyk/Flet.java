package pl.imiajd.kowalczyk;

import java.time.LocalDate;

public class Flet extends Instrument{
    LocalDate rokProdukcji;
    public Flet(String producent, int year, int day){
        super(producent, year, day);
        rokProdukcji = LocalDate.ofYearDay(year, day);
    }

    @Override
    void dzwiek() {

    }
}
