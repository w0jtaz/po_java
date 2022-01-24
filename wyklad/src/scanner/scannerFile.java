package scanner;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class scannerFile {

    public static void main(String[] args) throws FileNotFoundException {

        if (args.length!=1){
            System.err.println("Sposob uzycia: java TestFileScanner nazwaPliku");
            System.exit(1);
        }
        Scanner file = new Scanner(new File("TestFileScanner.java"));

        int ile = 0;

        //LICZENIE LINII
        while(file.hasNextLine()) {
            String line = file.nextLine();
            ++ile;
            System.out.println(line);
        }
        System.out.println("\n ilosc linii w pliku : " + ile + "\n");

    }

}
