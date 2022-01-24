package pl.po.wojciech_kowalczyk;

import java.util.*;

public class TestStudent {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            String str = "";
            System.out.println("MENU: [dodaj] [usun] [zmien] [wyswietl] [exit]");
            while(!str.equals("exit")){
                System.out.println("Proszę wybrać zadanie do wykonania: ");
                str = s.nextLine();
                if(str.equals("dodaj"))
                    Map.dodaj();
                if(str.equals("usun"))
                    Map.usun();
                if(str.equals("zmien"))
                    Map.zmien();
                if(str.equals("wyswietl"))
                    Map.wyswietl();

            }
        }

        public class Map{
            static HashMap<String, String> map = new HashMap<>();

            public static void dodaj(){
                String nazwisko = nazwisko_add();
                String ocena = ocena_add();
                Student student = new Student(nazwisko,ocena);
                map.put(nazwisko,ocena);
            }
            public static void usun(){
                map.remove(nazwisko_add());
            }
            public static void zmien(){
                String nazw = nazwisko_add();
                String ocena = ocena_add();
                map.replace(nazw,ocena);
            }
            public static void wyswietl(){
                for(String k: map.keySet()){
                    System.out.println(k + ": " + map.get(k));
                }
            }
            private static String nazwisko_add(){
                Scanner s = new Scanner((System.in));
                System.out.println("Podaj nazwisko");
                String nazw = s.nextLine();
                return nazw;
            }
            private static String ocena_add(){
                Scanner s = new Scanner((System.in));
                System.out.println("Podaj ocene");
                String ocena = s.nextLine();
                return ocena;
            }
        }
}
