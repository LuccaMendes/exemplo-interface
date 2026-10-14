package excessoes;

import java.util.Scanner;

public class ContaBancaria {

//    private double saldo // Erro de Compilação

    static void main() {

//        int [] numeros = {50, 20, 40};

//        System.out.println(numeros[5]); // Erro de Execução
//        System.out.println("Iniciou o sistema!");
//        int num1 = 10;
//        int num2 = 0;// Erro de Lógica
//        System.out.println("Parametros recebidos!");
//        System.out.println(num1 / num2); // Erro de Lógica
//        System.out.println("Calculo realizado!");
//        double n1 = 8, n2 = 6;
//        double media = n1 + n2 / 2;  // Erro de Lógica
//        System.out.println(media);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o dividendo:");
            int dividendo = sc.nextInt();

            System.out.println("Digite o divisor:");
            int divisor = sc.nextInt();

            System.out.println(calcular(dividendo, divisor));
        }
    }

    static double calcular(int n1, int n2) {
        try {
            return n1 / n2;
        } catch (Exception ex) {
            throw new NaoPodeDividirPorZeroExeption("Algo de errado aconteceu");
        } finally {
            System.out.println("Sempre será executada!");
        }
//        return 0;
    }
}

