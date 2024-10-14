package vetores.exercicios;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quantos numeros vc ira digitar: ");
        int n = scanner.nextInt();

        Integer[] vect = new Integer[n];


        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero:");
            vect[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }
    }
}
