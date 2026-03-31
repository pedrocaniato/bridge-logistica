package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EncomendaComumTest {

    @Test
    void deveRetornarStatusComumComNavio() {
        MeioTransporte meio = new Navio();
        Encomenda encomenda = new EncomendaComum(meio);
        assertEquals("Encomenda COMUM: Entrega marítima de grande volume", encomenda.calcularStatus());
    }

    @Test
    void deveRetornarStatusComumComTrem() {
        MeioTransporte meio = new Trem();
        Encomenda encomenda = new EncomendaComum(meio);
        assertEquals("Encomenda COMUM: Entrega ferroviária de carga pesada", encomenda.calcularStatus());
    }
}