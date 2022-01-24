package tablice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class TestArrayList {

    public static void main(String[] args) {

        //ARRAYLIST --- zwykly array/tablica jest statyczna, trzeba wpisac jej wielkosc i nie mozna jej nastepnie
        // zmienic, ArrayList natomiast tworzy nam dynamiczna klase typu <Integer> albo <String> albo <Float> albo
        // obiekt innej klasy, ktory mozna nastepnie zmieniac, dodawac elementy, usuwac, bo Java za nas zmieni rozmiar
        // tej tablicy, ArrayList ma dodatkowo własne metody i tak nie mozemy sie wiec dostac do danego elementu przez
        // sam indeks, tylko trzeba uzyc funkcji lista.get(indeks), albo zeby zmienic wtedy SET ( SETTER I GETTER )
        ArrayList<Integer> lista1 = new ArrayList<>(20);
//        for(int e=0; e<20; e++){
//            lista1.add(2);
//        }
        lista1.add(0, 2);
        lista1.add(1, 4);
        lista1.add(2, 5);
        lista1.add(3, 21);
        lista1.add(4, 4);
        lista1.add(5351);
        for (Integer integer : lista1) {
            System.out.println(integer);
        }
        //LUB
        for(int i=0; i<lista1.size()-1; i++){
            System.out.println(lista1.get(i));
        }

        ArrayList<String> lista_imion = new ArrayList<>(20);
        lista_imion.add("Juzek");
        lista_imion.add("Zbazin");
        lista_imion.add("Alinka");
        lista_imion.add("Wjola");

        System.out.println("LISTA_IMION : ");
        for (String i : lista_imion) {
            System.out.println(i);
        }

        System.out.println("LISTA_IMION PO USUNIECIU WJOLI: ");
        lista_imion.remove("Wjola");
        for (String i : lista_imion) {
            System.out.println(i);
        }

        System.out.println("LISTA_IMION PO USUNIECIU ELEMENTU Z INDEKSU 0: ");
        lista_imion.remove(0);
        for (String i : lista_imion) {
            System.out.println(i);
        }

        lista_imion.set(1, "ALEJANDRO");
        System.out.println("LISTA_IMION PO ZMIANIE IMIENIA ELEMENTU INDEKSU 1 NA ALEJANDRO : ");
        for (String i : lista_imion) {
            System.out.println(i);
        }

        ArrayList<String> lista_imion_druga = lista_imion; //IN REALITY U DONT CREATE A NEW ARRAYLIST THERE, U JUST MAKE A REFERENCE THAT POINTS TO LISTA_IMION
        ArrayList<String> lista_imion_kopia = new ArrayList<>(lista_imion); //THERE U CREATE A COPY, YEP...

        lista_imion_druga.set(0, "MARYLKA"); //lista_imion does change there as well
        System.out.println(" lista imion " + lista_imion);
        System.out.println(" lista imion druga " + lista_imion_druga);
        lista_imion_kopia.set(0, "MARYLKA_KOPIA"); //lista_imion doesnt change there
        System.out.println("\n lista imion " + lista_imion);
        System.out.println(" lista imion kopia " + lista_imion_kopia);

        lista_imion = new ArrayList<>(Arrays.asList("ULA", "PEJANDRO", "PAWCIK"));
        String[] nowe_imiona = lista_imion.toArray(new String[0]);
        System.out.println("\n nowe imiona : " + Arrays.toString(nowe_imiona));

        Collections.reverse(lista_imion);
        System.out.println("\nlista imion after reverse : " + lista_imion);
        Collections.shuffle(lista_imion);
        System.out.println("lista imion after shuffle : " + lista_imion);
        Collections.sort(lista_imion);
        System.out.println("lista imion after sorting : " + lista_imion);




    }
}
