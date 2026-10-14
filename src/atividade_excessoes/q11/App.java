package atividade_excessoes.q11;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App {
    static void q11() {
        Scanner sc = new Scanner(System.in);

        List<String> nomes = new ArrayList<>();
        String comando = "";

        while (!comando.equals("sair")) {
            System.out.println("\nComandos: adicionar | inserir | remover | acessar | listar | sair");
            System.out.print("Comando: ");
            comando = sc.nextLine().toLowerCase();

            try {
                switch (comando) {
                    case "adicionar":
                        System.out.print("Nome: ");
                        nomes.add(sc.nextLine());
                        System.out.println("Nome adicionado!");
                        break;
                    case "inserir":
                        System.out.print("Índice: ");
                        int indiceInserir = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nome: ");
                        nomes.add(indiceInserir, sc.nextLine());
                        System.out.println("Nome inserido!");
                        break;
                    case "remover":
                        System.out.print("Índice: ");
                        int indiceRemover = sc.nextInt();
                        sc.nextLine();
                        String removido = nomes.remove(indiceRemover);
                        System.out.println("Removido: " + removido);
                        break;
                    case "acessar":
                        System.out.print("Índice: ");
                        int indiceAcessar = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Nome: " + nomes.get(indiceAcessar));
                        break;
                    case "listar":
                        System.out.println(nomes);
                        break;
                    case "sair":
                        break;
                    default:
                        System.out.println("Comando inválido!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: o índice deve ser um número inteiro!");
                sc.nextLine();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Erro: índice inválido! A lista tem " + nomes.size() + " elementos.");
            }
        }
    }
}
