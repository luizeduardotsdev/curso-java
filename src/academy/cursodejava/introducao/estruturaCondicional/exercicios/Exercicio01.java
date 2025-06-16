package academy.cursodejava.introducao.estruturaCondicional.exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        x = input.nextInt();

        if (x >= 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }

        input.close();
    }
}
