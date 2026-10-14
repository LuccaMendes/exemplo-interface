package atividade_excessoes.q6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    static void questao6() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Digite o primeiro número: ");
            double a = sc.nextDouble();
            System.out.print("Digite o segundo número: ");
            double b = sc.nextDouble();
            sc.nextLine();
            System.out.print("Digite a operação (+, -, *, /): ");
            String op = sc.nextLine();

            double resultado;
            switch (op) {
                case "+": resultado = a + b; break;
                case "-": resultado = a - b; break;
                case "*": resultado = a * b; break;
                case "/":
                    if (b == 0) {
                        throw new ArithmeticException("Divisão por zero");
                    }
                    resultado = a / b;
                    break;
                default:
                    throw new IllegalArgumentException("Operação inválida: " + op);
            }
            System.out.println("Resultado: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Erro: digite apenas números válidos!");
            sc.nextLine();
        } catch (ArithmeticException e) {
            System.out.println("Erro: não é possível dividir por zero!");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
