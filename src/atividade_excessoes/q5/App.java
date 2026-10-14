package atividade_excessoes.q5;

public class App {
    static void q5() {

        String[] nomes = {"ana", null, "carlos", null, "bia"};
        for (int i = 0; i < nomes.length; i++) {
            try {
                String maiuscula = nomes[i].toUpperCase();
                System.out.println("Posição " + i + ": " + maiuscula);
            } catch (NullPointerException e) {
                System.out.println("Posição " + i + ": elemento null, não pode converter!");
            }
        }
    }
}
