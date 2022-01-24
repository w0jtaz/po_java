package pl.po.wojciech_kowalczyk;

import java.util.*;

public class KolejkaTest {
    public static void main(String[] args){
        System.out.println("MENU: [dodaj] [usun] [zmien] [wyswietl] [exit]");
        Scanner s = new Scanner(System.in);
        String str = "";
        while(!str.equals("exit")){
            System.out.println("Proszę wybrać zadanie do wykonania: ");
            str = s.nextLine();
            if(str.equals("dodaj"))
                Queue.zadanie_add();
            if(str.equals("nastepne"))
                Queue.zadanie_del();
            if(str.equals("wyswietl"))
                Queue.wyswietl();
        }
    }
}

class Queue{
    public static PriorityQueue<Kolejka> queue = new PriorityQueue<>();
    public static void zadanie_add() {
        String opis = opis_add();
        int priorytet = priorytet_add();
        queue.add(new Kolejka(opis,priorytet));
    }
    public static void zadanie_del(){
        queue.poll();
    }
    public static void wyswietl(){
        for(Kolejka x: queue){
            System.out.println(x.getPriorytet() + ": " + x.getOpis());
            }
        }
        private static String opis_add(){
            Scanner s = new Scanner((System.in));
            System.out.println("Podaj opis");
            String opis = s.nextLine();
            return opis;
        }
        private static int priorytet_add(){
            Scanner s = new Scanner((System.in));
            System.out.println("Podaj priorytet od 1 do 10");
            int priorytet = s.nextInt();

            return priorytet;
        }

}
