package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EncomendaInternacionalTest {

    @Test
    void deveRetornarStatusInternacionalComAviao() {
        MeioTransporte meio = new Aviao();
        Encomenda encomenda = new EncomendaInternacional(meio);
        assertEquals("Encomenda INTERNACIONAL: Entrega aérea rápida e prioritária", encomenda.calcularStatus());
    }

    @Test
    void deveRetornarStatusInternacionalComNavio() {
        MeioTransporte meio = new Navio();
        Encomenda encomenda = new EncomendaInternacional(meio);
        assertEquals("Encomenda INTERNACIONAL: Entrega marítima de grande volume", encomenda.calcularStatus());
    }
}