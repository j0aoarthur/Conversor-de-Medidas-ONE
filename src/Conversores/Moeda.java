package Conversores;

import java.text.DecimalFormat;
import java.util.HashMap;


public class Moeda extends Conversor{

    public Moeda() {
        valoresMedidas = new HashMap<>();
        valoresMedidas.put("BRL",1.0);
        valoresMedidas.put("USD",4.92);
        valoresMedidas.put("EUR",5.39);
        valoresMedidas.put("GBP",6.27);
        valoresMedidas.put("ARS",0.00614);
        valoresMedidas.put("CLP",0.0057);

        formatarMedidas = new HashMap<>();
        formatarMedidas.put("BRL","R$");
        formatarMedidas.put("USD","$");
        formatarMedidas.put("EUR","€");
        formatarMedidas.put("GBP","£");
        formatarMedidas.put("ARS","$");
        formatarMedidas.put("CLP","$");
    }

    @Override
    public String formatarValor(double valor, String destino) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String stringValor = df.format(valor);
        String formatoMoeda = formatarMedidas.get(destino);
        return formatoMoeda + " " + stringValor;
    }
}
