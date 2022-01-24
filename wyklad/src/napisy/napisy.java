package napisy;

public class napisy {

    public static void main(String[] args) {

        String lancuch = " ";

        String message = "Hello, world!";

        int n = message.length(); //13

        System.out.println(n);
        System.out.println(message);
        System.out.println(lancuch);

        char first = message.charAt(0);  // "H"
        char last = message.charAt(12);  // "!"

        //czy kot bedzie rowny KOTowi
        boolean r = message.equals("Hello, world!");
        r = "kot".equals("KOT"); //false

        String s = message.substring(6, 13);
        System.out.println(s);

        System.out.println(s.compareTo("Hello"));

        System.out.println(" abc     ".trim() + "."); //  abc.

        System.out.println("Pingwin".equals("pingwin"));
        System.out.println("Pingwin".equalsIgnoreCase("pingwin"));

        String s1 = new String("java");
        String s2 = new String("java");
        System.out.println(s1 == s2); //false
        System.out.println(s1.equals(s2)); //true



        /* ROZNE METODY
        char charAt(int index);
        int compareTo;
        boolean endsWith;
        boolean equals
        */



    }

}
