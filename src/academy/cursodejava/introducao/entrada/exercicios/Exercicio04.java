package academy.cursodejava.introducao.entrada.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        double hours, salPerhour, sal;
        int number;

        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        hours = input.nextDouble();
        salPerhour = input.nextDouble();



        sal = hours * salPerhour;

        System.out.println(number);
        System.out.println("O salario é de : " + sal);

        input.close();
    }
}
