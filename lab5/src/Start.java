import java.lang.StringBuffer;
import java.util.Scanner;
import java.util.ArrayList;

public class Start {

    public static void main(String[] args) {

        //zadanie1
        ArrayList<Integer> a = new ArrayList<Integer>(5);
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);

        ArrayList<Integer> b = new ArrayList<Integer>(5);
        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);

        System.out.println(a);
        System.out.println(b);
        System.out.println(append(a,b));
        System.out.println(merge(a,b));




    }

    public static ArrayList<Integer> append(ArrayList a, ArrayList b) {
        int dlugosc = a.size() + b.size();
        ArrayList<Integer> c = new ArrayList<Integer>(dlugosc);
            c.addAll(a);
            c.addAll(b);
        return c;
    }

    public static ArrayList<Integer> merge(ArrayList a, ArrayList b) {
        int dlugosc = a.size() + b.size();
        ArrayList<Integer> c = new ArrayList<Integer>(dlugosc);
        //dokończyć


        return c;
    }
}
