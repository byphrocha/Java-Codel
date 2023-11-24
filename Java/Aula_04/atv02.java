import java.util.*;

public class atv02 {
    public static void main(String[] args) {
        Scanner inputText = new Scanner(System.in);
        try {

            System.out.println("******Calculadora de área em metro quadrado******");

            System.out.println("Digite o comprimento: ");
            float comprimento = inputText.nextFloat();
            System.out.println("Digite a largura ou digite 0 para mostrar o catch; ");
            float largura = inputText.nextFloat();
            float areaQua = largura * comprimento;
            System.out.println("O resultado é: " + areaQua);
            
        } catch (ArithmeticException e ) { // Captura uma exceção específica (divisão por zero)
            System.out.println("Erro: Divisão por zero!");
            
        }
        finally{
           inputText.close();
       }
    }
}