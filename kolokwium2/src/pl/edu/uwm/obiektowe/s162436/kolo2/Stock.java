package pl.edu.uwm.obiektowe.s162436.kolo2;

import java.util.ArrayList;

public class Stock {

    ArrayList<Product> product = new ArrayList<>();
    float discount = 0.0f;


    public ArrayList<Product> getProduct() {
        return product;
    }

    public void setProduct(ArrayList<Product> product) {
        this.product = product;
    }


    public boolean addProduct(Product p) {
        for(Product _p: this.product){
            if(_p.getId() == p.getId()) {
                return false;
            }
        }
        product.add(p);
        return true;
    }

    public void applyDiscount(float _discount){
        if(this.discount + _discount > 0.5) {
            System.out.println("Nie można dodać rabatu");
            return;
        }
        this.discount += _discount;
    }

    public double getTotalValue(){
        double totalValue = 0;
        for (Product _p: this.product) {
            totalValue += _p.getPrice();
        }
        return totalValue - (totalValue*this.discount);
    }

    @Override
    public String toString() {
        return "Stock{" +
                "product=" + product +
                ", discount=" + discount +
                '}';
    }
}
