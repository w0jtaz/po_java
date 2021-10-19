import java.util.Scanner;
import static java.lang.Math.*;
public class Start {
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    public static void main(String[] args) {

//        //zadanie1.A
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Podaj liczbę n: ");
//        Integer n = scan.nextInt();
//        int licznik = 0;
//        int liczba = 0;
//        int wynik= 0;
//        while(licznik<n){
//            System.out.println("Podaj liczbę");
//            liczba = scan.nextInt();
//            wynik = wynik+liczba;
//            licznik++;
//        }
//        System.out.println(wynik);

//        //zadanie1.B
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Podaj liczbę n: ");
//        Integer n = scan.nextInt();
//        int licznik = 0;
//        int liczba = 0;
//        int wynik= 1;
//        while(licznik<n){
//            System.out.println("Podaj liczbę");
//            liczba = scan.nextInt();
//            wynik = wynik*liczba;
//            licznik++;
//        }
//        System.out.println(wynik);

//        //zadanie1.C
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Podaj liczbę n: ");
//        Integer n = scan.nextInt();
//        int licznik = 0;
//        int liczba = 0;
//        int wynik= 0;
//        while(licznik<n){
//            System.out.println("Podaj liczbę");
//            liczba = scan.nextInt();
//            wynik = wynik+abs(liczba);
//            licznik++;
//        }
//        System.out.println(wynik);

//        //zadanie1.D
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Podaj liczbę n: ");
//        Integer n = scan.nextInt();
//        int licznik = 0;
//        double liczba = 0;
//        double wynik= 0;
//        while(licznik<n){
//            System.out.println("Podaj liczbę");
//            liczba = scan.nextInt();
//            wynik = wynik+sqrt(abs(liczba));
//            licznik++;
//        }
//        System.out.println(wynik);

//        //zadanie1.E
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Podaj liczbę n: ");
//        Integer n = scan.nextInt();
//        int licznik = 0;
//        int liczba = 0;
//        int wynik= 1;
//        while(licznik<n){
//            System.out.println("Podaj liczbę");
//            liczba = scan.nextInt();
//            wynik = wynik*abs(liczba);
//            licznik++;
//        }
//        System.out.println(wynik);

//        //zadanie1.F
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Podaj liczbę n: ");
//        Integer n = scan.nextInt();
//        int wynik = 0;
//        int i = 0;
//        while (i<n) {
//            System.out.print("Podaj liczbę: ");
//            wynik+=Math.pow(scan.nextInt(),2);
//            i++;
//        }
//        System.out.println(wynik);

//        //zadanie1.G
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Podaj liczbę n: ");
//        Integer n = scan.nextInt();
//        int licznik = 0;
//        int liczba = 0;
//        int wynik1= 0;
//        int wynik2= 1;
//        while(licznik<n){
//            System.out.println("Podaj liczbę");
//            liczba = scan.nextInt();
//            wynik1 = wynik1+liczba;
//            wynik2 = wynik2*liczba;
//            licznik++;
//        }
//        System.out.println(wynik1);
//        System.out.println(wynik2);

//        //zadanie1.H
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Podaj liczbę n: ");
//        Integer n = scan.nextInt();
//        int wynik = 0;
//        int i = 1;
//        while (i<=n) {
//            System.out.print("Podaj liczbę: ");
//            wynik+=(scan.nextInt()*Math.pow(-1,i+1));
//            i++;
//        }
//        System.out.println(wynik);

//        //zadanie1.I
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Podaj liczbę n: ");
//        Integer n = scan.nextInt();
//        float wynik = 1;
//        int i = 1;
//        while (i<=n) {
//            System.out.print("Podaj liczbę: ");
//            wynik += (Math.pow(-1,i)*scan.nextInt())/factorial(i);
//            i++;
//        }
//        System.out.println(wynik);


//        //zadanie2.2
//        int licznik = 0;
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Podaj liczbę n: ");
//        Integer n = scan.nextInt();
//        double[] liczby = new double[n];
//        for(int i = 0; i<=liczby.length-1; i++){
//            System.out.print("Podaj liczbę: ");
//            liczby[i] = scan.nextDouble();
//            if(liczby[i] > 0)
//                licznik+=2*liczby[i];
//        }
//        System.out.println(licznik);

//        //zadanie2.3
//        int licznik = 0;
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Podaj liczbę n: ");
//        Integer n = scan.nextInt();
//        double[] liczby = new double[n];
//        int zero = 0, dodatnie = 0, ujemne = 0;
//        for(int i = 0; i<=liczby.length-1; i++){
//            System.out.print("Podaj liczbę: ");
//            liczby[i] = scan.nextDouble();
//            if(liczby[i] > 0)
//                dodatnie++;
//            if(liczby[i] < 0)
//                ujemne++;
//            if(liczby[i] == 0)
//                zero++;
//        }
//        System.out.println("Ilość liczb dodatnich: "+dodatnie);
//        System.out.println("Ilość liczb ujemnych: "+ujemne);
//        System.out.println("Ilość zer: "+zero);

        //zadanie2.4 
        double min, max;
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbę n: ");
        Integer n = scan.nextInt();
        double[] liczby = new double[n];
        for(int i = 0; i<=liczby.length-1; i++){
            System.out.print("Podaj liczbę: ");
            liczby[i] = scan.nextDouble();
        }
        min = liczby[0];
        max = liczby[0];
        for(int i = 0; i<=liczby.length-1;i++)
                if(i > 0) {
                    if (liczby[i] > max)
                        max = liczby[i];
                    if(liczby[i] < min)
                        min = liczby[i];
                }

        System.out.println("Najmniejsza liczba: "+min);
        System.out.println("Największa liczba: "+max);

        //zadanie2.5 ???

    }
}