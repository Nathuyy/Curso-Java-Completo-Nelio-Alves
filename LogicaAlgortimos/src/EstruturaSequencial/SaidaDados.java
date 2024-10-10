package EstruturaSequencial;

import java.util.Locale;

public class SaidaDados {
    public static void main(String[] args) {
        double x = 12.432324555555;

        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);

        //para mudar para para ponto ao inves da virgula

        Locale.setDefault(Locale.US);
        System.out.println("imprimindo com ponto");
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
    }
}
