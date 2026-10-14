package static_default_method;

public class App {
    static void main() {

        Calculadora somar = Calculadora.somar();
        System.out.println("Soma = "+ somar.calcular(5, 5));

        Calculadora multiplicar = Calculadora.multiplicar();
        System.out.println("Multiplicação = "+ multiplicar.calcular(5, 5));
    }
}
