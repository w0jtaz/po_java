package pl.edu.uwm.obiektowe.s162436;

public interface IMozeCofac {
    default void cofaj() {
        System.out.println("Uwaga, cofam...");
    }
}
