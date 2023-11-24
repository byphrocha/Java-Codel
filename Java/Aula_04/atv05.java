public class atv05 {
    public static void main(String[] args) {
        int contador = 0;

        while (contador < 5) {
            try {
                if (contador == 3) {
                    throw new Exception("Erro proposital no contador 3!");
                }
                System.out.println("Contador: " + contador);
                contador++;
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
                contador++; // Incrementa o contador para evitar loop infinito
            }
        }
    }
}
