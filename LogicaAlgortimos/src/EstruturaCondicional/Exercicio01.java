package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um numero: ");
        int numero = scanner.nextInt();

        scanner.close();

        if (numero < 0) {
            System.out.println("negativo");
        } else if (numero == 0){
            System.out.println("é zero");
        } else {
            System.out.println("positivo");
        }


    }
}
