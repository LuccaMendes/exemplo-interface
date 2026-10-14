package atividade_excessoes.q2;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class App {
    static void questao2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        String texto = sc.nextLine();

        Scanner conversor = new Scanner(texto);
        try {
            int numero = conversor.nextInt();
            System.out.println("Número convertido: " + numero);
        } catch (NoSuchElementException e) {
            System.out.println("Erro: \"" + texto + "\" não pode ser convertido para inteiro.");
        }
    }
}
