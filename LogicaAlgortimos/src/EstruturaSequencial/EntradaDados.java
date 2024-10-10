package EstruturaSequencial;

import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String x = scanner.next();
        System.out.println(x);

        int y = scanner.nextInt();
        System.out.println(y);

        double z = scanner.nextDouble();
        System.out.println(z);

        scanner.close();
    }
}
