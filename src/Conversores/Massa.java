package Conversores;

import java.util.HashMap;

public class Massa extends Conversor {

    public Massa() {
        valoresMedidas = new HashMap<>();
        valoresMedidas.put("Quilograma (kg)", 1000.0);
        valoresMedidas.put("Hectograma (hg)",100.0);
        valoresMedidas.put("Decagrama (dag)",10.0);
        valoresMedidas.put("Grama (g)",1.0);
        valoresMedidas.put("Decigrama (dg)",0.1);
        valoresMedidas.put("Centigrama (cg)",0.01);
        valoresMedidas.put("Miligrama (mg)",0.001);


        formatarMedidas = new HashMap<>();
        formatarMedidas.put("Quilograma (kg)", "kg");
        formatarMedidas.put("Hectograma (hg)","hg");
        formatarMedidas.put("Decagrama (dag)","dag");
        formatarMedidas.put("Grama (g)","g");
        formatarMedidas.put("Decigrama (dg)","dg");
        formatarMedidas.put("Centigrama (cg)","cg");
        formatarMedidas.put("Miligrama (mg)","mg");
    }

    @Override
    public String formatarValor(double valor, String destino) {
        String formatoMedida = formatarMedidas.get(destino);
        return valor + " " + formatoMedida;
    }
}
