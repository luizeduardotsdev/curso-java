package academy.cursodejava.introducao.estruturaCondicional;

import java.util.Scanner;

public class estruraComposta {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int hour;
        System.out.println("Digite as horas");
        hour = input.nextInt();

        if (hour < 12) {
            System.out.println("Bom dia");
        } else {
            System.out.println("Boa tarde");
        }


        input.close();
    }
}
