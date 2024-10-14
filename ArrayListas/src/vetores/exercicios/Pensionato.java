package vetores.exercicios;

import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Hospede[] quartos = new Hospede[10];

        System.out.println("Digite um numero entre 1 e 10");

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome: ");
            String nome = scanner.nextLine();
            System.out.println("Digitie o email: ");
            String email = scanner.nextLine();
            System.out.println("Digite o numero do quarto: ");
            int numero = scanner.nextInt();

            if (quartos[numero] != null) {
                System.out.println("Quarto já ocupado! Escolha outro.");
                i--;
            } else {
                quartos[numero] = new Hospede(nome, email);
            }

            System.out.println("\nQuartos ocupados:");
            for (int j = 0; j < quartos.length; j++) {
                if (quartos[j] != null) {
                    System.out.println("Quarto " + j + ": " + quartos[j]);
                }
            }

            scanner.close();
        }
    }
}