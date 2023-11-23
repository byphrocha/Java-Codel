import java.util.*;
public class atv05 {
    public static void main(String[] args) {
        Scanner inputText = new Scanner(System.in);
        while (true) {

            System.out.println("A viagem ja acabou ? (s/n)");
            String condicional = inputText.nextLine();
            if (condicional.equals("s") || condicional.equals("S")) {
                break;
            }
            else{
                System.out.println("\nAcelerar!!");
            }
        }  
        inputText.close();
    }
}
