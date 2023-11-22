package exercicioif;

import java.util.Scanner;

public class atv02 {
    public static void main(String[] args) {
        Scanner inputText = new Scanner(System.in);

        System.out.println("Digite alguma coisa: ");
        String teste = inputText.nextLine();

        boolean temNumero = false;

        for (int i = 0; i < teste.length(); i++) {
            if (Character.isDigit(teste.charAt(i))) {
                temNumero = true;
                break; // Se encontrou um número, não precisa continuar verificando
            }
        }

        if (temNumero) {
            System.out.println("A entrada contém números.");
        } else {
            System.out.println("A entrada não contém números.");
        }

        inputText.close();
    }
}