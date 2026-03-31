package padroesestruturais.bridge;

public class EncomendaExpressa extends Encomenda {
    public EncomendaExpressa(MeioTransporte meioTransporte) {
        super(meioTransporte);
    }

    public String calcularStatus() {
        return "Encomenda EXPRESSA: " + meioTransporte.entregar();
    }
}