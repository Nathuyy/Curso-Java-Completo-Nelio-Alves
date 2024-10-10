package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutos = scanner.nextInt();

        double conta = 50.0;
        if (minutos > 100) {
            conta = conta + (minutos - 100) * 2;
        }
    }
}
