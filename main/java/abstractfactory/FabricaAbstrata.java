package abstractfactory;

public interface FabricaAbstrata {
    Alugar criarPedidoAluguel();
    Vender criarPedidoVenda();
}
