package academy.cursodejava.introducao.funcoesMatematicas;

public class FuncaoPotencia {
    public static void main(String[] args) {

        double x = 3.0;
        double y = 4.0;
        double A, B, C;

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);

        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado = " + B);
        System.out.println("5 elevado ao quadrado = " + C);
    }
}
