package atividade_excessoes.q3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    static void q3() {
        Scanner sc = new Scanner(System.in);

        int[] vetor = {10, 20, 30, 40, 50};
        System.out.print("Digite o índice (0 a 4): ");
        try {
            int indice = sc.nextInt();
            sc.nextLine();
            acessarElemento(vetor, indice);
        } catch (InputMismatchException e) {
            System.out.println("Erro: o índice deve ser um número inteiro!");
            sc.nextLine();
        }
    }

    private static void acessarElemento(int[] vetor, int indice) {
    }
}
