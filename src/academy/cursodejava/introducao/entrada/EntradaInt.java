package academy.cursodejava.introducao.entrada;

import java.util.Scanner;

public class EntradaInt {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x;
        x = input.nextInt();

        System.out.println("Voce digitou: " + x);

        input.close();
    }
}
