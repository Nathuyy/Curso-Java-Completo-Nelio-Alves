package EstruturaSequencial;

public class Casting {
    public static void main(String[] args) {

        int a, b;
        double resultadoSemCasting;
        double resultadoComCasting;

        a = 5;
        b = 2;

        resultadoSemCasting = a / b; //sem casting vai imprimir 2.0
        resultadoComCasting = (double) a /b; //com casting

        System.out.println(resultadoSemCasting);
        System.out.println(resultadoComCasting);

    }
}
