package atividade_excessoes.q14;

import java.util.Scanner;

public class App {
    static void q14() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o telefone (9 dígitos): ");
        String telefone = sc.nextLine();
        try {
            if (telefone.length() != 9) {
                throw new IllegalArgumentException("o telefone deve ter exatamente 9 dígitos!");
            }
            for (int i = 0; i < telefone.length(); i++) {
                if (!Character.isDigit(telefone.charAt(i))) {
                    throw new IllegalArgumentException(
                            "caractere inválido \"" + telefone.charAt(i) + "\" na posição " + i + "!");
                }
            }
            System.out.println("Telefone válido!");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
