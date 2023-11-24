import java.util.*;

public class atv01 {
    public static void main(String[] args) {
        Scanner inputText = new Scanner(System.in);

        while (true) {
            System.out.println("Você gostaria de fazer outra conta?(s/n)");
            String repeat = inputText.nextLine();
            
            if (repeat.equalsIgnoreCase("n") ) {
                break;
            }

            try {
                System.out.println("\n***Calculadora de massa***");

                System.out.println("Digite a densidade:");
                int densidade = inputText.nextInt();
                System.out.println("Digite o volume: ");
                int volume = inputText.nextInt();
                inputText.nextLine();
                int massa = densidade * volume;

                String formatar = String.format("Calculando a Densidade(%d) x o Volume(%d) a massa será = ", volume,densidade) + (massa) + "\n";
                System.out.println(formatar);

            } catch (Exception e) {
                System.out.println("Erro na digitação!");
            }
        }
        inputText.close();
    }
}
