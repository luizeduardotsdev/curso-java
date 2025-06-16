package academy.cursodejava.introducao.funcoesMatematicas;

public class FuncaoAbsoluta {
    public static void main(String[] args) {
        double y = 4.0;
        double z = -5.0;
        double A, B;

        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);
    }
}
