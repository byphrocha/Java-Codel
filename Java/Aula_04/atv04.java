public class atv04 {
    public static void main(String[] args) {
        try{
        long num = 35000; // Valor fora do intervalo do short
        throw new NumberFormatException("O valor do short possui vírgula: " + num + ",0");

        } catch (NumberFormatException e) {
            System.out.println("Ocorreu um erro ao imprimir o short: " + e.getMessage());
        }
    }
}
