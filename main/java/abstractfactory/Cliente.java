package abstractfactory;

public class Cliente {
    private Alugar aluguel;
    private Vender venda;

    public Cliente(FabricaAbstrata fabrica){
        this.aluguel = fabrica.criarPedidoAluguel();
        this.venda = fabrica.criarPedidoVenda();
    }

    public String realizarVenda(){
        return this.venda.vender();
    }

    public String realizarAluguel(){
        return this.aluguel.alugar();
    }
}
