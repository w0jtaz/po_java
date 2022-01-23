package pl.edu.uwm.obiektowe.s162436.kolo2;

import java.util.LinkedList;
import java.util.Stack;

public class NewStock extends Stock implements IListable{
    LinkedList<StockPosition> positions;


    @Override
    public Stack<Product> getSortedByValue(boolean ascending) {
        return null;
    }
}
