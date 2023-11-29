import java.util.*;
public class atv02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        Random rand = new Random();

        
        for( int i=0; i < 3; i++){
            System.out.println("Escreva os nomes a serem sorteados:");
            String nomes = scanner.nextLine();
            lista.add(nomes);
        }
        while (true) {
            
            System.out.println("Gostaria de colocar mais algum nome ?(S/N)");
            String resp = scanner.nextLine();
            if (resp.equalsIgnoreCase("s")) {
                System.out.println("Escreva os nomes a serem sorteados:");
                String nomes = scanner.nextLine();
                lista.add(nomes);    
            }
            else{
                System.out.println("O programa irá sortear uma das seguintes pessoas: " + lista);
                Collections.shuffle(lista);
                System.out.println(lista);
                int aleatorio = rand.nextInt(lista.size());
                System.out.println("E o sorteado será o: " + lista.get(aleatorio));
                break;
            }
            
        }
        scanner.close();
    }
}
