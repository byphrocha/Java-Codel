import java.util.Scanner;

public class atv03 {
    public static void main(String[] args) {
      Scanner inputText = new Scanner(System.in);

        while (true) {
            System.out.println("Você gostaria de cômodo algum ventilador da casa?");
            String resp = inputText.nextLine();

            if (resp.equalsIgnoreCase("sim") || resp.equalsIgnoreCase("s")) {
                System.out.println(
                        "Escolha em qual local você gostaria de ligar qual ventilador:\n 1) Sala\n 2) Cozinha\n 3) Quarto\n 4) Banheiro\n 5) Quintal");
                int opcao = inputText.nextInt();
                inputText.nextLine();
                switch (opcao) {
                    case 1:
                        System.out.println("Ventilador da sala ligado!\n");break;
                    case 2:
                        System.out.println("Ventilador da cozinha ligado!\n");break;
                    case 3:
                        System.out.println("Ventilador do quarto ligado!\n");break;
                    case 4:
                        System.out.println("Ventilador do banheiro ligado!\n");break;
                    case 5:
                        System.out.println("Ventilador quintal ligado!\n");break;

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
