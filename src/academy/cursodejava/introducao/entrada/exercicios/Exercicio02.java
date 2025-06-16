package academy.cursodejava.introducao.entrada.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {


        double area, raio;
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        raio = input.nextDouble();

        area = 3.14 * Math.pow(raio, 2);

        System.out.println("O valor da area : " + area);

        input.close();
    }
}
