package academy.cursodejava.introducao.entrada;

import java.util.Scanner;

public class EntradaString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String x;
        x = input.next();

        System.out.println("Voce digitou: " + x);

        input.close();
    }
}
