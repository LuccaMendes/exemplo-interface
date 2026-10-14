package atividade_excessoes.q1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    static void main() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o dividendo:");
            int dividendo = sc.nextInt();

            System.out.println("Digite o divisor:");
            int divisor = sc.nextInt();

            int resultado = dividendo / divisor;
            System.out.println("Resultado: " + resultado);
        }catch(InputMismatchException e) {
            System.out.println("Você deve digitar números inteiros!");
        }catch(ArithmeticException e) {
            System.out.println("Não é possivel dividir por zero!");
        }
    }
}
