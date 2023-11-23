import java.util.Scanner;

public class atv02 {
    public static void main(String[] args) {
        Scanner inputText = new Scanner(System.in);

        System.out.println("Digite seu usuario: ");
        boolean tentativa = true;
        while (tentativa) {
            if (tentativa = true) {
                String usuario = inputText.nextLine();
                if (usuario.length() <= 0) {
                    tentativa = false;
                }
            }
        }
        inputText.close();
    }
}
