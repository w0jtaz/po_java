package pl.edu.uwm.obiektowe.s162436;


public class Liczba <T extends Number> implements Comparable<Liczba<T>> {
    private T value;

    public Liczba(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public int compareTo(Liczba obj){
        return Double.compare(obj.value.doubleValue(), value.doubleValue());
    }

}
