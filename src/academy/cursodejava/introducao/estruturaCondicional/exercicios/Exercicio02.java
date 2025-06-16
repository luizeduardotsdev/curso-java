package academy.cursodejava.introducao.estruturaCondicional.exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        x = input.nextInt();

        if (x % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }

        input.close();
    }
}
