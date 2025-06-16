package academy.cursodejava.introducao.entrada.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        int cod1, cod2, num1, num2;
        double price1, price2, value;

        Scanner input = new Scanner(System.in);
        cod1 = input.nextInt();
        num1 = input.nextInt();
        price1 = input.nextDouble();

        cod2 = input.nextInt();
        num2 = input.nextInt();
        price2 = input.nextDouble();


        value = (num1 * price1) + (num2 * price2);

        System.out.println(value);

        input.close();
    }
}
