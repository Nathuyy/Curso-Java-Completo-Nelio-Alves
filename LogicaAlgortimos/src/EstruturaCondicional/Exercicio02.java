package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um numero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("é par");
        } else {
            System.out.println("é impar");
        }
    }
}