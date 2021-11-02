import java.lang.StringBuffer;
import java.util.Scanner;
import static java.lang.Character.*;

public class Start {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //a
//        System.out.print("Podaj słowo: ");
//        String slowo = scan.nextLine();
//        System.out.print("Podaj znak: ");
//        char znak = scan.next().charAt(0);
//        System.out.print("W słowie "+slowo+" znak "+znak+" występuje "+countChar(slowo, znak)+" razy");

        //b
//        System.out.print("Podaj napis(1): ");
//        String napis1 = scan.nextLine();
//        System.out.print("Podaj napis(2): ");
//        String napis2 = scan.nextLine();
//        System.out.print("W napisie " + napis1 + " napis " + napis2 + " występuje " + countSubStr(napis1, napis2) + " razy");

//        //c
//        System.out.print("Podaj napis: ");
//        String napis = scan.nextLine();
//        System.out.print("Srodkowy znak napisu: " + middle(napis));

        //d
        System.out.print("Podaj napis: ");
        String napis = scan.nextLine();
        System.out.print("Podaj liczbę: ");
        int liczba = scan.nextInt();
        System.out.print(repeat(napis, liczba));

          //e
//        System.out.print("Podaj napis: ");
//        String napis1 = scan.nextLine();
//        System.out.print("Podaj napis: ");
//        String napis2 = scan.nextLine();
//        int[] tab = where(napis1, napis2);
//        for(int i = 0; i <=tab.length-1; i++){
//            System.out.println(tab[i]);
//        }

        //f
//        System.out.print("Podaj napis: ");
//        String napis = scan.nextLine();
//        System.out.print(change(napis));

        //g


    }

    public static int countChar(String str, char c) {
        int ileRazy = 0;
        StringBuffer stringbuffer = new StringBuffer(str);
        for (int i = 0; i <= stringbuffer.length() - 1; i++) {
            if (stringbuffer.charAt(i) == c)
                ileRazy++;
        }
        return ileRazy;
    }

    public static int countSubStr(String str, String SubStr) {
        int ileRazy = 0;
        int ostatniIndex = 0;
        while (ostatniIndex != -1) {
            ostatniIndex = str.indexOf(SubStr, ostatniIndex);
            if (ostatniIndex != -1) {
                ileRazy++;
                ostatniIndex += SubStr.length();
            }
        }
        return ileRazy;
    }


    public static String middle(String str) {
        StringBuffer sb = new StringBuffer(str);
        StringBuffer newsb = new StringBuffer();
        if (sb.length()%2 == 0){
            newsb.append(sb.charAt(sb.length()/2-1)).append(sb.charAt(sb.length()/2));
        }
        if(str.length()%2 != 0){
            newsb.append(sb.charAt(sb.length()/2));
        }

        return newsb.toString();
    }

    public static String repeat(String str, int n) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i <= n-1; i++){
            sb.append(str);
        }
        return sb.toString();
    }

    public static int[] where(String str, String subStr){
        int n = countSubStr(str, subStr);
        int[] where = new int[n];
        int j = 0;
        StringBuffer sb = new StringBuffer(str);
        for(int i = 0; i <= sb.length()-1; i++){
            if((sb.length()-1) >= i+subStr.length()-1){
                String s = sb.substring(i, i+subStr.length());
                if(s.equals(subStr)) {
                    where[j] = i;
                    j++;

                }
            }
        }
        return where;
    }

    public static String change(String str){
        StringBuffer changed = new StringBuffer();
        StringBuffer sb = new StringBuffer(str);
        for(int i = 0; i <=sb.length()-1; i++) {
            if (isLowerCase(sb.charAt(i)))
                changed.append(toUpperCase(sb.charAt((i))));
            if(isUpperCase(sb.charAt(i)))
                changed.append(toLowerCase(sb.charAt(i)));
        }
        return changed.toString();
    }

}

