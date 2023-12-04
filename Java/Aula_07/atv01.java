import java.util.Scanner;

public class atv01 {
        public static void verificarIdade(short idade){
            if (idade< 18) {
                throw new ArithmeticException("Idade não permitida");
            } else{
                System.out.println("Acesso garantido.");
            }
        }
        public static void main(String[] args) {
            try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite sua idade: ");
            short idade = scanner.nextShort();
            verificarIdade(idade); //conversão direta
            
            scanner.close();
        }
            catch(Exception e){
                System.out.println("Ops! Ocorreu um erro!" + e);
            }
        }
}