package fundamentos;

public class AreaCircunferencia {
    public static void main(String[] args) {
        double raio = 3.4;
        final double PI = 3.14159;

        final double area = PI * raio * raio;
        String result = String.format("%.2f", area);
        System.out.println("Área = " + result + "m2.");
    }
}
