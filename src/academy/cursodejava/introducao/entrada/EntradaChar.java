package academy.cursodejava.introducao.entrada;

import java.util.Scanner;

public class EntradaChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char x;
        x = input.next().charAt(0);

        System.out.println("Voce digitou: " +  x);

        input.close();
    }
}
