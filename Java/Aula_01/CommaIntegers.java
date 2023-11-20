public class CommaIntegers {
    public static void main(String[] args) {
        int x = 5, y = 6, z = 50;
        String frase = String.format("A soma de %d + %d + %d é ", x, y, z) + (x+y+z);
        System.out.println(frase);
    }
}
