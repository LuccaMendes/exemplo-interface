package atividade_excessoes.q8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    static void q8() {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int quantidade = 0;
        boolean sair = false;

        while (!sair) {
            System.out.print("Digite um número inteiro (ou \"sair\"): ");
            try {
                int numero = sc.nextInt();
                soma += numero;
                quantidade++;
            } catch (InputMismatchException e) {
                String entrada = sc.next(); // pega o que foi digitado
                if (entrada.equalsIgnoreCase("sair")) {
                    sair = true;
                } else {
                    System.out.println("Erro: \"" + entrada + "\" não é um número inteiro!");
                }
            }
        }
        sc.nextLine();
        System.out.println("Foram lidos " + quantidade + " números. Soma: " + soma);
    }
}
