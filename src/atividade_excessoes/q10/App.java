package atividade_excessoes.q10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {
    static void q10() {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        formato.setLenient(false); // não aceita datas como 32/13/2025

        System.out.print("Digite uma data (dd/MM/yyyy): ");
        String texto = sc.nextLine();
        try {
            Date data = formato.parse(texto);
            System.out.println("Data válida: " + data);
        } catch (ParseException e) {
            System.out.println("Erro: formato de data inválido! Use dd/MM/yyyy.");
        }
    }
}
