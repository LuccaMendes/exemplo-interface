package default_method_interface;

public class Fusca implements VeiculoCombustao{


    @Override
    public void abastecer() {
        System.out.println("Fusca abastecendo");
    }

    @Override
    public void acelerar() {
        System.out.println("Fusca acelerando");
    }
}
