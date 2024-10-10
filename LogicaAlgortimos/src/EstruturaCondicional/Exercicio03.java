package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um numero: ");
        int numero = scanner.nextInt();
        System.out.println("Insira um outro numero: ");
        int outroNumero = scanner.nextInt();

        scanner.close();

        if (numero % outroNumero == 0){
            System.out.println("sao multiplos");
        } else {
            System.out.println("nao sao multiplos");
        }

    }
}
