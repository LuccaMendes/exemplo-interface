package default_method_interface;

public class App {
    static void main() {

        VeiculoCombustao ferrari = new Ferrari();
        ferrari.abastecer();
        ferrari.acelerar();

        System.out.println("----------------------------------");

        VeiculoCombustao fusca = new Fusca();
        fusca.abastecer();
        fusca.acelerar();

        System.out.println("---------------------------------");

        VeiculoEletrico miniDolphin = new MiniDolphin();
        miniDolphin.carregar();
        miniDolphin.acelerar();
    }
}
