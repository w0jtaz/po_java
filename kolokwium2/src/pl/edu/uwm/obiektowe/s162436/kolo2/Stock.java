package pl.edu.uwm.obiektowe.s162436.kolo2;

import java.util.ArrayList;

public class Stock {

    ArrayList<Product> product = new ArrayList<Product>();


    public ArrayList<Product> getProduct() {
        return product;
    }

    public void setProduct(ArrayList<Product> product) {
        this.product = product;
    }

    float discount = 0;

    public void addProduct(Product p) {
        product.add(p);
    }

    public void applyDiscount(float d){
        this.discount = d;
    }

    public void getTotalValue(){
        System.out.println(product);
    }

    @Override
    public String toString() {
        return "Stock{" +
                "product=" + product +
                ", discount=" + discount +
                '}';
    }
}
