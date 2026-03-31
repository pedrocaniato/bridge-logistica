package padroesestruturais.bridge;

public class EncomendaInternacional extends Encomenda {
    public EncomendaInternacional(MeioTransporte meioTransporte) {
        super(meioTransporte);
    }

    public String calcularStatus() {
        return "Encomenda INTERNACIONAL: " + meioTransporte.entregar();
    }
}