import java.util.*;
public class atv05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        System.out.println("***Cadastro de um inventario de Pijama***");

        for(int i = 0;i<3; i++){
            System.out.println("Digite o item:");
            String pijama = scanner.nextLine();
            lista.add(pijama);
        }

        while (true) {
            System.out.println("Gostaria de adicionar mais valores?(s/n)");
            String opcao = scanner.nextLine();
            if(opcao.equalsIgnoreCase("s") || opcao.equalsIgnoreCase("sim")){
                System.out.println("Digite o item:");
                String itmPijama = scanner.nextLine();
                lista.add(itmPijama);
            }
            else{
                System.out.println("Obrigado por usar o programa!");
                break;
            }
            }
        System.out.println("\nForam adicionados os itens:\n");    
        for(int i =0; i<lista.size(); i++){
            System.out.println(lista.get(i));
            }
        scanner.close();    
    }
    }

