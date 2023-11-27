import java.util.*;
public class atv01 {
    public static void main(String[] args) {
        Scanner inputText = new Scanner(System.in);
        String corReset = "\u001B[0m";

        System.out.println("Escolha a cor que gostaria ver o texto:\n 1) Vermelho\n 2) Laranja\n 3) Cinza\n 4) Azul\n 5) Roxo");
        int opcao = inputText.nextInt();

        switch (opcao) {
            case 1: System.out.println("\u001B[31m" + "Texto colorido" + corReset); break;    
            case 2: System.out.println("\u001B[32m" + "Texto colorido" + corReset); break;   
            case 3: System.out.println("\u001B[35m" +"Texto colorido" + corReset); break;
            case 4: System.out.println("\u001B[34m" + "Texto colorido" + corReset); break;
            case 5: System.out.println("\u001B[33m" + "Texto colorido" + corReset); break;

            default:
                break;
        }
    inputText.close();
    }
}
