package rozne;

import java.util.Scanner;
import java.util.Arrays;
import java.math.BigInteger;

public class TestBigInteger
{

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);

        System.out.print("Podaj dowolną liczbę całkowitą: ");
        String s1 = in.next();
        BigInteger a = new BigInteger(s1);
        System.out.print("Podaj dowolną liczbę całkowitą: ");
        String s2 = in.next();
        BigInteger b = new BigInteger(s2);

        char[] aa, bb;
        int diff = s1.length() - s2.length();
        System.out.println("S1 LENGTH - S2 LENGTH IS : " + diff);

        if (diff < 0) {
            aa = new char[-diff];
            bb = new char[0];
        } else if (diff > 0) {
            aa = new char[0];
            bb = new char[diff];
        } else {
            aa = new char[0];
            bb = new char[0];
        }

        //TO JEST TO WYAKAPITOWANIA DLA RÓWNANIA POD KRESKĄ
        Arrays.fill(aa, ' ');
        Arrays.fill(bb, ' ');

//        System.out.println("aa:");
//        for(char aa_element: aa){
//            System.out.println(aa_element);
//        }
//        System.out.println("bb:");
//        for(char bb_element: bb){
//            System.out.println(bb_element);
//        }


        BigInteger c = a.add(b);

        System.out.println();
        System.out.println("   " + new String(aa) + a.toString());
        System.out.println("+  " + new String(bb) + b.toString());

        System.out.print("= ");

        if (c.toString().length() == Math.max(a.toString().length(), b.toString().length())) {
            System.out.print(" ");
        }

        System.out.println(c.toString());
    }

}


