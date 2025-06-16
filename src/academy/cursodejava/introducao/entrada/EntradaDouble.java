package academy.cursodejava.introducao.entrada;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDouble {
    public static void main(String[] args) {
        double x;
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        x = input.nextDouble();


        System.out.printf("Voce digitou: %.2f%n", x);

        input.close();
    }
}
