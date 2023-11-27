import java.util.*;

public class atv04 {
    public static void main(String[] args) {
        Scanner inputText = new Scanner(System.in);

        System.out.println("Você é maior de idade?(S/N)");
        String resp = inputText.nextLine();

        if (resp.equalsIgnoreCase("s")) {
            System.out.println("Você tem mais de 25 anos ?(S/N)");
            String maiorTrinta = inputText.nextLine();

            if (maiorTrinta.equalsIgnoreCase("s")) {
                System.out.println("Dirija-se para a sala 0");
            } else {
                System.out.println("Qual a sua idade?");
                int opcao = inputText.nextInt();
                switch (opcao) {
                    case 18:
                        System.out.println("Dirija-se a sala 1");break;
                    case 19:
                        System.out.println("Dirija-se a sala 2");break;
                    case 20:
                        System.out.println("Dirija-se a sala 3");break;
                    case 21:
                        System.out.println("Dirija-se a sala 4");break;
                    case 23:
                        System.out.println("Dirija-se a sala 5");break;
                    case 24:
                        System.out.println("Dirija-se a sala 6");break;
                    case 25:
                        System.out.println("Dirija-se a sala 0");break;
                    default:
                        break;
                }
            }
        } else {
            System.out.println("Você tem mais que 10 anos?(S/N)");
            String maiorDez = inputText.nextLine();
            if (maiorDez.equalsIgnoreCase("s")) {
                System.out.println("Qual a sua idade?");
                int opcao = inputText.nextInt();
                switch (opcao) {
                    case 10:
                        System.out.println("Dirija-se a sala 7");break;
                    case 11:
                        System.out.println("Dirija-se a sala 8");break;
                    case 12:
                        System.out.println("Dirija-se a sala 9");break;
                    case 13:
                        System.out.println("Dirija-se a sala 10");break;
                    case 14:
                        System.out.println("Dirija-se a sala 11");break;
                    case 15:
                        System.out.println("Dirija-se a sala 12");break;
                    case 16:
                        System.out.println("Dirija-se a sala 13");break;
                    case 17:
                        System.out.println("Dirija-se a sala 14");break;
                    default:
                        break;
                }
            } else {
                System.out.println("Acompanhe a sala de seu responsavel!");
            }
        }

        inputText.close();
    }
}
