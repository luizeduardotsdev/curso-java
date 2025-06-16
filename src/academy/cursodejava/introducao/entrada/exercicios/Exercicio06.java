package academy.cursodejava.introducao.entrada.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        double A, B, C, aTriangle, aCircle, aTrapezium, aSquare, aRectangle;
        A = 3.0;
        B = 4.0;
        C = 5.2;
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();


        aTriangle = A * C / 2.0;
        aTrapezium = (A + B) / 2.0 * C;
        aCircle = 3.14 * C * C;
        aSquare = Math.pow(B, 2);
        aRectangle = A * B;

        System.out.println("TRIANGULO: " + aTriangle);
        System.out.println("CIRCULO: " + aCircle);
        System.out.println("TRAPEZIO: " + aTrapezium);
        System.out.println("QUADRADO: " + aSquare);
        System.out.println("RETANGULO: " + aRectangle);

        input.close();
    }
}
