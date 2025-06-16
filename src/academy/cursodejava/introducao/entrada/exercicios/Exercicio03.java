package academy.cursodejava.introducao.entrada.exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        int A, B, C, D, dif;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt();

        dif = (A * B - C * D);


        System.out.println("A diferença é: " + dif);

        input.close();

    }
}
