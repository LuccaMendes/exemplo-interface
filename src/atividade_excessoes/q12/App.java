package atividade_excessoes.q12;

import java.util.Scanner;

public class App {
    static void q12() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o CPF (somente 11 números): ");
        String cpf = sc.nextLine();
        try {
            validarCpf(cpf);
            System.out.println("CPF com formato válido!");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static void validarCpf(String cpf) {
        if (cpf.length() != 11) {
            throw new IllegalArgumentException("o CPF deve ter 11 dígitos!");
        }
        for (int i = 0; i < cpf.length(); i++) {
            if (!Character.isDigit(cpf.charAt(i))) {
                throw new IllegalArgumentException("o CPF deve conter apenas números!");
            }
        }
    }
}
