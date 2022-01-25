package pl.edu.uwm.obiektowe.s162436.kolo2;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Stack;

public class NewStock extends Stock implements IListable{
    LinkedList<StockPosition> positions = new LinkedList<>();

    @Override
    public double getTotalValue(){
        double totalValue = 0;
        for (StockPosition _sp: this.positions) {
            totalValue += _sp.getValue();
        }
        return totalValue - (totalValue* this.discount);
    }

    public void addPosition(StockPosition sp) {
        this.positions.add(sp);
        this.addProduct(sp.getProduct());
    }

    @Override
    public Stack<Product> getSortedByValue(boolean ascending) {
        LinkedList<StockPosition> positionCopy = (LinkedList<StockPosition>) this.positions.clone();
        if(ascending){
            Collections.sort(positionCopy);}
        else{
            Collections.sort(positionCopy, Comparator.reverseOrder());}
        return null;
    }
}
