package academy.cursodejava.introducao.estruturaCondicional.exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A, B;
        A = input.nextInt();
        B = input.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao multiplos");
        } else {
            System.out.println("Nao sao multiplos");
        }


        input.close();
    }
}
