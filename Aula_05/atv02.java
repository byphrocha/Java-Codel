import java.util.*;

public class atv02 {
    public static void main(String[] args) {
        Scanner inputText = new Scanner(System.in);

        while (true) {
            System.out.println("Você gostaria de ascender alguma luz da casa?");
            String resp = inputText.nextLine();

            if (resp.equalsIgnoreCase("sim") || resp.equalsIgnoreCase("s")) {
                System.out.println("Escolha em qual local você gostaria de ascender a luz:\n 1) Sala\n 2) Cozinha\n 3) Quarto\n 4) Banheiro\n 5) Quintal");
                int opcao = inputText.nextInt();
                inputText.nextLine();
                switch (opcao) {
                    case 1:
                        System.out.println("Luz da sala acesa!\n");break;
                    case 2:
                        System.out.println("Luz da cozinha acesa!\n");break;
                    case 3:
                        System.out.println("Luz do quarto acesa!\n");break;
                    case 4:
                        System.out.println("Luz do banheiro acesa!\n");break;
                    case 5:
                        System.out.println("Luz quintal acesa!\n");break;

                    default:
                        break;
                }
            } else {
                System.out.println("Obrigado!");
                break;
            }
        }
        inputText.close();
    }
}
