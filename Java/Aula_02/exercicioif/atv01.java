package exercicioif;

import java.util.Scanner;

public class atv01 {
    public static void main(String[] args) {
        Scanner inputText = new Scanner(System.in);
        String perg = "s";

        System.out.println("Você gostaria de fazer uma soma?(s/n)");
        String resp = inputText.nextLine();

        if (resp.equals(perg)) {
            System.out.println("Digite um número: ");
            int n1 = inputText.nextInt();
            System.out.println("Digite um número: ");
            int n2 = inputText.nextInt();
            System.out.println("A soma dos números será: " + (n1 + n2));
        } else {
            System.out.println("Obrigado por usar o programa! :3");
        }
        inputText.close();
    }
}
