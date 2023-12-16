package GUI;

import Conversores.Conversor;

import javax.swing.*;

public class GUIsPrincipais {

    public static String menuPrincipal() {
        String[] conversoesDisponiveis = Conversor.getOpcoesConversores();
        Object selectedValue = JOptionPane.showInputDialog(null,
                "Escolha uma opção", "Menu",
                JOptionPane.PLAIN_MESSAGE, null,
                conversoesDisponiveis, conversoesDisponiveis[0]);

        if (selectedValue == null) throw new NullPointerException();

        return selectedValue.toString();
    }

    public static void mensagemDeErro() {
        JOptionPane.showMessageDialog(null,
                "Valor Inválido", "Erro", JOptionPane.ERROR_MESSAGE);
    }

    public static double inputDoValor() {
        String inputValor = JOptionPane.showInputDialog(null,
                "Insira um valor:","Input", JOptionPane.QUESTION_MESSAGE);
        try {
            return Double.parseDouble(inputValor);
        } catch (NumberFormatException e) {
            mensagemDeErro();
            return inputDoValor();
        }
    }

    public static String conversaoDeMedidas(String conversaoEscolhida, double valorDigitado) {
        Conversor medidaEscolhida = Conversor.criarConversor(conversaoEscolhida);
        String[] opcoesDisponiveis = medidaEscolhida.getOpcoesDisponiveis();

        Object opcaoOrigem = JOptionPane.showInputDialog(null,
                "Escolha a unidade de origem da sua conversão:", conversaoEscolhida,
                JOptionPane.PLAIN_MESSAGE, null, opcoesDisponiveis, opcoesDisponiveis[0]);

        if (opcaoOrigem == null) throw new NullPointerException();

        Object opcaoDestino = JOptionPane.showInputDialog(null,
                "Escolha a unidade de destino da sua conversão:", conversaoEscolhida,
                JOptionPane.PLAIN_MESSAGE, null, opcoesDisponiveis, opcoesDisponiveis[0]);

        if (opcaoDestino == null) throw new NullPointerException();

        return medidaEscolhida.converter(valorDigitado, opcaoOrigem.toString(), opcaoDestino.toString());
    }

    public static void mensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "Mensagem", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void desejaContinuar() {
        int selectedOption = JOptionPane.showConfirmDialog(null,
                "Deseja Continuar?", "Escolha uma opção",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (selectedOption == JOptionPane.YES_OPTION) {
            return;
        }
        else if (selectedOption == JOptionPane.NO_OPTION) {
            throw new NullPointerException();
        }
        else {
            mensagem("Programa Concluído");
        }
        System.exit(0);
    }
}
