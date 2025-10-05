package abstractfactory;

public class FabricaApartamento implements FabricaAbstrata{
    @Override
    public Alugar criarPedidoAluguel() {
        return new AlugarApartamento();
    }

    @Override
    public Vender criarPedidoVenda() {
        return new VenderApartamento();
    }
}
