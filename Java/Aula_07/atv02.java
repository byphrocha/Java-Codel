import java.util.*;
public class atv02 {
    public static void sairDoFilme(String sair) {
        if(sair.equalsIgnoreCase(sair)){
            throw new ArithmeticException("Saindo do filme");
        }
        else{
            System.out.println("Continuando filme");
        }
    }
    public static void verificarFilme(int tempo) {
        try{
            Thread.sleep(1000);
            System.out.println("Assistindo filme. Já se passaram: " + tempo + " segundos" );
        }
        catch(InterruptedException e){
            System.out.println("Ops! Houve algum erro...:" + e);
        }        
    }

    public static void main(String[] args) {
        try{
            int tempoFilme = 2;
            int inicio = 0;
            System.out.println("Filme iniciou...");
            Scanner scnSair = new Scanner(System.in);
            while (inicio<tempoFilme) {
                verificarFilme(inicio);
                inicio++;
                System.out.println("Deseja continuar assistindo filme? Digite\"sair\" e tecle Enter para sair");
                sairDoFilme(scnSair.nextLine().toUpperCase());
            }
            System.out.println("Fim do filme.");
            scnSair.close();
        } catch(Exception e){
            System.out.println("Ops! Ocorreu o erro" + e);
        }
    }
}
