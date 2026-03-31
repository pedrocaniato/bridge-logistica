package padroesestruturais.bridge;

public class EncomendaComum extends Encomenda {
    public EncomendaComum(MeioTransporte meioTransporte) {
        super(meioTransporte);
    }

    public String calcularStatus() {
        return "Encomenda COMUM: " + meioTransporte.entregar();
    }
}