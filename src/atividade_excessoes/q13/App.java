package atividade_excessoes.q13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    static void q13() {
        Scanner sc = new Scanner(System.in);

        // Parte A: tamanho de array inválido
        try {
            System.out.print("Digite o tamanho do array: ");
            int tamanho = sc.nextInt();
            sc.nextLine();
            int[] vetor = new int[tamanho];
            System.out.println("Array criado com " + vetor.length + " posições.");
        } catch (NegativeArraySizeException e) {
            System.out.println("Erro: o tamanho do array não pode ser negativo!");
        } catch (InputMismatchException e) {
            System.out.println("Erro: digite um número inteiro!");
            sc.nextLine();
        }

        // Parte B: acesso a matriz 3x3
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        try {
            System.out.print("Digite a linha (0 a 2): ");
            int linha = sc.nextInt();
            System.out.print("Digite a coluna (0 a 2): ");
            int coluna = sc.nextInt();
            sc.nextLine();
            System.out.println("Valor: " + matriz[linha][coluna]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: linha ou coluna não existe na matriz 3x3!");
        } catch (InputMismatchException e) {
            System.out.println("Erro: digite números inteiros!");
            sc.nextLine();
        }
    }
}
