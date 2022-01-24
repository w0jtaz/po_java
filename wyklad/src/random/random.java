package random;
import java.util.Random;

public class random {

    public static void main(String[] args) {

        Random random = new Random();
        int maks = 51;
        int losowa = random.nextInt(maks); //od 0 do 50
        System.out.println(losowa);

    }

}
