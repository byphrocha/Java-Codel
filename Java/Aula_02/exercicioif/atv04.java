package exercicioif;
import java.util.Scanner;

public class atv04 {
    public static void main(String[] args) {
        Scanner inputText = new Scanner(System.in);
        int alturaMax = 100;
        int larguraMax = 100;
        int comprimentoMax = 100;

        System.out.println("\n\n****************PROGRAMA PARA CALCULO DE ALTURA MAXIMA DE PACOTE****************");
        
        System.out.println("Digite a altura do pacote: ");
        float alt = inputText.nextInt();
        
        System.out.println("Digite a largura do pacote: ");
        float larg = inputText.nextInt();
        
        System.out.println("Digite a comprimento do pacote: ");
        float comp = inputText.nextInt();

        if (alt <= alturaMax && larg <= larguraMax && comp <= comprimentoMax) {
            System.out.println("O pacote está dentro da altura maxima e pode ser enviado");
        }
        else{
            System.out.println("O pacote está fora da altura maxima permitida desta forma não pode ser enviado.");
        }

        inputText.close();
    }
}

