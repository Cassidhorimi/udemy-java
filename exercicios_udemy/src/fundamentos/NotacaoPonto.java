package fundamentos;

import java.util.Locale;

public class NotacaoPonto {
    public static void main(String[] args) {
        String s = "Teste teste";

        System.out.println(s.toUpperCase());
        System.out.println(s.replace("teste", "test"));
        System.out.println(s.concat("!!!"));
        System.out.println("Ola".concat(" mundo!!"));
        System.out.println(s
                .replace("teste", "udemy")
                .concat(" teste".toUpperCase()));
    }
}
