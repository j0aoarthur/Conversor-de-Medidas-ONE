package GUI;

import static GUI.GUIsPrincipais.*;

public class ConversorDeMedidas {
    public static void main(String[] args) {
        while (true) {
            try {
                String opcaoEscolhida = menuPrincipal();
                double valorDigitado = inputDoValor();
                String resultadoFinal = conversaoDeMedidas(opcaoEscolhida, valorDigitado);
                mensagem(resultadoFinal);
                desejaContinuar();
            }
            catch (NullPointerException ex) {
                mensagem("Programa Finalizado");
                System.exit(0);
            }
        }
    }
}
