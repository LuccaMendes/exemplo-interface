package atividade_excessoes.q9;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App {
    static void q9() {
        Scanner sc = new Scanner(System.in);

        List<Double> lista = new ArrayList<>();
        boolean sair = false;

        System.out.println("Digite números decimais (ou \"sair\" para calcular a média):");
        while (!sair) {
            try {
                double numero = sc.nextDouble();
                lista.add(numero);
            } catch (InputMismatchException e) {
                String entrada = sc.next();
                if (entrada.equalsIgnoreCase("sair")) {
                    sair = true;
                } else {
                    System.out.println("Valor inválido ignorado: " + entrada);
                }
            }
        }
        sc.nextLine();

        try {
            double media = calcularMedia(lista);
            System.out.println("Média: " + media);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static double calcularMedia(List<Double> lista) {
        if (lista.isEmpty()) {
            throw new IllegalArgumentException("a lista está vazia!");
        }

        double soma = 0;
        int validos = 0;
        for (Double item : lista) {
            if (item != null) { // ignora valores inválidos (null)
                soma += item;
                validos++;
            }
        }

        if (validos == 0) {
            throw new IllegalArgumentException("nenhum valor válido na lista!");
        }
        return soma / validos;
    }
}
