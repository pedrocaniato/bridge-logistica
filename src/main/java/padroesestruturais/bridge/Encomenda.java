package padroesestruturais.bridge;

public abstract class Encomenda {
    protected MeioTransporte meioTransporte;

    public Encomenda(MeioTransporte meioTransporte) {
        this.meioTransporte = meioTransporte;
    }

    public void setMeioTransporte(MeioTransporte meioTransporte) {
        this.meioTransporte = meioTransporte;
    }

    public abstract String calcularStatus();
}