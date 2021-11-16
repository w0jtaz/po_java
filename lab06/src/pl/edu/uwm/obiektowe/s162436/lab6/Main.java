package pl.edu.uwm.obiektowe.s162436.lab6;

import java.util.ArrayList;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

        public static void main(String[] args) {

            //zadanie1
            //Test klasy RachunekBankowy
            RachunekBankowy saver1 = new RachunekBankowy(2000);
            RachunekBankowy saver2 = new RachunekBankowy(3000);
            RachunekBankowy.setRocznaStopaProcentowa(0.04);
            saver1.obliczMiesieczneOdsetki();
            saver2.obliczMiesieczneOdsetki();
            System.out.println("Saldo saver1: "+saver1.getSaldo());
            System.out.println("Saldo saver2: "+saver2.getSaldo());

            //podnosimy RocznaStopaProcentowa do 5%
            RachunekBankowy.setRocznaStopaProcentowa(0.05);
            saver1.obliczMiesieczneOdsetki();
            saver2.obliczMiesieczneOdsetki();
            System.out.println("Saldo saver1: "+saver1.getSaldo());
            System.out.println("Saldo saver2: "+saver2.getSaldo());


            //zadanie2
            ArrayList<Integer> tablica1 = new ArrayList<>(3);

            tablica1.add(2);
            tablica1.add(7);
            tablica1.add(99);


            System.out.println("Tablica 1: ");
            System.out.println(tablica1);

            ArrayList<Integer> tablica2 = new ArrayList<>(3);

            tablica2.add(8);
            tablica2.add(24);
            tablica2.add(3);


            System.out.println("Tablica 2: ");
            System.out.println(tablica2);

            ArrayList<Integer> tablica3;
            tablica3 = IntegerSet.union(tablica1, tablica2);

            System.out.println("Tablica 1 i tablica 2 UNION : ");
            System.out.println(tablica3);

            //intersection
            ArrayList<Integer> tablica4 = new ArrayList<>(3);

            tablica4.add(6);
            tablica4.add(48);
            tablica4.add(35);


            System.out.println("Tablica 4: ");
            System.out.println(tablica4);

            ArrayList<Integer> tablica5 = new ArrayList<>(3);

            tablica5.add(6);
            tablica5.add(48);
            tablica5.add(1);


            System.out.println("Tablica 5: ");
            System.out.println(tablica5);

            ArrayList<Integer> tablica6;
            tablica6 = IntegerSet.intersection(tablica4, tablica5);

            System.out.println("Tablica 4 i tablica 5 INTERSECTION: ");
            System.out.println(tablica6);

            //INSERT TEST
            IntegerSet list7 = new IntegerSet(new ArrayList<>());
            System.out.println("\nLIST7 : ");
            list7.insertElement(24);
            list7.insertElement(48);
            list7.insertElement(44);
            list7.insertElement(77);
            list7.insertElement(44);
            System.out.println("\nLIST7 AFTER INSERT : ");
            System.out.println(list7);

            //DELETE TEST
            System.out.println("\nLIST7 AFTER DELETE : ");
            list7.deleteElement(44);
            System.out.println(list7);



        }
}
