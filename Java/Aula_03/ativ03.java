import java.util.*;

public class ativ03 {
    public static void main(String[] args) {
        List<String> nome = new ArrayList<>();
        Scanner inputText = new Scanner(System.in);

        while (true) {
            System.out.println("Digite um texto ou escreva sair para encerrar!");
            String n1 = inputText.nextLine();
            nome.add(n1);

            if (n1.equals("sair")) {
                break;
            }
        }
        for (int i = 0; i < nome.size(); i++) {
            System.out.println("Os textos digitados foram: " + nome.get(i));
        }
        inputText.close();
    }
}
