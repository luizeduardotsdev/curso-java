package academy.cursodejava.introducao.entrada.exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x, y, sum;

        x = sc.nextInt();
        y = sc.nextInt();

        sum = x + y;

        System.out.println("O valor da soma : " + sum);

        sc.close();
    }
}
