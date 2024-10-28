package arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lendoFile {
    public static void main(String[] args) {
        File file = new File("/home/nathy/pessoal/fileReaderJava.txt");
        Scanner sc = null;

        try{
            sc = new Scanner(file);
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
