package academy.cursodejava.introducao.estruturaCondicional;

import java.util.Scanner;

public class estruturaEncadeada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hour;
        System.out.println("Digite as horas");
        hour = input.nextInt();

        if (hour <= 12) {
            System.out.println("Bom dia");
        } else if (hour < 19) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }


        input.close();
    }
}
