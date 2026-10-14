package excessoes;

public class NaoPodeDividirPorZeroExeption extends RuntimeException {
    public NaoPodeDividirPorZeroExeption(String message) {
        super(message);
    }
}
