package atividade_excessoes.q4;

import java.util.Scanner;

public class App {
    static void q4() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um texto (digite \"null\" ou deixe vazio para simular uma String null): ");
        String texto = sc.nextLine();
        if (texto.equals("null") || texto.isEmpty()) {
            texto = null;
        }

        if (texto == null) {
            System.out.println("A String é null. Tentando acessar o comprimento...");
        }

        try {
            System.out.println("Comprimento: " + texto.length());
        } catch (NullPointerException e) {
            System.out.println("Erro: não é possível acessar o comprimento de uma String null!");
        }
    }

}
