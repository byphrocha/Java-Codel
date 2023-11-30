import java.util.Scanner;

public class atv03 {
    public static void main(String[] args) {
        String[] lista = {"Banana", "Laranja", "Morango", "Tomate", "Maracuja", "Uva", "Pessego"};
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("Gostaria de usar o programa de seleção de frutas?");
            String selecao = scanner.nextLine(); 

            if (selecao.equalsIgnoreCase("s") || selecao.equalsIgnoreCase("sim")) {
                
                System.out.println("Qual fruta gostaria de selecionar ?");
                
                for(int i =0; i<lista.length; i++){
                    System.out.println((i+1) + " - " + lista[i]);
                }
                int opcao = scanner.nextInt();
                scanner.nextLine();
                
                switch(opcao) {
                case 1: System.out.println("\nA fruta escolhida foi a " + lista[opcao-1] + "!");break;
                case 2: System.out.println("\nA fruta escolhida foi a " + lista[opcao-1] + "!");break;
                case 3: System.out.println("\nA fruta escolhida foi a " + lista[opcao-1] + "!");break;
                case 4: System.out.println("\nA fruta escolhida foi a " + lista[opcao-1] + "!");break;
                case 5: System.out.println("\nA fruta escolhida foi a " + lista[opcao-1] + "!");break;
                case 6: System.out.println("\nA fruta escolhida foi a " + lista[opcao-1] + "!");break;
                case 7: System.out.println("\nA fruta escolhida foi a " + lista[opcao-1] + "!");break;
                }
            }
        else{
            System.out.println("Obrigado!!");
            continuar = false;
        }
    }
    scanner.close();    
}
}
