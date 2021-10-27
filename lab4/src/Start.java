import java.util.Scanner;
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

        //c
//        System.out.print("Podaj napis: ");
//        String napis = scan.nextLine();
//        System.out.print("Srodkowy znak napisu: " + middle(napis));


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

    //do dokończenia
//    public static String middle(String str) {
//        String srodkowy ="";
//        StringBuffer stringbuffer = new StringBuffer(str);
//        if (stringbuffer.length()%2!=0) {
//
//
//        } else {
//
//        }
//
//        return srodkowy;
//    }

    public static String repeat(String str, int n) {
        String konkatenacja = "";
        StringBuffer stringbuffer = new StringBuffer(str);
        for(int i=0; i<=stringbuffer.length(); i++) {
            
        }


        return konkatenacja;
    }

}

