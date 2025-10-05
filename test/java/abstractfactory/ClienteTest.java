package abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRetornarAluguelCasa(){
        FabricaAbstrata fabrica = new FabricaCasa();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Casa Alugada", cliente.realizarAluguel());
    }

    @Test
    void deveRetornarAluguelApartamento(){
        FabricaAbstrata fabrica = new FabricaApartamento();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Apartamento Alugado", cliente.realizarAluguel());
    }

    @Test
    void deveRetornarVendaCasa(){
        FabricaAbstrata fabrica = new FabricaCasa();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Casa Vendida", cliente.realizarVenda());
    }

    @Test
    void deveRetornarVendaApartamento(){
        FabricaAbstrata fabrica = new FabricaApartamento();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Apartamento Vendido", cliente.realizarVenda());
    }

}