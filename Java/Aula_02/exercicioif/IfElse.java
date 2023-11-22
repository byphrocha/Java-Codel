package exercicioif;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        String vUserName = "teste";
        String vPass = "teste";
        Scanner inputText = new Scanner(System.in);

        System.out.println("Enter username");
        String userName = inputText.nextLine();

        System.out.println("Enter password");
        String pass = inputText.nextLine();

        if (vUserName.equals(userName) && vPass.equals(pass)) {
            System.out.println("Bem vindo ao sistema!");
        } else {
            System.out.println("Usuario ou senha errado!");
        }
        System.out.println("Usuario valido: " + vUserName);
        inputText.close();
    }
}
