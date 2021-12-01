package pl.imiajd.kowalczyk;

import java.time.LocalDate;
import java.util.Objects;

abstract class Instrument {
    private String producent;
    private LocalDate rokProdukcji;

    public Instrument(String producent, int year, int day) {
        this.producent = producent;
        rokProdukcji = LocalDate.ofYearDay(year, day);
    }

    public String getProducent() {
        return producent;
    }

    public LocalDate getRokProdukcji() {
        return rokProdukcji;
    }

    abstract void dzwiek();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instrument that = (Instrument) o;
        return Objects.equals(producent, that.producent) && Objects.equals(rokProdukcji, that.rokProdukcji);
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "producent='" + producent + '\'' +
                ", rokProdukcji=" + rokProdukcji +
                '}';
    }
}

