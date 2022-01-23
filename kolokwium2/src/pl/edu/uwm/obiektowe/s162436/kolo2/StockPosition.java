package pl.edu.uwm.obiektowe.s162436.kolo2;

import java.util.Objects;

public class StockPosition<T, V>{
    private  T ob1;
    private V ob2;

    public StockPosition(T t, V v){
        this.ob1 = t;
        this.ob2 = v;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockPosition<?, ?> that = (StockPosition<?, ?>) o;
        return Objects.equals(ob1, that.ob1) && Objects.equals(ob2, that.ob2);
    }

    public double getValue(){

        return 0;
    }
}