public class atv03 {

    public static void main(String[] args) {
        int velocidadeMaxima = 100;
        int velocidadeAtual = 0; // Declare a variável aqui

        do {
            try {
                velocidadeAtual = acelerar(velocidadeAtual, 20); // Atualize a velocidade atual
                if (velocidadeAtual > velocidadeMaxima) {
                    throw new Exception("Velocidade máxima ultrapassada!");
                }
            } catch (Exception e) {
                System.out.println("Erro durante a aceleração: " + e.getMessage());
                break; // Encerra o loop em caso de erro
            } finally {
                System.out.println("Velocidade atual: " + velocidadeAtual);
            }
        } while (velocidadeAtual < 120);
    }
    
    public static int acelerar(int velocidade, int incremento) {
        System.out.println("Acelerando...");
        return velocidade + incremento; 
    }
}

