package Conversores;

import java.util.HashMap;

public class Capacidade extends Conversor {
    public Capacidade() {
        valoresMedidas = new HashMap<>();
        valoresMedidas.put("Quilolitro (kl)", 1000.0);
        valoresMedidas.put("Hectolitro (hl)",100.0);
        valoresMedidas.put("Decalitro (dal)",10.0);
        valoresMedidas.put("Litro (l)",1.0);
        valoresMedidas.put("Decilitro (dl)",0.1);
        valoresMedidas.put("Centilitro (cl)",0.01);
        valoresMedidas.put("Mililitro (ml)",0.001);


        formatarMedidas = new HashMap<>();
        formatarMedidas.put("Quilolitro (kl)","kl");
        formatarMedidas.put("Hectolitro (hl)","hl");
        formatarMedidas.put("Decalitro (dal)","dal");
        formatarMedidas.put("Litro (l)","l");
        formatarMedidas.put("Decilitro (dl)","dl");
        formatarMedidas.put("Centilitro (cl)","cl");
        formatarMedidas.put("Mililitro (ml)","ml");
    }

    @Override
    public String formatarValor(double valor, String destino) {
        String formatoValor = formatarMedidas.get(destino);
        return valor + " " + formatoValor;
    }
}
