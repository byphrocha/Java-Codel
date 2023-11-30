public class atv04 {
    public static void main(String[] args) {

        int[] lista = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        System.out.println("Começando Contagem:");
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
    }
}
