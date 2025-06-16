package academy.cursodejava.introducao.entrada;

import java.util.Locale;
import java.util.Scanner;

public class Entrada01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        String x;
        int y;
        double z;

        Scanner input = new Scanner(System.in);
        x = input.next();
        y = input.nextInt();
        z = input.nextDouble();

        System.out.println("Voce digitou: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        input.close();
    }
}
