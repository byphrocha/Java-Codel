package exercicioif;
import java.util.Scanner;

public class atv03 {
    public static void main(String[] args) {
        Scanner inputText = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = inputText.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade!");
        }
        else{
            System.out.println("Você é menor de idade!");
        }
        
        inputText.close();
    }
}
