package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EncomendaExpressaTest {

    @Test
    void deveRetornarStatusExpressaComAviao() {
        MeioTransporte meio = new Aviao();
        Encomenda encomenda = new EncomendaExpressa(meio);
        assertEquals("Encomenda EXPRESSA: Entrega aérea rápida e prioritária", encomenda.calcularStatus());
    }

    @Test
    void deveRetornarStatusExpressaComCaminhao() {
        MeioTransporte meio = new Caminhao();
        Encomenda encomenda = new EncomendaExpressa(meio);
        assertEquals("Encomenda EXPRESSA: Entrega terrestre regional", encomenda.calcularStatus());
    }
}