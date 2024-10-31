package interfaces.comparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) throws IOException {
        List<Funcionario> listname = new ArrayList<>();
        String path = "/home/nathy/pessoal/fileReader.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String funcionarioCsv = br.readLine();
            while (funcionarioCsv != null){
                String[] fields = funcionarioCsv.split(",");
                listname.add(new Funcionario(fields[0], Double.parseDouble(fields[1])));
                funcionarioCsv = br.readLine();
            }

            Collections.sort(listname);

            for (Funcionario funcionario : listname){
                System.out.println(funcionario.getName() + funcionario.getSalary());
            }
        }
    }
}
