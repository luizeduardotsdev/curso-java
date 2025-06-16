package academy.cursodejava.introducao.estruturaCondicional;

import java.util.Scanner;

public class atribuicaCumulativa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int min = input.nextInt();

        double conta = 50.0;

        conta += (min - 100) * 2.0;

        System.out.printf("Valor da conta: R$ %.2f%n", conta);
        input.close();
    }
}
