package pl.edu.uwm.obiektowe.s162436.lab6;

import java.util.ArrayList;
import java.lang.reflect.Array;
import java.util.*;

public class IntegerSet extends ArrayList<Integer> {
    private final ArrayList<Integer> tablica;

    public IntegerSet(ArrayList<Integer> tablica){
        this.tablica= tablica;
    }

    public static ArrayList<Integer> union(ArrayList<Integer> tablica1, ArrayList<Integer> tablica2) {
        ArrayList<Integer> tablica3 = new ArrayList<>();
        tablica3.addAll(tablica1);
        tablica3.addAll(tablica2);
        return tablica3;
    }

    public static ArrayList<Integer> intersection(ArrayList<Integer> tablica1, ArrayList<Integer> tablica2) {
        ArrayList<Integer> tablica3 = new ArrayList<>();
        for(Integer e : tablica1){
            if(tablica2.contains(e))
                tablica3.add(e);
        }
        return tablica3;
    }

    public void insertElement(Integer element){
        tablica.add(element);
    }

    public void deleteElement(Integer element){
        tablica.remove(element);
    }

    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder();
        for (Integer integer : tablica) {
            temp.append(integer).append(" ");
        }
        return temp.toString();
    }

}
