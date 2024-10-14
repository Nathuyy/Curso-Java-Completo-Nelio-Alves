package matrizes;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];

        for (int  i = 0; i < n; i++) { //for para ler as linhas
            for (int j = 0; j < n; j++) {                //for para ler as colunas de cada linha
                matriz[i][j] = scanner.nextInt();
            }

        }
    }
}
