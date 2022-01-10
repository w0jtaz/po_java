package pl.po.wojciech_kowalczyk;

import java.util.*;

public class Kolekcje {
    public static void redukuj (LinkedList<String> pracownicy, int n) {
        for(int i=n-1; i< pracownicy.size(); i=i+n-1){
            pracownicy.remove(i);
        }
    }
//generyczna metoda redukuj
    public static <T>  void redukuj2 (LinkedList<T> pracownicy, int n) {
        for(int i=n-1; i< pracownicy.size(); i=i+n-1){
            pracownicy.remove(i);
        }
    }

    public static void odwroc (LinkedList<String> lista) {
        Collections.reverse(lista);
    }
//generyczna metoda odwroc
    public static <T> void odwroc2 (LinkedList<T> lista) {
        Collections.reverse(lista);
    }


}


