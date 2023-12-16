package Conversores;

import java.util.HashMap;

public class Comprimento extends Conversor{

    public Comprimento() {
        valoresMedidas = new HashMap<>();
        valoresMedidas.put("Quilômetro (km)", 1000.0);
        valoresMedidas.put("Hectômetro (hm)",100.0);
        valoresMedidas.put("Decâmetro (dam)",10.0);
        valoresMedidas.put("Metro (m)",1.0);
        valoresMedidas.put("Decímetro (dm)",0.1);
        valoresMedidas.put("Centímetro (cm)",0.01);
        valoresMedidas.put("Milímetro (mm)",0.001);


        formatarMedidas = new HashMap<>();
        formatarMedidas.put("Quilômetro (km)", "km");
        formatarMedidas.put("Hectômetro (hm)","hm");
        formatarMedidas.put("Decâmetro (dam)","dam");
        formatarMedidas.put("Metro (m)","m");
        formatarMedidas.put("Decímetro (dm)","dm");
        formatarMedidas.put("Centímetro (cm)","cm");
        formatarMedidas.put("Milímetro (mm)","mm");
    }
    @Override
    public String formatarValor(double valor, String destino) {
        String formatoValor = formatarMedidas.get(destino);
        return valor + " " + formatoValor;
    }
}
