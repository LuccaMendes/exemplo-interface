package default_method_interface;

public class MiniDolphin implements VeiculoEletrico {


    @Override
    public void carregar() {
        System.out.println("Mini Dolphin carregando");
    }

    @Override
    public void acelerar() {
        System.out.println("Mini Dolphin acelerando");
    }
}
