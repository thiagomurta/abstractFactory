package abstractfactory;

public class FabricaCasa implements FabricaAbstrata{
    @Override
    public Alugar criarPedidoAluguel() {
        return new AlugarCasa();
    }

    @Override
    public Vender criarPedidoVenda() {
        return new VenderCasa();
    }
}
