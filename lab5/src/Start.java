import java.util.ArrayList;
import java.util.Collections;

public class Start {

    public static void main(String[] args) {

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

        System.out.println(append(a,b)); //zad1
        System.out.println(merge(a,b)); //zad2
        System.out.println(mergeSorted(a,b)); //zad3
        System.out.println(reversed(a)); //zad4

        System.out.println(a);
        reverse(a); //zad5
        System.out.println(a);

    }

    public static ArrayList<Integer> append(ArrayList a, ArrayList b) {
        int dlugosc = a.size() + b.size();
        ArrayList<Integer> c = new ArrayList<Integer>(dlugosc);
            c.addAll(a);
            c.addAll(b);
        return c;
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
        int max_size = Math.max(a.size(), b.size());
        ArrayList<Integer> c = new ArrayList<>(max_size);
        for(int i=0; i<max_size; i++){
            if(i<a.size())
                c.add(a.get(i));
            if(i<b.size())
                c.add(b.get(i));
        }
        return c;
    }
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> c = new ArrayList<>();
        c.addAll(a);
        c.addAll(b);
        Collections.sort(c);
        return c;

    } public static ArrayList<Integer> reversed(ArrayList<Integer> a ){
        ArrayList<Integer> c = new ArrayList<Integer>(a.size());
        for(int i=a.size()-1; i>=0; i--){
            c.add(a.get(i));
        }
        return c;
    }

    public static void reverse(ArrayList<Integer> a ){
        for(int i=a.size()-1; i>=0; i--){
            a.add(a.get(i));
        }
        for(int j=0; j<a.size(); j++){
            a.remove(a.get(j));
        }
    }


}
