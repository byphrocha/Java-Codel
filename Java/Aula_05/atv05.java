import java.util.Scanner;

public class atv05 {
    public static void main(String[] args) {
        Scanner inputText = new Scanner(System.in);

        System.out.println("Você gostaria de programar para abrir as 20h alguma porta da casa?");
            String resp = inputText.nextLine();

            if (resp.equalsIgnoreCase("sim") || resp.equalsIgnoreCase("s")) {
                System.out.println("Escolha em qual local você gostaria de ascender a luz:\n 1) Sala\n 2) Cozinha\n 3) Quarto\n 4) Banheiro\n 5) Quintal");
                int opcao = inputText.nextInt();
                inputText.nextLine();
                switch (opcao) {
                    case 1: System.out.println("\nPorta da Sala fechada\n"); loopingPortas();break;
                    case 2: System.out.println("\nPorta da Cozinha fechada\n"); loopingPortas();break;
                    case 3: System.out.println("\nPorta do Quarto fechada\n"); loopingPortas();break;
                    case 4: System.out.println("\nPorta do Banheiro fechada\n"); loopingPortas();break;
                    case 5: System.out.println("\nPorta do Quintal fechada\n"); loopingPortas();break;

                    default:
                        break;
                }
        
        
        inputText.close();
            }
    }

    public static void loopingPortas(){
        System.out.println("Aguarde até 20hrs para abrir a porta!!");
        while (true) {
            for(int i=0;i<20;i++){
                System.out.println("Aguarde...");
                try{
                    Thread.sleep(1000);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
            System.out.println("Portas se abrindo!!");
            break;
        }
    }
}