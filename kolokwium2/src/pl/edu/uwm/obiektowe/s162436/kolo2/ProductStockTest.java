package pl.edu.uwm.obiektowe.s162436.kolo2;

import java.util.ArrayList;

public class ProductStockTest{


    public static void main(String[] args) {
        Stock stock = new Stock();
        Book book1 = new Book("Harry Potter", 12345, 45, "abcd1234", "Autor1");
        Book book2 = new Book("Mały Książe", 54321, 35, "54321abcd", "Autor2");
        VideoGame game1 = new VideoGame("Postal 2", 321456, 90, "gatunek1", "studio1", 16);
        VideoGame game2 = new VideoGame("Mario", 123567, 70, "gatunek2", "studio2", 3);

        stock.addProduct(book1);
        stock.addProduct(book2);
        stock.getTotalValue();
        stock.applyDiscount(0.15f);
        stock.getTotalValue();
        stock.applyDiscount(0.30f);
        stock.getTotalValue();

        stock.addProduct(game1);
        stock.addProduct(game2);


        System.out.println(stock.toString());




    }
}
