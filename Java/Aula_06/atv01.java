import java.util.*;

public class atv01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        while (true) {
            System.out.println("Gostaria de verificar cores?(S/N)");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("sim")) {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Escreva 5 cores: ");
                    String cores = scanner.nextLine();
                    lista.add(cores);
                }

                System.out.println("\nAs cores digitadas foram:");

                for (int i = 0; i < 5; i++) {
                    System.out.println(" - " + lista.get(i));
                }
            } else {
                System.out.println("Obrigado por usar o Programa de verificação de cores.");
                break;
            }
        }
        scanner.close();
    }
}
