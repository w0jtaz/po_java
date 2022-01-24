package scanner;
import java.util.Scanner;
import java.lang.Math;

public class scanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Podaj liczbe rzeczywista:  ");
        double x1 = input.nextDouble();

        System.out.println("Podaj liczbe calkowita:  ");
        int x2 = input.nextInt();

        System.out.println("x1 ^ x2 = " + Math.pow(x1, x2));

        System.out.println("SCANNER SUMA :\n");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = 0;
        int suma = 0;
        while (a != n) {
            a++;
            int an = scan.nextInt();
            suma = suma + an;
        }
        System.out.println(suma);

    }


}
