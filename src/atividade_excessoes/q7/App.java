package atividade_excessoes.q7;

import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class App {
    static void q7() {
        Scanner sc = new Scanner(System.in);
        String[] valores = {"3.5", "abc", "7", "dois", "10.25", ""};
        for (int i = 0; i < valores.length; i++) {
            Scanner conversor = new Scanner(valores[i]);
            conversor.useLocale(Locale.US);
            try {
                double numero = conversor.nextDouble();
                System.out.println("\"" + valores[i] + "\" -> " + numero);
            } catch (NoSuchElementException e) {
                System.out.println("\"" + valores[i] + "\" -> não pode ser convertido!");
            }
        }
    }
}
