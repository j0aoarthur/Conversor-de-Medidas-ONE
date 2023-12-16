package Conversores;

import java.util.HashMap;
import java.util.Map;

public abstract class Conversor {

    protected Map<String, Double> valoresMedidas;
    protected Map<String, String> formatarMedidas;
    private static Map<String, Class<? extends Conversor>> conversorMap;

    static {
        conversorMap = new HashMap<>();
        conversorMap.put("Conversor de Moeda", Moeda.class);
        conversorMap.put("Conversor de Massa", Massa.class);
        conversorMap.put("Conversor de Comprimento", Comprimento.class);
        conversorMap.put("Conversor de Capacidade", Capacidade.class);
    }

    public String converter(double valor, String origem, String destino) {

        if (origem.equals(destino)) {
            return "O valor da conversão é de " + this.formatarValor(valor, origem);
        }

        double valorOrigem = this.valoresMedidas.get(origem);
        double valorDestino = this.valoresMedidas.get(destino);

        double valorConvertido = valor * valorOrigem;
        valorConvertido /= valorDestino;

        return "O valor da conversão é de " + this.formatarValor(valorConvertido, destino);
    }

    public abstract String formatarValor(double valor, String destino);

    public String[] getOpcoesDisponiveis() {
        return this.valoresMedidas.keySet().toArray(new String[0]);
    }

    public static Conversor criarConversor(String opcao){
        Class<? extends Conversor> novaClasse = conversorMap.get(opcao);

        if (novaClasse != null) {
            try {
                return novaClasse.getDeclaredConstructor().newInstance();
            } catch (ReflectiveOperationException e ) {
                e.printStackTrace();
            }
        }
        return null;

    }

    public static String[] getOpcoesConversores() {
        return Conversor.conversorMap.keySet().toArray(new String[1]);
    }


}
