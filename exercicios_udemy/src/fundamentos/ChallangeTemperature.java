package fundamentos;

public class ChallangeTemperature {
    public static void main(String[] args) {
        int fahrenheit = 100;
        final int ADJUSTMENT = 32;
        final double FACTOR = 5 / 9.0;
        double celsius = (fahrenheit - ADJUSTMENT) * FACTOR;
        String result = String.format("%.2f", celsius);

        System.out.println("O resultado é: " + result + "°C.");
    }
}
